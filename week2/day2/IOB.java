package week2.day2;

public class IOB implements BankLocation {

	public void fixedDeposit() {
		System.out.println("7%");

	}

	public void savingsAccount() {

		System.out.println("5%");
	}

	public void currentAccount() {

		System.out.println("6%");
	}

	public void recursiveDeposit() {
		System.out.println("10%");
	}

	public static void main(String[] args) {
	
		 IOB iob = new IOB();
		
		//scope restriction
		//BankLocation iob = new IOB();
        
		iob.fixedDeposit();
		iob.savingsAccount();
		iob.currentAccount();
		iob.location();
		iob.recursiveDeposit();
	}

	public void location() {
		System.out.println("Chennai");
	}

}
