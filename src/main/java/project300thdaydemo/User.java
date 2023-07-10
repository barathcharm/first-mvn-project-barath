package project300thdaydemo;

public class User {

	public static void main(String[] args) {

		UserTransactions userTransactions1 = new UserTransactions();

		double income =100;
		double expense=0;

		userTransactions1.addIncome(income);
		userTransactions1.addExpense(expense);
		userTransactions1.addIncome(200);
		

		System.out.println("Total balance is "+userTransactions1.getBalance());
		

	}
}