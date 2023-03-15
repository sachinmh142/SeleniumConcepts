package groupsConcept;

import org.testng.annotations.Test;

public class GroupConcept_02 {
	@Test(groups = "smoke")
	public void groupConcept01() {
		System.out.println("running smoke test");
	}

	@Test(groups = "regression")
	public void groupConcept02() {
		System.out.println("running regression test");
	}
}
