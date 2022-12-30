package testcase;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class links_012 extends base {
	@Test
public void links() throws IOException, InterruptedException {
	
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_more();
	Thread.sleep(2000);
    index.clk_links();
    List<WebElement> list = driver.findElements(By.xpath("/html/body/div/div/section/form/div/div/div/div/div/div/div/a"));
  
    int lists = list.size();
  System.out.println(lists);
   ArrayList<String> urllist = new ArrayList<String>();
  for(WebElement ldata:list) {
	  
	  String url = ldata.getAttribute("href");
	  urllist.add(url);
	  checklinks(url);
  }	
	}
	  
	  public static void checklinks(String linkurl) {
		  
		  try {
			  
			  URL url=new URL(linkurl);
			 HttpURLConnection httpurlconnection = (HttpURLConnection) url.openConnection();
			 httpurlconnection.setConnectTimeout(5000);
			 httpurlconnection.connect();
			 if(httpurlconnection.getResponseCode()<400) {
				 System.out.println(linkurl+"-------->"+httpurlconnection.getResponseMessage()+"--------------------------------------->"+"is a ok link");
				 
			 }else
				 if(httpurlconnection.getResponseCode()>=400) {
					 System.out.println(linkurl+"-------->"+httpurlconnection.getResponseMessage()+"------------------------------------>"+"is a Broken link");
					 
				 }
			
		} catch (Exception e) {
		        e.getMessage();	
		}
		  
		  
		  
	  }
}