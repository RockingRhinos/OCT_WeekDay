package week1.day2;

public class ChangeEvenChars {

	public static void main(String[] args) {
		String text="changeme";
		char[] charArray = text.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			//System.out.println(charArray[i]);
			
			if(i%2==1) {
				
				System.out.print(Character.toUpperCase(charArray[i]));
				
			}else {
				System.out.print(charArray[i]);
			}
			
		}

	}

}
