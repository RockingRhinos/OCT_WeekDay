package week4.day4;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnTestNGAssert {

	@Test
	public void testcase1() {
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals("test123", "test");
		assert1.assertTrue(true);
		System.out.println("Test Case 1");
		assert1.assertAll();
	}
	
	@Test
	public void testcase2() {
		System.out.println("Test Case 2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("Test Case 3");
	}
	
}
