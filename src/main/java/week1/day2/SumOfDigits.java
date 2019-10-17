package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=1645;
		int sum=0;
		/*String numString = Integer.toString(num);
		
		char[] charArray = numString.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			String charStr=""+charArray[i];
			int parseInt = Integer.parseInt(charStr);
			sum=sum+parseInt;
		}
		System.out.println(sum);*/
		
		while(num>0) {
			
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
				
		}
		System.out.println(sum);
	}

}
