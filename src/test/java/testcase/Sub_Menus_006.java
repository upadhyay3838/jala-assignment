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

public class Sub_Menus_006 extends base {

	@Test

	public void Sub_Menus() throws IOException, InterruptedException {
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
	
	driver.findElement(By.xpath("//*[@id='frmMenu']/div/div/div/div/ul/li[2]/a")).click();
 List<WebElement> list = driver.findElements(By.xpath("//*[@id='tab_2']/ul/li"));
 for(WebElement outerlist:list) {
	 
	 String odata = outerlist.getText();
	 System.out.println(odata);
	 if(odata.contains("Testing")) {
		 driver.findElement(By.xpath("//*[@id='tab_2']/ul/li[1]")).click();
		 List<WebElement> innerlist = driver.findElements(By.xpath("//*[@id='id1']//li"));
		 
		 for(WebElement idata:innerlist) {
			 
			 String indata = idata.getText();
			 System.out.println(indata);
			 
			switch (indata) {
			case "Selenium":
				driver.findElement(By.xpath("//*[@id='selbtn']")).click();	
                String expectedResult = "You Have Selected Selenium Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), expectedResult)	;
            		System.out.println("you are in Selenium Menu");
            		Thread.sleep(3000);
            		break;
			case "Manual Testing":
				driver.findElement(By.xpath("//*[@id='manualbtn']")).click();	
                String MResult = "You Have Selected Manual Testing Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), MResult)	;
            		System.out.println("you are in Manual Testing Menu");
            		Thread.sleep(3000);
            		break;
				
			case "DB Testing":
				driver.findElement(By.xpath("//*[@id='dbbtn']")).click();	
                String DBResult = "You Have Selected DB Testing Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), DBResult)	;
            		System.out.println("you are in DB Testing Menu");
            		Thread.sleep(3000);
            		break;
			case "Unit Testing":
				driver.findElement(By.xpath("//*[@id='unitbtn']")).click();	
                String uResult = "You Have Selected Unit Testing Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), uResult)	;
            		System.out.println("you are in Unit Testing  Menu");
            		Thread.sleep(3000);
            		break;
				
			default:
				break;
			}
			 
		 }
		 
		 
	 }else
		 
		 if(odata.contains("JAVA")) {
			 driver.findElement(By.xpath("//*[@id='tab_2']/ul/li[2]")).click();
			 List<WebElement> innerlist = driver.findElements(By.xpath("//*[@id='tab_2']/ul/li[2]/ul/li"));
			 
			 for(WebElement idata:innerlist) {
				 
				 String indata = idata.getText();
				 System.out.println(indata);
				 
				switch (indata) {
				case "Adv Java":
					driver.findElement(By.xpath("//*[@id='advjavabtn']")).click();	
	                String expectedResult = "You Have Selected Adv Java Menu Option.";
	                		
	            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), expectedResult)	;
	            		System.out.println("you are in Adv Java Menu");
	            		Thread.sleep(3000);
	            		break;
				case "Core Java":
					driver.findElement(By.xpath("//*[@id='corejavabtn']")).click();	
	                String MResult = "You Have Selected Core Java Menu Option.";
	                		
	            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), MResult)	;
	            		System.out.println("you are in Core Java Menu");
	            		Thread.sleep(3000);
	            		break;
					
				case "Spring":
					driver.findElement(By.xpath("//*[@id='springbtn']")).click();	
	                String DBResult = "You Have Selected Spring Menu Option.";
	                		
	            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), DBResult)	;
	            		System.out.println("you are in Spring  Menu");
	            		Thread.sleep(3000);
	            		break;
				case "Hibernate":
					driver.findElement(By.xpath("//*[@id='hibernatebtn']")).click();	
	                String uResult = "You Have Selected Hibernate Menu Option.";
	                		
	            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), uResult)	;
	            		System.out.println("you are in Hibernate Menu");
	            		Thread.sleep(3000);
	            		break;
					
				default:
					break;
				}
				 
			 }	 
		 
	 
 }
	 if(odata.contains(".Net")) {
		 driver.findElement(By.xpath("//*[@id='tab_2']/ul/li[3]")).click();
		 List<WebElement> innerlist = driver.findElements(By.xpath("//*[@id='tab_2']/ul/li[3]/ul/li"));
		
		 for(WebElement idata:innerlist) {
			 
			 String indata = idata.getText();
			 System.out.println(indata);
			 
			switch (indata) {
			case "C#":
				driver.findElement(By.xpath("//*[@id='cbtn']")).click();	
                String expectedResult = "You Have Selected C# Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), expectedResult)	;
            		System.out.println("you are in C# Menu");
            		Thread.sleep(3000);
            		break;
			case "ASP.NET":
				driver.findElement(By.xpath("//*[@id='aspbtn']")).click();	
                String MResult = "You Have Selected ASP.NET Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), MResult)	;
            		System.out.println("you are in ASP.NET Menu");
            		Thread.sleep(3000);
            		break;
				
			case "ADO.NET":
				driver.findElement(By.xpath("//*[@id='adobtn']")).click();	
                String DBResult = "You Have Selected ADO.NET Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), DBResult)	;
            		System.out.println("you are in ADO.NET Menu");
            		Thread.sleep(3000);
            		break;
			case "MVC":
				driver.findElement(By.xpath("//*[@id='mvcbtn']")).click();	
                String uResult = "You Have Selected MVC Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), uResult)	;
            		System.out.println("you are in MVC Menu");
            		Thread.sleep(3000);
            		break;
				
			default:
				break;
			}
			 
		 }	 
	 
 
}
	 if(odata.contains("Database")) {
		 driver.findElement(By.xpath("//*[@id='tab_2']/ul/li[4]")).click();
		 List<WebElement> innerlist = driver.findElements(By.xpath("//*[@id='tab_2']/ul/li[4]/ul/li"));
		
		 for(WebElement idata:innerlist) {
			 
			 String indata = idata.getText();
			 System.out.println(indata);
			 
			switch (indata) {
			case "SQL":
				driver.findElement(By.xpath("//*[@id='sqlbtn']")).click();	
                String expectedResult = "You Have Selected SQL Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), expectedResult)	;
            		System.out.println("you are in SQL Menu");
            		Thread.sleep(3000);
            		break;
			case "My Sql":
				driver.findElement(By.xpath("//*[@id='mysqlbtn']")).click();	
                String MResult = "You Have Selected My Sql Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), MResult)	;
            		System.out.println("you are in My Sql Menu");
            		Thread.sleep(3000);
            		break;
				
			case "Oracle":
				driver.findElement(By.xpath("//*[@id='oraclebtn']")).click();	
                String DBResult = "You Have Selected Oracle Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), DBResult)	;
            		System.out.println("you are in Oracle Menu");
            		Thread.sleep(3000);
            		break;
			case "H2":
				driver.findElement(By.xpath("//*[@id='h2btn']")).click();	
                String uResult = "You Have Selected H2 Menu Option.";
                		
            	Assert.assertEquals(driver.findElement(By.xpath("//*[@id='label1']")).getText(), uResult)	;
            		System.out.println("you are in H2 Menu");
            		Thread.sleep(3000);
            		break;
				
			default:
				break;
			}
			 
		 }	 
	 
 
}
}
 
	}}