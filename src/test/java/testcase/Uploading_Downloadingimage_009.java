package testcase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.ScreenShort;
import Jala_utilities.propertiesFileHandle;

public class Uploading_Downloadingimage_009 extends base {
	@Test
	public void image() throws IOException, InterruptedException {
		String photo="E:\\Jala_Assignments\\photo.jpg";
	String	error="Error!";
		pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
	    loginPage login=new loginPage(driver);
	    indexPage index=new indexPage(driver);
		login.user_Name(pr.getProperty("userName"));
		login.Password(pr.getProperty("password"));
		login.SignIN();
		Thread.sleep(5000);
		index.clk_more();
		Thread.sleep(2000);
		index.clk_Image();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id='file']")).sendKeys(photo);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='frmImages']/div/div/div[1]/div[3]/button")).click();
		Thread.sleep(5000);
		
        String s = driver.findElement(By.xpath("//*[@id='toast-container']/div/div[1]")).getText();		
        System.out.println(s);
        String inputerror = driver.findElement(By.xpath("//*[@id='toast-container']/div/div[2]")).getText();
        assertEquals(inputerror, error, "Error found in uploading image");
        ScreenShort ss=new ScreenShort();
        ss.captureScreen(driver);
        		
	}}