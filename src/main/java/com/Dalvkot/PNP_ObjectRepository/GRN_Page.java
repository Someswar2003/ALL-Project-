package com.Dalvkot.PNP_ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class GRN_Page extends WebDriverUtility {
	
	public GRN_Page (WebDriver driver) throws Throwable{
        PageFactory.initElements(driver, this);
	}   
        //Xpaths
	
	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	 private WebElement hamberBtn;
	
	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement  SearchForPage;
	
	@FindBy(xpath = "//a[text()=' Gate Entry ']")
	private WebElement gateEntrypage;
	
	@FindBy(xpath = "//a[text()=' Back ']")
	private WebElement  backBtn;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[2]")
	private WebElement gateEntrylist;
	
	@FindBy(xpath = "//a[text()=' GRN ']")
	private WebElement grnPage;
	
	@FindBy(xpath = "//button[text()=' New']")
	private WebElement newBtn;
	
	@FindBy(xpath = "//label[text()='Vendor Name ']//..//span[@role='presentation']")
	private WebElement vendorName;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement dropdownSearch;
	
	@FindBy(xpath = "//label[text()='Gate Entry Number ']//..//span[@role='presentation']")
	private WebElement  gateEntryNumber;
	
	@FindBy(xpath = "//button[text()=' submit '][1]")
	private WebElement  submitBtn;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement  oKBtn;
	
	     //Logics
	
	 public void clickOnThehamberBtn(WebDriver driver) throws Throwable{
		 explictWaitForElementToBeVisible(driver, hamberBtn);
		 Thread.sleep(3000);
		 hamberBtn.click();
	 }
	 
	 public void enterTheSearchForPage(WebDriver driver,String page) throws Throwable{
		 Thread.sleep(300);
		 SearchForPage.sendKeys(page);
	 }
	 
	 public void clickOnThegateEntrypage(WebDriver driver) {
		 gateEntrypage.click();
	 }
	 
	 public void clickOnThebackBtn(WebDriver driver) throws Throwable{
		 Thread.sleep(3000);
		 backBtn.click();
	 }
	  
	 public String  captureThegateEntrylist (WebDriver driver)throws Throwable {
		 Thread.sleep(3000);
		 String gate = gateEntrylist.getText().trim();
		 return gate;
	 }
	 
	 
	 public void enterTheSearchForPageGate(WebDriver driver,String gate) throws Throwable{
		 Thread.sleep(4000);
		 SearchForPage.clear();
		 SearchForPage.sendKeys(gate);
	 }
	
	 
	 public void  clickOnThegrnPage(WebDriver driver) {
		 grnPage.click();
	 }
	 
	 public void clickOnthenewBtn(WebDriver driver) {
		 newBtn.click();
	 }
	 
	public void clickOnThevendorName(WebDriver driver,String name  )throws Throwable {
		Thread.sleep(3000);
	   dropdown(driver, vendorName, dropdownSearch, name);	

	}
	
	public void clickonThegateEntryNumber(WebDriver driver,String number) throws Throwable{
		Thread.sleep(3000);
		explictWaitForElementToBeVisible(driver, gateEntryNumber);
		gateEntryNumber.click();
		dropdownSearch.sendKeys(number,Keys.ENTER);	
		
	}
	 
	public void clickOnThesubmitBtn(WebDriver driver) {
		scrollDownTheStillEndOfThePage(driver);
		submitBtn.click();
	}

	public void closeThejaserReport(WebDriver driver) throws Throwable{
		Thread.sleep(3000);
		  Robot robot = new Robot();
		  robot.keyPress(KeyEvent.VK_CONTROL);  
          robot.keyPress(KeyEvent.VK_W);
          robot.keyRelease(KeyEvent.VK_W);
          robot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void clickOnTheoKBtn(WebDriver driver) {
		oKBtn.click();
	}
	
	
	
	
	
	
	
	 
}
