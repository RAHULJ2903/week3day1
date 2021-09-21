package week3day1;

public class AxisBank extends BankInfo{
	public void deposit(double deposit) {
		System.out.println("Current Deposit ="+ deposit);
	}

	public static void main(String[] args) {
		BankInfo bi = new BankInfo ();
		bi.savings(1521333.00);
		bi.fixed(125515.00);
		
		
		AxisBank ab = new AxisBank();
		ab.deposit(134434.00);
		
		
	

	}

}
