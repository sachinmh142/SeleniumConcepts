package priorityConcept;

import org.testng.annotations.Test;


/**
 * 
 * 
 * @author Sachin MH
 * 
 * @Test(priority=<numbers>): We can prioritize the testNG tests & execute them based on the priority mentioned. 
 * The priority will start from zero. If we don't mention the priority to the @Test,
 * then by default it will be zero.

 *
 */
public class PriorityConcept_01 {

	 @Test(priority = 1)
	 public void priorityconcept_01()
	 {
		 System.out.println("priorityconcept_01");
	 }
	 
	 @Test(priority = 0)
	 public void priorityconcept_02()
	 {
		 System.out.println("priorityconcept_02");
	 }
	 
	 @Test(priority = -1)
	 public void priorityconcept_03()
	 {
		 System.out.println("priorityconcept_03");
	 }
	 
	 @Test(priority = 1)
	 public void priorityconcept_04()
	 {
		 System.out.println("priorityconcept_04");
	 }
}
