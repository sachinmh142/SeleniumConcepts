package testNgAnnotations_BeforeAfterClass2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeClass
	public void beforeMethod() {
		System.out.println("Before Class");
	}

	 

	@AfterClass
	public void afterMethod() {
		System.out.println("After Class");
	}

	
}
