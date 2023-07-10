package project300thdaydemo;

import java.util.ArrayList;

public class UserTransactions {

	private double balance = 0;
	ArrayList<Double> incomeAmountDatas = new ArrayList<Double>();
	ArrayList<Double> expenseAmountDatas = new ArrayList<Double>();

	public double addIncome(double amount) {
		try { 
			addIncomeValidator(amount);
		   	balance += amount; 
			incomeAmountDatas.add(amount);
		   	System.out.println("The Income has been successfully added Rs - "+amount);
			return balance;
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return amount; 
	}

	public double addExpense(double amount) {
		try {
			addExpenseValidator(amount);
			balance -= amount;
			expenseAmountDatas.add(amount);
			System.out.println("The expense has been successfully added Rs - "+amount);
			return balance;
		}catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return amount; 
	}

	public double getBalance() {
		return balance;
	}
	
	public void clearBalance() {
		balance=0.0;
	}
	
	public ArrayList<Double> getIncomeHistory() {
		return incomeAmountDatas;
	}
	
	public ArrayList<Double> getExpenseHistory() {
		return expenseAmountDatas;
	}
	 
 
	public boolean addIncomeValidator(double amount) throws IllegalArgumentException {
		if (amount <= 0) {
			throw new IllegalArgumentException("The income should be greater than zero!");

		}
		return true;
	}
	public boolean addExpenseValidator(double amount) throws IllegalArgumentException {
		if (amount > balance) {
			throw new IllegalArgumentException("The Expense overtakes the balance amount!");

		}
		else if(amount==0) {
			throw new IllegalArgumentException("Enter Expenses greater than zero!");
		};
		return true;
	}
	
}
