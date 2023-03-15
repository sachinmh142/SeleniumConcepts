package groupsConcept;

import org.testng.annotations.Test;



/**
 * 
 * @author Sachin MH
 * 
 * TestNG Groups allow you to perform groupings of different test methods.
 * Grouping of test methods is required when you want to access the test methods of different classes
 *
 */


public class GroupConcept_01 {
	
	@Test(groups = "smoke")
	public void groupConcept01()
	{
		System.out.println("running smoke test");
	}
	
	@Test(groups = "regression")
	public void groupConcept02()
	{
		System.out.println("running regression test");
	}

}
