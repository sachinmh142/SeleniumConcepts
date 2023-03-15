package withPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
   
   public WebDriver driver;
    
   
   @FindBy(xpath = "//h1[text()='Welcome to the-internet']")
   WebElement hp_header;
   
   @FindBy(xpath = "//h1[text()='Welcome to the-internet']")
   WebElement hp_subheader;
   
   public HomePage( WebDriver driver)
   {
	  this.driver=driver; 
	  PageFactory.initElements(driver, HomePage.class);
	  
   }
   
   public void validateHeaderOfthePage() 
   {
	  boolean displayed=hp_header.isDisplayed(); 
	  System.out.println(displayed);
   }
   
   public void validateSubHeaderOfthePage() 
   {
	   boolean displayed= hp_subheader.isDisplayed();   
	  System.out.println(displayed);   
   }
   
}
