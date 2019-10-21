package week2.day1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);

	}

	public void add(double a, double b) {
		System.out.println(a + b);

	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public static void main(String[] args) {
		Calculator cc = new Calculator();
		cc.add(10, 20);
		cc.add(25.35, 35.25);
		cc.add(23, 20, 30);
	}
}
