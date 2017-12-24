package com.example.project.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.TestPropertySource;

import com.example.project.controllers.Signin;

@TestPropertySource("constante.properties")
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
	}

}
