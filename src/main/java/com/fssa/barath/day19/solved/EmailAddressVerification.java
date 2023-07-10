package com.fssa.barath.day19.solved;

import java.util.Scanner;


public class EmailAddressVerification {

	public static boolean verifyEmail(String email) throws IllegalArgumentException{
		if (email.contains("@") && email.contains(".")) {
			return true;
		} else {
			throw new IllegalArgumentException("Enter a valid email address");
			
		}
	} 

public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	boolean check=false;
	do {
		
		System.out.println("Enter your email address:");
		String email= scan.next();
		check= EmailAddressVerification.verifyEmail(email);
		if(!check) {
			System.out.println("Enter a valid email address:");
		}
		
	
	}while(!check);
	scan.close();
	System.out.println("Success! Your email is successfully verified.");
	
}
}
