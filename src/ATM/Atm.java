package ATM;

public class Atm {
	private double balance;
	private double deposite_amount;
	private double withdrawn_amount;
	//default constructor
	public Atm() {}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDeposite_amount() {
		return deposite_amount;
	}
	public void setDeposite_amount(double deposite_amount) {
		this.deposite_amount = deposite_amount;
	}
	public double getWithdrawn_amount() {
		return withdrawn_amount;
	}
	public void setWithdrawn_amount(double withdrawn_amount) {
		this.withdrawn_amount = withdrawn_amount;
	}
	
	
}
