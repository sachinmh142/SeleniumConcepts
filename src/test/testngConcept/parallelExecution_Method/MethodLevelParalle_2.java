package parallelExecution_Method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MethodLevelParalle_2 {

	@BeforeMethod
	public void bm1()
	{
		System.out.println("bm2");
		
	}
	
	@Test 
	public void classlevelParallelExecution1() {
		System.out.println("Method Level Parallel_2 ");
	}
	
	@Test 
	public void classlevelParallelExecution2() {
		System.out.println("Method LevelParallel_2 ");
	}
	
	
	@AfterMethod
	public void am1()
	{
		System.out.println("am2");
		
	}
}
