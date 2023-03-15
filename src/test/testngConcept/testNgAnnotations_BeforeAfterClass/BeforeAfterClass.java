package testNgAnnotations_BeforeAfterClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/**
 * 
 * @author Sachin MH
 * The method annotated with @BeforeClass will execute only once before the first test method in that particular class is invoked. 
 * The @AfterClass annotation will be executed only once, after all the test methods of that particular class have been invoked.
 */
public class BeforeAfterClass 
{
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
