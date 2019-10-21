package week2.day1;

public class Mobile {

	protected String brand = "Samsung";
	private void makeCall() {
		System.out.println("Call connected from Mobile");
	}
	
	
	public static void main(String[] args) {
		Mobile mm = new Mobile();
		mm.makeCall();
	}
	
	
}
