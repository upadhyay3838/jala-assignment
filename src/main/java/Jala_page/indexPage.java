package Jala_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class indexPage {
WebDriver driver;
public 	indexPage(WebDriver driver){
		
	this.driver=driver;
		
	PageFactory.initElements(driver, this);	
	}
@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[2]/a")WebElement employee;
@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[2]/ul/li[1]/a")WebElement create; 
@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[2]/ul/li[2]/a")WebElement search;



@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[3]/a")WebElement more; 
@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[3]/ul/li[1]/a")WebElement MultipleTabs; 
@FindBy(how=How.XPATH,using="/html/body/div[2]/aside/section/ul/li[3]/ul/li[2]/a")WebElement menu; 
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[3]/a")WebElement  Autocomplete; 
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[4]/a")WebElement  Collapsible;
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[5]/a")WebElement  Image;
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[6]/a")WebElement  Slider;
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[8]/a")WebElement  popup;
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[9]/a")WebElement  links;
@FindBy(how=How.XPATH,using="//*[@id='MenusDashboard']/li[3]/ul/li[11]/a")WebElement  iFrame;

public void clk_employee() {

	employee.click();
	
}
public createEmployeePage clk_create() {
	create.click();
	return new createEmployeePage(driver);
	
}
public search_employeePage clk_search() {
	search.click();
	return new search_employeePage(driver);
	
}
public void clk_more() {

	more.click();
	
}
public void clk_MultipleTabs() {

	MultipleTabs.click();
	
}
public void clk_menu() {

	menu.click();
	
}
public void clk_Autocomplete() {

	Autocomplete.click();
	
}
public void clk_Collapsible() {

	Collapsible.click();
	
}
public void clk_Image() {

	Image.click();
	
}
public void clk_Slider() {

	Slider.click();
	
}
public void clk_Popup(){
	popup.click();
}
public void clk_links(){
	links.click();
}
public void clk_iFrame(){
	iFrame.click();
}
}
