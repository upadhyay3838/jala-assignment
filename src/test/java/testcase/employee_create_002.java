package testcase;
import java.io.IOException;

import org.testng.annotations.Test;

import Jala_base.base;
import Jala_page.createEmployeePage;
import Jala_page.indexPage;
import Jala_page.loginPage;
import Jala_utilities.propertiesFileHandle;

public class employee_create_002 extends base {
	
@Test
public void create_Employee() throws IOException, InterruptedException {
	
	pr=propertiesFileHandle.prFileHandle("../Jala_Assignments/src/main/java/Jala_resources/data.properties");
    loginPage login=new loginPage(driver);
    indexPage index=new indexPage(driver);
    createEmployeePage createEmp=new createEmployeePage(driver);
//	log.info("---------------------Login is working with Valid CREDENTIALS-----------------------");
	login.user_Name(pr.getProperty("userName"));
	login.Password(pr.getProperty("password"));
	login.SignIN();
	Thread.sleep(5000);
	index.clk_employee();
	Thread.sleep(5000);
	index.clk_create();
	Thread.sleep(5000);
	createEmp.FirstName("Rajendra_QA");
	createEmp.LastName("Upadhyay");
	createEmp.EmailId("upadhyay3838@gmail.com");
	createEmp.MobileNo("8860038389");
	createEmp.Date_birth("04/12/1992");
	createEmp.clk_Male();
	createEmp.Address("kaushik Enclave");
	createEmp.Country("india");
	createEmp.City("india");
	createEmp.skiil_QA_Automation();
	Thread.sleep(8000);
	createEmp.clk_save();
	Thread.sleep(1000);
	
	
	
	
}
	
	
	
}
