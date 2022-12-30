package Jala_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class createEmployeePage {
	
	
	WebDriver driver;
	public 	createEmployeePage(WebDriver driver){
			
		this.driver=driver;
			
		PageFactory.initElements(driver, this);	
		}
	
	@FindBy(how=How.ID,using="FirstName")WebElement FirstName;
	@FindBy(how=How.ID,using="LastName")WebElement LastName;
	@FindBy(how=How.ID,using="EmailId")WebElement EmailId;
	@FindBy(how=How.ID,using="MobileNo")WebElement MobileNo;
	@FindBy(how=How.ID,using="DOB")WebElement DOB;
	@FindBy(how=How.ID,using="rdbMale")WebElement Male;
	@FindBy(how=How.ID,using="rdbFemale")WebElement Female;
	@FindBy(how=How.ID,using="Address")WebElement Address;
	@FindBy(how=How.ID,using="CountryId")WebElement Country;
	@FindBy(how=How.ID,using="CityId")WebElement City;
	@FindBy(how=How.ID,using="chkOtherCity")WebElement OtherCity;
	@FindBy(how=How.XPATH,using="//*[@id='OtherCity']")WebElement Other_City;
	@FindBy(how=How.ID,using="chkSkill_5")WebElement AWS;
	@FindBy(how=How.ID,using="chkSkill_3")WebElement DevOps;
	@FindBy(how=How.ID,using="chkSkill_2")WebElement Full_Stack_Developer;
	@FindBy(how=How.ID,using="chkSkill_4")WebElement Middleware;
	@FindBy(how=How.ID,using="chkSkill_1")WebElement QA_Automation;
	@FindBy(how=How.ID,using="chkSkill_6")WebElement WebServices;
	@FindBy(how=How.XPATH,using="//*[@id='frmEmployee']/div[2]/a")WebElement cancel;
	@FindBy(how=How.XPATH,using="//*[@id='frmEmployee']/div[2]/button")WebElement save;

	
	
	public void FirstName(String firstName) {
		FirstName.sendKeys(firstName);
		
	}
	public void LastName(String lastName) {
		LastName.sendKeys(lastName);
		
	}
	public void EmailId(String emailId) {
		EmailId.sendKeys(emailId);
		
	}
	public void MobileNo(String mobileNo) {
		MobileNo.sendKeys(mobileNo);
		
	}
	public void Date_birth(String DateOB ) {
		DOB.sendKeys(DateOB);
		
	}
	public void clk_Male() {
		Male.click();
		
	}
	public void clk_Female() {
		Female.click();
		
	}
	public void Address(String address) {
		Address.sendKeys(address);;
		
	}
	public void Country(String country) {
		Country.sendKeys(country);
		
	}
	public void City(String city) {
		City.sendKeys(city);
		
	}
	public void clk_Other_City() {
		Other_City.click();
		
	}
	public void skiil_QA_Automation() {
		QA_Automation.click();
		
	}
	public void clk_save() {
		save.click();
		
	}
	public void clk_cancel() {
		cancel.click();
		
	}

}
