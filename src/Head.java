import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Head {

	static Bank beta = new Bank();
	
	static Welcome welframe = new Welcome();
	static ProjectBank bframe = new ProjectBank();
	static Information iframe = new Information();
	static CreateAccount cframe = new CreateAccount();
	static GuiSavings savframe = new GuiSavings();
	static GuiCurrent curframe = new GuiCurrent();
	static Withdraw withframe = new Withdraw();
	static Deposit depframe = new Deposit();
	
	static DefaultListModel<String> model = new DefaultListModel<String>();
	static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	static Scanner scan = new Scanner(System.in);
	static String fileName = "accounts.txt";
	
	
	public static void main(String[] args) throws IOException
	{
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream(fileName));
			beta = (Bank)ois.readObject();
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			beta = new Bank();
			
		}finally {
			try {
				ois.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		Head.welframe.setVisible(true);
		
	}
	
	static void deserialize() {
		ObjectOutputStream out=null;
		try {
			out = new ObjectOutputStream(new FileOutputStream(Head.fileName));
			out.writeObject(Head.beta);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
