package com.fssa.barath.day19.solved;

//UserValidator Class is used for validating a user object data and return true if everything matches the validation. 

public class UserValidator {
public static boolean validate(User user) throws IllegalArgumentException {

	if (user.getId() <= 0) {
		throw new IllegalArgumentException("The User id should be a postive number");
	}
	if (user.getName().length() < 2) {
		throw new IllegalArgumentException("The User Name should not be less than 2 characters");
	}
	if (!EmailAddressVerification.verifyEmail(user.getEmail())) {
		throw new IllegalArgumentException("Enter a valid Email !");
	}
	if (!PasswordValidation.validatePassword(user.getPassword())) {
		throw new IllegalArgumentException("Enter Strong password");
	}
	System.out.println("The user details are Successfully Verified !");
	return true;
}
}
