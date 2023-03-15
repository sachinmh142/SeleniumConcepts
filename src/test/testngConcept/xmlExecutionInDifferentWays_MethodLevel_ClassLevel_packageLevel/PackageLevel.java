package xmlExecutionInDifferentWays_MethodLevel_ClassLevel_packageLevel;

import org.testng.annotations.Test;

public class PackageLevel {
	@Test
    public void openBrowser() {
        System.out.println("open Browser");
    }
	
	@Test
    public void closeBrowser() {
        System.out.println("close Browser");
    }
}
