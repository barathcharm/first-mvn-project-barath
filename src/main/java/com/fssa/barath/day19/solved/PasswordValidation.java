package com.fssa.barath.day19.solved;

import java.util.Scanner;


public class PasswordValidation {
	
	public static boolean validatePassword(String pass) {
		boolean upCase = false, loCase = false, spChar = false, num = false;
		for (char e : pass.toCharArray()) {
			if (Character.isDigit(e)) {
				num = true;
			} else if (Character.isUpperCase(e)) {
				upCase = true;
			} else if (Character.isLowerCase(e)) {
				loCase = true;
			} else if (Character.isWhitespace(e)) {
				// Nothing needs to happen
			} else {
				spChar = true;
			}

		}
		if (upCase && loCase && spChar && num && (pass.length() >= 8)) {
			System.out.println("Your password is validated Successfully");
			return true;
		} else if (pass.length() < 8) {
			System.out.println("Password should contain atleast 8 characters.");
			return false;
		} else {
			System.out.println("A valid password should contain at least one uppercase letter, "
					+ "one lowercase letter, one digit, and one special character and min length of 8 characters");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the password to validate");
		String pass = scan.next();
		PasswordValidation.validatePassword(pass);
		
	}
}
