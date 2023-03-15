package enabled_disabledConcept;

import org.testng.annotations.Test;


/**
 * 
 * @author Sachin MH
 * 
 * if false - testNG will not execute the test method 
 * if true - testNG will execute the test method 
 * by default if not mentioned condition will be true 
 *
 */
public class EnableConcept {
	  
	
	  @Test (enabled = true)
	  public void enableConcept_01()
	  {
		 System.out.println("enabled as true");
	  }
	  
	  
	  @Test (enabled = false)
	  public void enableConcept_02()
	  {
		 System.out.println("enabled as false");
	  }
}
