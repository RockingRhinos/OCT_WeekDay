package week1.day2;

public class LargestOfThreeNumbers {
public static void main(String[] args) {
	int num1=157, num2 = 18, num3 = 2300;
	if (num1>num2 && num1>num3) {
		System.out.println(num1+" is Greater");
	} else if (num2>num1 && num2>num3) {
		System.out.println(num2+" is Greater");
	} else {
		System.out.println(num3+" is Greater");
	}
}
}
