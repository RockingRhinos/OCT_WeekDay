package week4.day1;

import org.testng.annotations.Test;

public class LearnTestngDependencies {
	@Test(dependsOnMethods = { "testCase2" })
	public void testCase1() {
		System.out.println("TestCase1");

	}

	@Test
	public void testCase2() {
		System.out.println("TestCase2");
		throw new RuntimeException();
	}

	@Test
	public void testCase3() {
		System.out.println("TestCase3");

	}

	@Test(dependsOnMethods = { "testCase5" })
	public void testCase4() {
		System.out.println("TestCase4");

	}

	@Test
	public void testCase5() {
		System.out.println("TestCase5");

	}

}
