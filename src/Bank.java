import java.io.Serializable;
import java.util.ArrayList;
public class Bank implements Serializable{

	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	String addAccount(String name,double accBal, double minBal) {
		BankAccount bankacc = new BankAccount(name, accBal, minBal);
		accounts.add(bankacc);
		return bankacc.accountNumber;
	}
	
	String addAccount(String name,double accBal,double minBal,double maxWithlimit) {
		BankAccount saveacc = new SavingsAccount(name,accBal,maxWithlimit);
		accounts.add(saveacc);
		return saveacc.accountNumber;
	}
	
	String addAccount(String name,double accBal,String tradeLicense) {
		BankAccount curracc = new CurrentAccount(name,accBal,tradeLicense);
		accounts.add(curracc);
		return curracc.accountNumber;
	}
	
	BankAccount findAccount(String accNum) {
		for(int i=0;i<accounts.size();i++) {
			BankAccount facc = accounts.get(i);
			if(facc.accountNumber.equals(accNum))
				return facc;
		}
		
		return null;
	}
	
	public void deposit(String accNum, double amount) {
		BankAccount bacc = findAccount(accNum);
		if(bacc == null)
			System.out.println("Account Not Avialable");
		else
			bacc.deposit(amount);
	}
	
	public void withdraw(String accNum, double amount) {
		BankAccount bacc = findAccount(accNum);
		if(bacc == null)
			System.out.println("Account Not Avialable");
		else
			bacc.withdraw(amount);
	}
	
	public void display() {
		for(BankAccount bacc: accounts) {
			bacc.display();
		}
	}
}
