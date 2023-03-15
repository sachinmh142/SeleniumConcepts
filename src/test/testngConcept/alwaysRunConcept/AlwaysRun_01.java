package alwaysRunConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 * @author Sachin MH
 * 
 * @Test(alwaysRun=true): In dependency test, If the dependency fails then the dependent will be skipped by the testNG automatically.
 *  To override this behaviour & to run the dependent test even after dependency fails we use this condition.
 *
 */
public class AlwaysRun_01 {

	
	@Test
	public void launchTheBrowser()
	{
		  System.out.println("Browser Launched");
		  Assert.assertTrue(false);
	}
	
	
	@Test(dependsOnMethods = "launchTheBrowser")
	public void createUser()
	{
		  System.out.println("User Created");
	}
	
	
	@Test(dependsOnMethods = "launchTheBrowser" , alwaysRun = true)
	public void deleteUser()
	{
		  System.out.println("Deleted  ");
	}
	
	 
}
