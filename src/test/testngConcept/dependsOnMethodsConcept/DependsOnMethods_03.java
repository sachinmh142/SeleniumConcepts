package dependsOnMethodsConcept;

import org.testng.annotations.Test;



public class DependsOnMethods_03 extends SuperClass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
    
    
}


