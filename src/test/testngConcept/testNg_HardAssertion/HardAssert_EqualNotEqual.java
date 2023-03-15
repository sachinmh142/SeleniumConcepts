package testNg_HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_EqualNotEqual {

	@Test
	public void equal()
	{
		
		Assert.assertEquals(0, 0);
		
	}
	
	@Test
	public void notequal()
	{
		
		Assert.assertEquals(1, 0);
		
	}
	
	
	@Test
	public void notequal2()
	{
		
		Assert.assertEquals(1, 0,"not equal");
		
	}
}