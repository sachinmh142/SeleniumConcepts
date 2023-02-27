package dependsOnMethodsConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods_02 {

	
	@Test
	public void launchTheBrowser()
	{
		  System.out.println("Browser Launched");
 	}
	
	
	@Test
	public void navigatToUrl()
	{
		  System.out.println("navigatToUrl");
		  
	}
	
	@Test(dependsOnMethods = {"launchTheBrowser","navigatToUrl"})
	public void createUser()
	{
		  System.out.println("User Created");
	}
	
	
	@Test 
	public void deleteUser()
	{
		  System.out.println("Deleted  ");
	}
}
