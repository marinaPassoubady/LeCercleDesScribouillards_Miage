package com.example.project.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.controllers.Signin;


public class SignInTest {

	
	@InjectMocks
	private Signin signincontroller;

	@Before 
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void signinTest() throws Exception {
		assertNotNull(signincontroller.signin());
		
		ModelAndView mav= signincontroller.signin();
		assertEquals("connexion",mav.getViewName());
	}
	
	@Test
	public void signinProceedTest() {
		
	}

}