package dependsOnMethodsConcept;

import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * 
 * @author Sachin MH
 *  To achieve the dependency test at method level
 *
 */
 
public class DependsOnMethods_01 
{
     
	 
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
	
	
	@Test(dependsOnMethods = "launchTheBrowser" )
	public void deleteUser()
	{
		  System.out.println("Deleted  ");
	}
}
