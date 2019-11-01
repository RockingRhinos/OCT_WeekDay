package week3.day5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LearnException {

	public static void main(String[] args) {

		System.out.println("Enter some value");
		Scanner sc = new Scanner(System.in);
		int num = 1;
		try { // positive
			num = sc.nextInt();
			System.out.println(num / 0);
		} catch (InputMismatchException e) { // negative
			System.err.println("Input should only be in integer values");
		} catch (ArithmeticException e) {
			System.err.println("Divisible by 0 isn't possible");
		} finally { // neutral
			System.out.println("Execution completed");
		}

	}

}
