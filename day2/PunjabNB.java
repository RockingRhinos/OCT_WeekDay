package week2.day2;

public class PunjabNB extends CentralBank{

	@Override
	public void fixedDeposit() {
		System.out.println("5%");
	}
	
	public static void main(String args[]) {
		PunjabNB pp = new PunjabNB();
		pp.fixedDeposit();
		pp.location();
		
		
		
		
	}

}
