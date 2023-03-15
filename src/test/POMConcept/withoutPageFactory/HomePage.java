package withoutPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{
   
   public WebDriver driver;
   By hp_header=By.xpath("//h1[text()='Welcome to the-internet']");
   
   By hp_subheader=By.xpath("//h2[text()='Available Examples']");

   public HomePage( WebDriver driver)
   {
	  this.driver=driver; 
   }
   
   public void validateHeaderOfthePage() 
   {
	  boolean displayed=driver.findElement(hp_header).isDisplayed(); 
	  System.out.println(displayed);
   }
   
   public void validateSubHeaderOfthePage() 
   {
	   boolean displayed= driver.findElement(hp_subheader).isDisplayed();   
	  System.out.println(displayed);   
   }
   
}
