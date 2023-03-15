package testNgAnnotations_BeforeAfterClass2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Sample_BeforeAfterClass2  extends BaseClass{

	 

	@Test
	public void test1() {
		System.out.println("Test Case 1");
	}

	 
	@Test
	public void test2() {
		System.out.println("Test Case 2");
	}

	@Test
	public void test3() {
		System.out.println("Test Case 3");
	}


}
