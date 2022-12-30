package testcase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;
@Test
public class iFrame_013 extends base {
	public void iframe() throws IOException, InterruptedException {
		
		pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
	    loginPage login=new loginPage(driver);
	    indexPage index=new indexPage(driver);
		login.user_Name(pr.getProperty("userName"));
		login.Password(pr.getProperty("password"));
		login.SignIN();
		Thread.sleep(5000);
		index.clk_more();
		Thread.sleep(2000);
		index.clk_iFrame();
		WebElement w = driver.findElement(By.xpath("//*[@id='iframe2']"));
		
		System.out.println(w.getSize()
				+w.getText());
		driver.switchTo().frame(w);
		driver.findElement(By.xpath("/html/body/div[2]/header/nav/div/ul/li/a/i")).click();
		  driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys(pr.getProperty(
				  "userName"));
				  driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pr.getProperty(
				  "password"));
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	
			
		}  
	
	
	
		//driver.switchTo().frame(ifram);
		/*
		 * String t = driver.getTitle(); System.out.println(t);
		 * driver.findElement(By.xpath("//*[@id='UserName']")).sendKeys(pr.getProperty(
		 * "userName"));
		 * driver.findElement(By.xpath("//*[@id='Password']")).sendKeys(pr.getProperty(
		 * "password"));
		 */
	}


