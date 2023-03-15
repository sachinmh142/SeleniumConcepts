package testNg_HardAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert_SameNotSame
{
	@Test
	public void same()
	{
		
		Assert.assertSame(0, 0);
		
	}
	
	@Test
	public void notesame()
	{
		
		Assert.assertNotSame(1, 0);
		
	}
	
	 
}
