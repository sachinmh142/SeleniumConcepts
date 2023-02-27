package invocationCountConcept;

import org.testng.annotations.Test;
/**
 * 
 * @author Sachin MH
 *It is used to run the testNG tests Nth time
 */
public class InVocation_01 {
	
	
	@Test(invocationCount = 4)
	public void invocationCount_01()
	{
		System.out.println("hi");
	}

}
