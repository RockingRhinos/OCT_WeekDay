package week1.day2;

public class LearnString {
	public static void main(String[] args) {
	String text = "Testleaf";
	String text1 = "I am learning Selenium @ Testleaf";
//	String name = new String("Naveen");
	int length = text.length();
	System.out.println(length);
	String upperCase = text.toUpperCase();
	System.out.println(upperCase);
	String lowerCase = text.toLowerCase();
	System.out.println(lowerCase);
	if(text1.contains(text)) {
		System.out.println("It is there");
	}else {
		System.out.println("It is not there");
	}
	char charAt = text.charAt(3);
	System.out.println(charAt);
		/*
		 * char[] array = text.toCharArray(); for (char eachChar : array) {
		 * System.out.println(eachChar); }
		 */
	String[] words = text1.split(" ");
	for (String eachWord : words) {
		System.out.println(eachWord);
	}
	
	
	
	
	
	}

}
