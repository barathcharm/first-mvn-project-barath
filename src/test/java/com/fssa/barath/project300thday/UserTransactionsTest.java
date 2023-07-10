package com.fssa.barath.project300thday;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import project300thdaydemo.UserTransactions;

public class UserTransactionsTest {

	UserTransactions userTransactions = new UserTransactions();

	@Test
	public void testValidaddIncome() {
		// Test case 1: Valid positive income 

		double initialIncome = 0; 
		double amountToAdd = 500.0;
		double expectedIncome = initialIncome + amountToAdd;
		double actualIncome = userTransactions.addIncome(amountToAdd);
		Assertions.assertEquals(expectedIncome, actualIncome);
	}

	@Test
	public void testInvalidaddIncome() {
		// Test case 2: Valid negative expense
		double initialIncome = 0;
		double amountToAdd = -200.0;
		String expectedMessage = "The income should be greater than zero!";
		try {
			 userTransactions.addIncome(amountToAdd);
		}catch(IllegalArgumentException e){
			assertNotEquals(expectedMessage, e.getMessage());
		}
		
	}

	@Test
	public void testNulladdIncome() {
		// Test case 3: expense value 0
		double initialIncome = 0;
		double amountToAdd = 0;
		double expectedIncome = initialIncome + amountToAdd;
		double actualIncome = userTransactions.addIncome(amountToAdd);
		assertEquals(expectedIncome, actualIncome);
	} 

	@Test
	public void testValidAddExpense() {

		// Test case 1: Valid positive expense
		double initialBalance = 1000.0;
		double amountToDeduct = 500.0;
		userTransactions.clearBalance();
		userTransactions.addIncome(initialBalance);
		double expectedBalance = initialBalance - amountToDeduct;
		double actualBalance = userTransactions.addExpense(amountToDeduct);
		assertEquals(expectedBalance, actualBalance);
	}

	@Test
	public void testInvalidAddExpense() {
		// Test case 2: InValid  expense
		double initialBalance = 1000.0;
		double amountToDeduct = -200.0;
		userTransactions.clearBalance();
		userTransactions.addIncome(initialBalance);

		String expectedMessage = "Enter Expenses greater than zero!";
		try {
			userTransactions.addExpense(amountToDeduct);
		}catch(IllegalArgumentException e){
			assertNotEquals(expectedMessage, e.getMessage());
		}
	}
	
	@Test
	public void testNullAddExpense() {
		// Test case 3: InValid  expense
		double initialBalance = 1000.0;
		double amountToDeduct = 0;
		userTransactions.clearBalance();
		userTransactions.addIncome(initialBalance);
		double expectedBalance = initialBalance - amountToDeduct;
		double actualBalance = userTransactions.addExpense(amountToDeduct);
		assertNotEquals(expectedBalance, actualBalance);
	}
	
	@Test
	public void testAddIncomeValidator() {
		
		double incomeAmount=0;
		String expectedMessage="The income should be greater than zero!";
		try {
			userTransactions.addIncomeValidator(incomeAmount);	
		}catch(IllegalArgumentException e) {
			assertEquals(expectedMessage, e.getMessage());
		}
	
	}
	
	@Test
	public void testAddExpenseValidator1() {
		
		double expenseAmount=0;
		String expectedMessage="Enter Expenses greater than zero!";
		try {
			userTransactions.addExpenseValidator(expenseAmount);	
		}catch(IllegalArgumentException e) {
			assertEquals(expectedMessage, e.getMessage());
		}
	
	}
	
	@Test
	public void testAddExpenseValidator2() {
		
		userTransactions.clearBalance();
		userTransactions.addIncome(500);
		double expenseAmount=1000;
		String expectedMessage="The Expense overtakes the balance amount!";
		try {
			userTransactions.addExpenseValidator(expenseAmount);	
			Assertions.fail("The Expense overtakes the balance amount!");
		}catch(IllegalArgumentException e) {
			assertEquals(expectedMessage, e.getMessage());
		}
	
	}
	
	@Test
	
	public void testClearBalance() {
		
		userTransactions.addIncome(100);
		userTransactions.clearBalance();
		double expectedBalance=0;
		assertEquals(expectedBalance, userTransactions.getBalance());
	}
	

}
