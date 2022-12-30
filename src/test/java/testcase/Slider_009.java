package testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class Slider_009 extends base {

	@Test
	public void slider() throws IOException, InterruptedException {
	Actions ac=new Actions(driver);
	String expectedResult = "50";
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
	    loginPage login=new loginPage(driver);
	    indexPage index=new indexPage(driver);
		login.user_Name(pr.getProperty("userName"));
		login.Password(pr.getProperty("password"));
		login.SignIN();
		Thread.sleep(5000);
		index.clk_more();
		Thread.sleep(2000);
		index.clk_Slider();
		Thread.sleep(2000);
		WebElement slider = driver.findElement(By.xpath("//*[@id='blue']/div[2]"));
		ac.clickAndHold(slider);
		ac.dragAndDropBy(slider, 290, 0);
	    ac.build().perform();
	    String slidervalu = driver.findElement(By.xpath("//*[@id='ex6SliderVal']")).getText();
		System.out.println(slidervalu);
	
			
			Assert.assertEquals(slidervalu, expectedResult);
			
			
		
		
}
}