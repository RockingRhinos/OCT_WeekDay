package week4.day1;

import org.testng.annotations.Test;

public class LearnTestngGroups {
	@Test(groups="regression")
	public void testCase1() {
		System.out.println("TestCase1");

	}

	@Test(groups="smoke")
	public void testCase2() {
		System.out.println("TestCase2");
		
	}

	@Test(groups= {"regression","smoke"})
	public void testCase3() {
		System.out.println("TestCase3");

	}

	@Test(groups="smoke")
	public void testCase4() {
		System.out.println("TestCase4");

	}

	@Test(groups="sanity")
	public void testCase5() {
		System.out.println("TestCase5");

	}

}
