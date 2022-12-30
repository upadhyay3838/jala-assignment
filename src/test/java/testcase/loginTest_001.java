package testcase;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Jala_base.base;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class loginTest_001 extends base {
	

	
	

	@Test(dataProvider="credentials")
	public void login(String userName,String password) throws IOException {
		
    pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage lg=new loginPage(driver);
	log.info("---------------------Login is working with Valid CREDENTIALS-----------------------");
	lg.user_Name(userName);
	lg.Password(password);
	lg.SignIN();
	
	String index="https://magnus.jalatechnologies.com/Home/Index";
	if (driver.getCurrentUrl()==index) {
		log.info("Login is working with Valid CREDENTIALS");
		Assert.assertTrue(true);
	//	ScreenShort.TakeScreenShort(driver, "loginValid");
	}
	else {
		log.info("Login is working with Valid CREDENTIALS");
	//	ScreenShort.TakeScreenShort(driver, "loginInvalid");

			
	}
	} 
	
	@DataProvider(name="credentials")	
	public Object[][] data () {
		
		Object[][] data = new Object[3][2];
		
		data[0][0]="training@jalaacademy.com";
		data[0][1]="jobprogram";
		
		data[1][0]="admin.com";
		data[1][1]="admin@123";
		
		data[2][0]="admin@xyz.com";
		data[2][1]="admin";
		
		return data;
	
	
	

}
}