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

public class Single_Menus_005 extends base {

	
	@Test

	public void Single_Menus() throws IOException, InterruptedException {
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_more();
	Thread.sleep(2000);
	index.clk_menu();
	Thread.sleep(2000);
	
	
 List<WebElement> list = driver.findElements(By.xpath("//*[@id='tab_1']//li"));
	
 
 for(WebElement inputdata:list) {
	 
            String data = inputdata.getText();
            System.out.println(data);
            
            if(data.contains("Testing")) {
            	
            	driver.findElement(By.xpath("//*[@id='b1']")).click();	
                String expectedResult = "You Have Selected Testing Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label']")).getText(), expectedResult)	;
            		System.out.println("you are in Testing");
            		Thread.sleep(5000);
            }else 
            	
            if(data.contains("Java")) {	
            	
            	
                    driver.findElement(By.xpath("//*[@id='b2']")).click();	
            	    String expectedResult = "You Have Selected Java Menu Option.";
            	    		
            		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label']")).getText(), expectedResult)	;	
            		System.out.println("you are in java");
            		Thread.sleep(5000);          	
            	
            }else
            	if(data.contains(".Net")) {
            		driver.findElement(By.xpath("//*[@id='b3']")).click();	
            	    String expectedResult = "You Have Selected .Net Menu Option.";
            	    		
            		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label']")).getText(), expectedResult)	;
            		System.out.println("you are in .Net");
            		Thread.sleep(5000);
            	
            }else
            	if(data.contains("Data Base")) {
            		
            		driver.findElement(By.xpath("//*[@id='b4']")).click();	
            	    String expectedResult = "You Have Selected Data base Menu Option.";
            	    		
            		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label']")).getText(), expectedResult)	;
            		System.out.println("you are in data base");
            		Thread.sleep(5000);
            		
            		
            		
            		
            		
            	}
            
	 
	 
 }
	
	
	
	
	
	
	
	
	}
	}