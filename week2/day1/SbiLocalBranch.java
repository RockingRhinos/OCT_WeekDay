package week2.day1;

public class SbiLocalBranch extends Sbi{
	public void fixedDeposit(int a) {
		System.out.println(a + " " + "SbiLocal");

	}

	public void savingsAccount(int a) {
		System.out.println(a + " " + "SbiLocal");
	}
	public static void main(String[] args) {
		/*SbiLocalBranch ss = new SbiLocalBranch();
		ss.fixedDeposit(7);
		ss.savingsAccount(5);*/
		
		Sbi dd = new Sbi();
		dd.savingsAccount(12);
		dd.fixedDeposit(10);
				
	}
	
	

}
