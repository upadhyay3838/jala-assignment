package testcase;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_page.search_employeePage;
import Jala_utilities.propertiesFileHandle;

public class serarchEmp_Duplicate_0014 extends base {

	@Test
	public void serarchEmp_DuplicateEntry() throws IOException, InterruptedException {
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


List<WebElement> rowsdata=driver.findElements(By.xpath("//*[@id='tblEmployee']/tbody/tr/td"));
int rsize = rowsdata.size();
int n = 0;
System.out.println(rsize);
 
for(WebElement data:rowsdata)
{
String s = data.getText();
if(s.contains("upadhyay3838@gmail.com")) {
	ArrayList<String> a=new ArrayList<String>();
	a.add(s);
	 n = a.size();

}
}
if(n>1) {
	
	System.out.println("duplicate Email id found");
}	
	}}
