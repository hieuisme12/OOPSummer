package BaiTap6;

public class Account {
	private long accNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;
	public Account() {
	}
	public Account(long accNumber, String name, double balance) {
		setAccNumber(accNumber);
		setName(name);
		setBalance(balance);
	}
	public long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		if(accNumber >0)
		this.accNumber = accNumber;
		else 
			this.accNumber = 0;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name.equals(" "))
			this.name = "xxx";
		else 
			this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0)
			this.balance = balance;
		else 
			this.balance = 0;
	}
	public double getRATE() {
		return RATE;
	}
	public boolean deposit(double amount) {
	    if (amount > 0) {
	        this.balance += amount;
	        return true;
	    }
	    return false;
	}
	public boolean withdraw(double amount , double fee) {
		if(amount >0 && amount + fee <= balance)
			return true;
		else 
			return false;
	}
	public void addInterest() {
	    this.balance += this.balance * RATE;
	}
	public boolean transfer(Account acc2, double amount) {
	    if (amount > 0 && this.balance >= amount) {
	        this.balance -= amount;
	        acc2.deposit(amount);
	        return true;
	    }
	    return false;
	}
	public String toString() {
	    return "Account Number: " + this.accNumber +
	           "\nName: " + this.name +
	           "\nBalance: $" + String.format("%.2f", this.balance);
	}
	
	
	
}
