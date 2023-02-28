package testNgAnnotations_BeforeAfterMethod;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/*
 * @BeforeMethod allows the method to execute before the execution of each @Test methods,
 * whereas @afterMethod is executed after the execution of each @Test methods. 
 */
public class BeforeAfterMethod
{
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	}
	
	@Test
	public void test() {
	System.out.println("Test Case 1");
	}
	
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
	}
}
