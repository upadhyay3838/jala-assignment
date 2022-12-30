package testcase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class HandleMultipleTabs_004 extends base{
	
	@Test
	public void MultipleTabs() throws IOException, InterruptedException {
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_more();
	Thread.sleep(2000);
	index.clk_MultipleTabs();
	                      
	WebElement Plan_to_Succeed = driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/ul/li[1]/a"));
	Plan_to_Succeed.click();
	String tab1 = driver.getTitle();
	System.out.println(tab1);
	driver.findElement(By.xpath("//*[@id='textbox1']")).sendKeys("JALA ");
	driver.findElement(By.xpath("//*[@id='textbox2']")).sendKeys("Academy");
	Thread.sleep(5000);
	WebElement UnLearning = driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/ul/li[2]/a"));
	UnLearning.click();
	String tab2 = driver.getTitle();
	System.out.println(tab2);
	driver.findElement(By.xpath("//*[@id='textbox3']")).sendKeys("JALA ");
	driver.findElement(By.xpath("//*[@id='textbox4']")).sendKeys("Academy");
	Thread.sleep(5000);
	WebElement Ways_of_Unlearning = driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/form/div/div/div/div/ul/li[3]/a"));
	Ways_of_Unlearning.click();
	String tab3 = driver.getTitle();
	System.out.println(tab3);
	driver.findElement(By.xpath("//*[@id='textbox5']")).sendKeys("JALA ");
	driver.findElement(By.xpath("//*[@id='textbox6']")).sendKeys("Academy");
	Thread.sleep(5000);

}
}
