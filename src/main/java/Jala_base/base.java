package Jala_base;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import Jala_utilities.propertiesFileHandle;
import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
public static Properties pr;
public static WebDriver driver;
public static Logger log;

@BeforeMethod
	public void browser() throws IOException, InterruptedException {
	
//	DOMConfigurator.configure("log4j.xml");
   // log = Logger.getLogger(Jala_utilities.Log.class.getName());
		pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
		String br=pr.getProperty("browser");
		if (br.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(pr.getProperty("url"));
		//	driver.manage().window().maximize();
			
			}
		
		
		
		
	}
	
	@AfterSuite
	  public void qutbr() throws InterruptedException {
	  Thread.sleep(3000);
		  driver.quit();
	  
	  }
	 	
}

