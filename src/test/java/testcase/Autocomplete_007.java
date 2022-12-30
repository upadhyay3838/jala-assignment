package testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class Autocomplete_007 extends base {
	
	@Test
	public void autocomplete() throws IOException, InterruptedException {
		
		
		pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
	    loginPage login=new loginPage(driver);
	    indexPage index=new indexPage(driver);
		login.user_Name(pr.getProperty("userName"));
		login.Password(pr.getProperty("password"));
		login.SignIN();
		Thread.sleep(5000);
		index.clk_more();
		Thread.sleep(2000);
		index.clk_Autocomplete();
	    driver.findElement(By.xpath("//*[@id='txtSingleAutoComplete']")).sendKeys("c");
	    Thread.sleep(2000);
		List<WebElement> listdata = driver.findElements(By.xpath("//*[@id='ui-id-1']/li/div"));
	          	
		int lsize = listdata.size();
		System.out.println(lsize);
		Thread.sleep(2000);
		for(int i=0;i<=lsize;i++) {
			String data = listdata.get(i).getText();
			System.out.println(data);
			if (data.equalsIgnoreCase("c++")) {
			
				WebElement s = driver.findElement(By.xpath("//*[@id='txtSingleAutoComplete']"));
				s.clear();
				s.sendKeys(data);
				break;
				
			}
				
				
			}
	}}		
			