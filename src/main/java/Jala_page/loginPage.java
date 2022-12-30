package Jala_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public  class loginPage  {
	WebDriver driver;
	public  loginPage(WebDriver driver){
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		}
@FindBy(how=How.XPATH,using="//*[@id='UserName']")WebElement userName;	
@FindBy(how=How.ID,using="Password")WebElement password;
@FindBy(how=How.ID,using="btnLogin")WebElement signIN;
	
	
	
public  void user_Name (String UserName) {

	userName.sendKeys(UserName);
	}	
	
public void Password (String Password)  {
	
	password.sendKeys(Password);
	
}	
public void SignIN() {
	
	signIN.click();

}
	
}
