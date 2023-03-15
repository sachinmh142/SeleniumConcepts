package parallelExecution_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassLevelParallel_1 {
	
	
	@BeforeMethod
	public void bm1()
	{
		System.out.println("bm1");
		
	}
	
	@Test 
	public void classlevelParallelExecution1() {
		System.out.println("ClassLevelParallel_1 ");
	}
	
	
	@Test 
	public void classlevelParallelExecution2() {
		System.out.println("ClassLevelParallel_2 ");
	}
	
	
	
	@AfterMethod
	public void am1()
	{
		System.out.println("am1");
		
	}

}
