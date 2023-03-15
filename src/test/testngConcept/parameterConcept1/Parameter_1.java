package parameterConcept1;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 
 * @author Sachin Hiremath
 * 
 * TestNG Parameters are the arguments that we pass to the test methods. 
 * There are two ways through which we can pass the parameters to the test methods:
 *
 */

 // for below example we are fetching parameter values from xml file 

public class Parameter_1 
{
	@Test
	@Parameters({"userName","password"})
	public void parameterTest(@Optional String userName ,@Optional String password )
     {
    	 System.out.println("parameter values are : "+userName +"  "+password ); 
     }
}
