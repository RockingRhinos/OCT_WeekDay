package week1.day2;

public class LearnSwitch {

	public static void main(String[] args) {
		String type = "Elite class";
		switch (type) {
		case "balcony":
			System.out.println("200");

			break;
		case "First class":
			System.out.println("150");

			break;
		case "Second class":
			System.out.println("100");

			break;
		case "Third class":
			System.out.println("50");

			break;

		default:
			System.out.println("Choose something from the list");
			break;
		}

	}

}
