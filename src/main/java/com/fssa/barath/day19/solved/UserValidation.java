package com.fssa.barath.day19.solved;


//	 main method - where user datas are set and validated.
public class UserValidation {
	public static void main(String[] args) {

//		Creating a instance of an object
		User user1 = new User();

//		Setting value to the user using the user class methods.
		user1.setName("Barath");
		user1.setPassword("Barath@123");
		user1.setEmail("Barathgmail.com");
		user1.setId(1);

//		Validating the datas of the user by passing the user object to the UserValidator.validate method().
		try {
			UserValidator.validate(user1);

		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
}
