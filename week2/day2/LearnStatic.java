package week2.day2;

public class LearnStatic {

	int empId;
	String empName;
	static String cmpName = "TestLeaf";

	public void setData(int id, String name, String company) {
		empId = id;
		empName = name;
		cmpName = company;

	}

	public void getData() {
		System.out.println(empId + " " + empName + " " + cmpName);

	}

	public static void cmpDetail() {
		System.out.println(cmpName);
	}

	public static void main(String[] args) {
		// System.out.println(LearnStatic.cmpName);

		LearnStatic.cmpDetail();

		/*
		 * LearnStatic emp1 = new LearnStatic(); emp1.setData(100, "Hari", "TestLeaf");
		 * emp1.getData();
		 * 
		 * LearnStatic emp2 = new LearnStatic(); emp2.setData(101, "Naveen", "TCS");
		 * 
		 * 
		 * emp2.getData();
		 */

	}

}
