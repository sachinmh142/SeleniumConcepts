package withoutPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest 
{

	
	 String url="https://the-internet.herokuapp.com/";
		
	 
	 @Test
	 public void homePageTest()
	 {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get(url);
		 HomePage hp=new HomePage(driver);
		 hp.validateHeaderOfthePage();
		 hp.validateSubHeaderOfthePage();
		 
	 }
}
