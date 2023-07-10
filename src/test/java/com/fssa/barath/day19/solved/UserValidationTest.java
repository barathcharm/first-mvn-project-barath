package com.fssa.barath.day19.solved;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.fssa.barath.day19.solved.*;

public class UserValidationTest {
	User user = new User();
	@Test
	public void testId() {
		try {
			user.setId(2);
			Assertions.assertEquals(2,user.getId());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	@Test
	public void testName() {
		try {
			user.setName("Barath");
			Assertions.assertEquals("Barath",user.getName());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}	@Test
	public void testPassword() {
		try {
			user.setPassword("Barath@123");
			Assertions.assertEquals("Barath@123",user.getPassword());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}	@Test
	public void testEmail() {
		try {
			user.setEmail("barath@gmail.com");
			Assertions.assertEquals("barath@gmail.com",user.getEmail());
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	public void testValidation() {
		try {
			;
			Assertions.assertEquals(true,UserValidator.validate(user));
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	public void testEmailValidation() {
		try {
			;
			Assertions.assertEquals(true,EmailAddressVerification.verifyEmail("Barath@gmail.com"));
			
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
	}
	
}
