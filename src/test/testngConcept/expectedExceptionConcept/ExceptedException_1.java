package expectedExceptionConcept;

import java.io.File;

import org.testng.annotations.Test;

public class ExceptedException_1
{

	
	@Test(expectedExceptions = ArithmeticException.class)
	  public void exceptedException_01()
	  {
		int a = 0/100;
	  }
	
	
	@Test(expectedExceptions = NullPointerException.class)
	  public void exceptedException_02()
	  {
		File f1=null;
		System.out.println(f1.getPath());
	  }
}
