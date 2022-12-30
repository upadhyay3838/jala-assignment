package Jala_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class search_employeePage {
	
	WebDriver driver;
	public  search_employeePage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
	@FindBy(how=How.NAME,using="Name")WebElement employeeName;
	@FindBy(how=How.NAME,using="MobileNo")WebElement MobileNo;
	@FindBy(how=How.ID,using="btnSearch")WebElement btnSearch;
	@FindBy(how=How.ID,using="btnClear")WebElement btnClear;
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/section[2]/div/div/div/a")WebElement addEmployee;
	
	
	
	public void employeeName(String EmployeeName) {
		
		employeeName.sendKeys(EmployeeName);
		
		}
public void Mobile_Number(String Mobile_Number) {
		
	MobileNo.sendKeys(Mobile_Number);
		
		
	}
public void Search_Button() {
	
	btnSearch.click();;
	
}
public void Clear_Button() {
	
	btnClear.click();
}
public void Add_Employee() {
	
	addEmployee.click();
	
	
}
	
	
  }
