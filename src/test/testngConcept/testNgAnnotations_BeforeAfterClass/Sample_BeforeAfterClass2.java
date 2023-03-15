package testNgAnnotations_BeforeAfterClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample_BeforeAfterClass2 {

	@BeforeClass
	public void beforeMethod() {
		System.out.println("Before Class");
	}

	@Test
	public void test() {
		System.out.println("Test Case 1");
	}

	@AfterClass
	public void afterMethod() {
		System.out.println("After Class");
	}

}
