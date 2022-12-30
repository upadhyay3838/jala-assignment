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
import Jala_page.search_employeePage;
import Jala_utilities.propertiesFileHandle;


public class searchEmp_003 extends base {

	boolean status=false;
	@Test
	public void searchEmployee() throws IOException, InterruptedException {

		
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_employee();
	Thread.sleep(5000);
	index.clk_search();
	search_employeePage searchEmp=new search_employeePage(driver);
	
	searchEmp.employeeName("Rajendra");
	searchEmp.Mobile_Number("8860038389");
	searchEmp.Search_Button();
	 Thread.sleep(2000);


List<WebElement> rowsdata=driver.findElements(By.xpath("//*[@id='tblEmployee']/tbody/tr/td[1]"));
int rsize = rowsdata.size();
System.out.println(rsize);
 
for(WebElement data:rowsdata)
{
String s = data.getText();
System.out.println(s);

if(s.contains("Rajendra")) {
	
	status=true;
	Assert.assertTrue(status, "data founds");
	break;
}
Assert.assertTrue(status, "data not founds");

}
}}