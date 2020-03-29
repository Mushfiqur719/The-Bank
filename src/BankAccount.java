import java.io.Serializable;

public class BankAccount implements Serializable{
	String memberName;
	String accountNumber;
	double accountBalance,minimumBalance;
	
	public BankAccount(String name,double accBal, double minBal) {
		this.memberName = name;
		this.accountBalance = accBal;
		this.minimumBalance = minBal;
		String num = 10000 + (int)(Math.random()*89999)+ "";
		this.accountNumber = num;
	}
	
	void deposit(double amount) {
		accountBalance += amount;
	}
	
	void withdraw(double amount) {
		if(accountBalance-amount >= minimumBalance)
			accountBalance -= amount;
	}
	
	double getBalance() {
		return accountBalance;
	}
	
	void display() {
		System.out.println("Name : "+memberName);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Balance : "+accountBalance);
	}

	@Override
	public String toString() {
		return "Name : [ " + memberName + " ] ;	Account No.  : [ " + accountNumber + " ] ;	Balance : [ "
				+ accountBalance + " TK	] ; Account Type : [ "+this.getClass().getName()+" ]";
	}
	
	
}
