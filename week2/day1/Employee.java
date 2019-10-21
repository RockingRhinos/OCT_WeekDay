package week2.day1;

public class Employee {

	public void findEmployee(int id, String name) {
		System.out.println(id + " " + name);
	}
	
	public void findEmployee(String email,int phno) {
		System.out.println(email + " " + phno);

	}
	
	public void findEmployee() {
		System.out.println("Babu");
		
	}
	
	public static void main(String[] args) {
		Employee ee = new Employee();
		ee.findEmployee(100, "Hari");
		ee.findEmployee("nav@gmail.com",12344);
		ee.findEmployee();
	}
}
