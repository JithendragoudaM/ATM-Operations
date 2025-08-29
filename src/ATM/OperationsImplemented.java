package ATM;

import java.util.HashMap;
import java.util.Map;

public class OperationsImplemented implements OperationsInterface {
	Atm atm = new Atm();
	Map<Double, String> ministmt = new HashMap<>();
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		System.out.println("Available Balnace: "+atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawn_amoun) {
		// TODO Auto-generated method stub
		if(atm.getBalance() >= withdrawn_amoun) {
			ministmt.put(withdrawn_amoun, " Amount Withdrawn");
			atm.setBalance(atm.getBalance() - withdrawn_amoun);
			System.out.println("Please collect the cash");
			viewBalance();
		}
		else {
			System.out.println("Insufficient Balance !!");
		}
	}

	@Override
	public void depositeAmount(double deposit_amount) {
		// TODO Auto-generated method stub
		ministmt.put(deposit_amount, " Amount Deposited");
		System.out.println(deposit_amount+ " Diposited Successfully");
		atm.setBalance(atm.getBalance()+ deposit_amount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		for(Map.Entry<Double, String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		
	}

}
