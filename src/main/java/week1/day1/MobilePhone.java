package week1.day1;

public class MobilePhone {

	// non-primitive datatype variablename = "value";
	String brand = "Samsung";
	String color = "Black";

	public String makeCall(String contact) {
		//String brand = "Apple";
		System.out.println("call connected to "+contact);
		return contact;
	}

	public String getBrand() {
		/*String brand = "Nokia";
		System.out.println(brand);*/
		return brand;
	}

	public void getcolor() {
		System.out.println(color);
	}

	public static void main(String args[]) {
		// System.out.println("Hello World!");

		// syntax //classname objectname = new classname();
		MobilePhone obj = new MobilePhone();
		obj.makeCall("12345678");
		
		
	//	System.out.println(obj.getBrand());
		//String brndName = obj.getBrand();
		String brand2 = obj.getBrand();
		System.out.println(brand2);
		obj.getcolor();

	}

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
