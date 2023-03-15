package testNg_HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class H_Assertion1
{

	@Test
	public void hardAssertions1()
	{
		
		    System.out.println("hard assertion when both string are same");
		    String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = "Free QA Automation Tools For Everyone";
	        Assert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*********************************************");
	        
	}
	
	@Test
	public void hardAssertions2()
	{
		
		    System.out.println("hard assertion when both string are not same");
		    String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = "Free QA Automation Tools For Everyon";
	        Assert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*********************************************");
	         
	}
	
	@Test
	public void hardAssertions3()
	{
		
		    System.out.println("hard assertion when both string are not same");
		    String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = "Free QA Automation Tools For Everyon";
	        Assert.assertEquals(originalTitle, expectedTitle,"Strings are not same ");
	        System.out.println("*********************************************");
	         
	}
	
}
