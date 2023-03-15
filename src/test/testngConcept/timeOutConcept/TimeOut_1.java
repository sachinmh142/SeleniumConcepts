package timeOutConcept;

import org.testng.annotations.Test;

/**
 * 
 * @author Sachin
 * 
    @Test(timeout=<milliseconds>): Timeout in testng

 *
 */


public class TimeOut_1 
{
  @Test(timeOut = 500)
  public void timeOutValidation()
  {
	 try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }
}
