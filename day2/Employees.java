package week2.day2;

public class Employees extends Company {

	int empId;
	String empName;

	// boolean empActive;
	// char empMale;

	Employees() {
		/*
		 * empId = 100; empName = "Hari";
		 */
		this(100, "Hari");
		System.out.println("default constructor");

	}

	Employees(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
		System.out.println("parameterised constructor");

	}

	public static void main(String[] args) {

		Employees emp = new Employees();
		System.out.println(emp.empId);
		System.out.println(emp.empName);

		/*
		 * System.out.println(emp.empActive); System.out.println(emp.empMale);
		 */

	}

}
