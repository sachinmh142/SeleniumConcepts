package dependsOnMethodsConcept;

import org.testng.annotations.Test;

public class SuperClass  
{
	@Test
    public void OpenBrowser() {
        System.out.println("Browser Opened");
    }
}