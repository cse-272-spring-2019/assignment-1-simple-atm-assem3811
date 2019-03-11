import java.util.ArrayList;

public class BankAccount {
	
	// Bank account simple main objects...........
	   String customerName = "ASSEM SALAMA";
	   String accountNumber = "A5669";
	  private static double  balance;
	  private static ArrayList<String> History = new ArrayList<>();
	// building the constructor...................
	
	public BankAccount (String customerName,String accountNumber,double balance ) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.setBalance(balance);
	}
	
	// Null constructor
	
	public BankAccount () {
		
	}
	
	public void setBalanceToZ() {
		balance = 0;
	}
	
	public double withDrawalOp(double withDrawAmount ) {
		 	
		setBalance(getBalance() - withDrawAmount);
		
		return getBalance();
	}
	
	public double depositOp(double depositAmount) {
		setBalance(getBalance() + depositAmount);
		
		return getBalance();
	}
	
	public double balanceInq() {
		return getBalance();
	}

	public static double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public ArrayList<String> myHistory(){
		return this.History;
	}
	
}
