package testcase;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class AlertBox_011 extends base{

	@Test
	public void alertBox() throws IOException, InterruptedException {
	
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_more();
	Thread.sleep(2000);
	index.clk_Popup();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='alertBox']")).click();
	Alert alart1 = driver.switchTo().alert();
    String expResult="This is an alert Box!";
	String text = alart1.getText();
      System.out.println(text);
	 Assert.assertEquals(text, expResult);
     alart1.accept();
     Thread.sleep(5000);
     driver.findElement(By.xpath("//*[@id='confirmBox']")).click();
 	Alert alart2 = driver.switchTo().alert();
     String exp2Result="Confirm Message Box";
 	String text2 = alart2.getText();
       System.out.println(text2);
 	 Assert.assertEquals(text2, exp2Result);
      alart2.dismiss();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='promptBtn']")).click();
  	Alert alart3 = driver.switchTo().alert();
      String exp3Result="Rajendra Upadhyay";
  	    alart3.sendKeys("Rajendra Upadhyay");
  	  Thread.sleep(2000);
       alart3.accept();
       String promptBox = driver.findElement(By.xpath("//*[@id='promptBox']")).getText();
    	 Assert.assertEquals(promptBox, exp3Result);
}
}           