package com.example.project.config;

import java.util.Collections;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.validation.DataBinder;

import com.example.project.entities.User;
import com.example.project.service.BlogService;
import com.example.project.validators.UserConnexionValidator;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{
	
	@Autowired
	UserConnexionValidator validator;
	
	@Autowired 
	BlogService blogService;
	
	
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException {
		String username = auth.getName();
        String password = auth.getCredentials().toString();
        User user = new User();
        user.setEmail(username);
        user.setPassword(password);
        DataBinder dataBinder = new DataBinder(user);
        dataBinder.setValidator(validator);
        dataBinder.validate();
        if (!dataBinder.getBindingResult().hasErrors()) {
        	UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken
            (username, password, Collections.emptyList());
        	token.setDetails(validator.getFinalUser());
            return token;
        } else {
            throw new
              BadCredentialsException(dataBinder.getBindingResult().getAllErrors().get(0).getCode());
        }
	}

	@Override
	public boolean supports(Class<?> auth) {
		return auth.equals(UsernamePasswordAuthenticationToken.class);
	}
}