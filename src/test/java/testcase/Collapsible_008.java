package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class Collapsible_008 extends base {
	
	@Test
	public void Collapsible() throws IOException, InterruptedException {
		
		pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
	    loginPage login=new loginPage(driver);
	    indexPage index=new indexPage(driver);
		login.user_Name(pr.getProperty("userName"));
		login.Password(pr.getProperty("password"));
		login.SignIN();
		Thread.sleep(5000);
		index.clk_more();
		Thread.sleep(2000);
		index.clk_Collapsible();
		driver.findElement(By.xpath("//*[@id='frmCollapse']/div/div/div/div/ul/li[2]/a")).click();
		List<WebElement> list = driver.findElements(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/div/div[2]/div/div/div/div/h4/a"));
		Thread.sleep(2000);
		for(WebElement li:list) {
        String link = li.getAttribute("aria-controls");
	//	System.out.println(link);
		driver.findElement(By.xpath("//*[@aria-controls="+"'"+link+"'"+"]")).click();	
		Thread.sleep(2000);
		List<WebElement> list1 = driver.findElements(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/div/div[2]/div[1]/div[1]/div/div/div/p"));
		for(WebElement data:list1){
			String data1 = data.getText();
			//System.out.println(data1);
		String expResult = "Build your own social network";
		String expResult2 = "Keep Calm and Keep On Coding";
		String expResult3= "They don't have a guaranteed path to achieve success";
		String expResult4 = "You have no idea what you want";
		if(data1.contains(expResult)) {
			Assert.assertEquals(data1, expResult);
			System.out.println(expResult+"-----------"+"is present");
		}else
			
		if(data1.contains(expResult2)) {
			Assert.assertEquals(data1, expResult2);	
			System.out.println(expResult2+"-----------"+"is present");
		}else
				
		if(data1.contains(expResult3)) {
			Assert.assertEquals(data1, expResult3);
			System.out.println(expResult3+"-----------"+"is present");
		}else
        if(data1.contains(expResult4)) {
  			
  			Assert.assertEquals(data1, expResult4);
  			System.out.println(expResult4+"-----------"+"is present");
		
		
		}
		}
		}
	}}