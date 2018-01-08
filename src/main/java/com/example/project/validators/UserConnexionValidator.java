package com.example.project.validators;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.example.project.entities.User;
import com.example.project.service.BlogService;


@Component
public class UserConnexionValidator implements Validator{

	@Autowired 
	BlogService blogService;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	User finalUser = null;
	
	@Override
	public boolean supports(Class<?> obj) {
		return User.class.equals(obj);
	}

	@Override
	public void validate(Object obj, Errors err) {
		User user = (User) obj;		
		if(user.getEmail().equals("") || user.getPassword().equals("")) {
		 if(user.getEmail().equals("")) err.rejectValue("email", "inexists","Les champs de doivent pas etre vides ! ");
		 if(user.getPassword().equals("")) err.rejectValue("password", "inexists","Les champs de doivent pas etre vides !");
		 System.out.println(err.getObjectName());
		}
		else {
			finalUser = blogService.findUserByEmail(user.getEmail());
			if(finalUser == null ) {
				err.rejectValue("email", "email.inexists","L'email n'existe pas !");
			}
			else {
				if(!passwordEncoder.matches(user.getPassword(), finalUser.getPassword())) {
					err.rejectValue("password", "password.incorrect","Mot de passe incorrect !");
				}
				
			}
	
		}
	
	}
	
	public User getFinalUser() {
		return finalUser;
	}


}
