import java.io.Serializable;

public class SavingsAccount extends BankAccount implements Serializable{
	double interest = 0.05;
	double maxWithLimit;
	
	public SavingsAccount(String name, double accBal, double maxWithLimit) {
		super(name, accBal, 2000);
		this.maxWithLimit = maxWithLimit;
	}
	
	double getBalance() {
		return accountBalance + accountBalance * 0.05;
	}
	
	void withdraw(double amount) {
		if(amount < maxWithLimit) {
			super.withdraw(amount);
		}
			
	}
	
}
