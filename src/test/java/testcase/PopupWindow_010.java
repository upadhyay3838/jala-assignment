package testcase;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class PopupWindow_010 extends base {
	static String mainwindow;
	@Test
	public void popup() throws IOException, InterruptedException {
		
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
	    mainwindow = driver.getWindowHandle();
	    popF();
	    Thread.sleep(5000);
		popS();
		Thread.sleep(5000);
	    popSS();
	    
		
	}
		
	public static void popF() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id='btn-one']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='btn-two']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='btn-three']")).click();
	Thread.sleep(5000);
	Set<String> allwindows2 = driver.getWindowHandles();
	for(String windows:allwindows2) {
		
		driver.switchTo().window(windows);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		if (title.equalsIgnoreCase("TutorialsTeacher - Learn Technologies")) {
			driver.close();
		}else
			if (title.equalsIgnoreCase("Online Tutorials Library")) {
		
			    driver.close();
			}else
				if (title.equalsIgnoreCase("Google")) {
					    driver.close();
					}
		
		
	}
	driver.switchTo().window(mainwindow);
	}	

       public static void popS() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='btn-four']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='btn-five']")).click();
		Thread.sleep(5000);
		
		Set<String> allwindows2 = driver.getWindowHandles();
		for(String windows:allwindows2) {
			
			driver.switchTo().window(windows);
			String url = driver.getCurrentUrl();
			System.out.println(url);
		
			if (url.equalsIgnoreCase("https://magnus.jalatechnologies.com/Home/Popup#")) {
				driver.close();
			}else
				if (url.equalsIgnoreCase("https://www.javatpoint.com/java-tutorial")) {
					System.out.println("--------------Not a Duplicate Popup ----------------");
				    driver.close();
				}
			
			
		}
		driver.switchTo().window(mainwindow);
		}	
		
		public static void popSS() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='btn-six']")).click();
			Thread.sleep(5000);
			Set<String> allwindows3 = driver.getWindowHandles();
			for(String windows:allwindows3) {
				
				driver.switchTo().window(windows);
				String title = driver.getTitle();
				System.out.println(title);
				Thread.sleep(2000);
				if (title.equalsIgnoreCase("Popup")) {
					driver.findElement(By.xpath("//*[@id='myModal1']/div/div/div[3]/button")).click();
				}
			
		}
			driver.switchTo().window(mainwindow);
		}
}