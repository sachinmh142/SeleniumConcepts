package dependsOnGroupsConcept;

import org.testng.annotations.Test;

public class GroupDependency {

	
	@Test(dependsOnGroups = "signIn")
	public void viewAccount()
	{
		System.out.println("user able to see account details ");
	}
	
	
	@Test(groups = "signIn")
	public void signIn()
	{
		System.out.println("sign In to application");
	}
}
