package Selenium_grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class seleniumGridForChrome {
	
	public static void main(String[] args) throws MalformedURLException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\SeleniumGrid\\SeleniumGridPro\\chromedriver.exe");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions options= new ChromeOptions();
		options.merge(cap);
		
		String url= "http://192.168.56.1:4444/wd/hub";
		
		WebDriver driver =new RemoteWebDriver(new URL(url),options);
		
		driver.get("https://www.google.com/");

		String expectedTitle = "Google";
		
       String actualTitle=driver.getTitle();
      
      System.out.println("ExpectedTitle: "+expectedTitle+"\nActualTittle: "+actualTitle);
     
      if(actualTitle.equals(expectedTitle))
      {
    	      System.out.println("Pass>> Title gets matched");

      }
      else
      {
	     	      System.out.println("Failed !>> Title doesn't matched");

      }
      
      driver.quit();
      
		
		
	}
	  
 
}