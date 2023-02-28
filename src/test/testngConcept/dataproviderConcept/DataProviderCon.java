package dataproviderConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 
 * 
 * @author Sachin MH
 * The DataProviders in TestNG are another way to pass the parameters in the test function, 
 * the other one being TestNG parameters
 *
 */


public class DataProviderCon {

	@DataProvider()
	public Object[][] testData()
	{
		return new Object[][] {{"admin","manager"}};
	}

	@Test(dataProvider = "testData")
	public void geteData(String name , String password)
	{
		System.out.println(name);
		System.out.println(password);
	}
}
