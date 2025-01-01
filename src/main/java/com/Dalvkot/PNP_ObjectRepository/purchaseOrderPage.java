package com.Dalvkot.PNP_ObjectRepository;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class purchaseOrderPage extends WebDriverUtility {

	public purchaseOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//xpaths
	
	
	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	private WebElement hamberBtn;
	
	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement searchForPageName;

	 @FindBy (xpath = "//a[text()=' Purchase Order ']")
	 private WebElement PurchaseOrderPage;
	
	 @FindBy(xpath = "//a[text()=' ADD ']")
	 private WebElement AddBtn;
	 
	 @FindBy(xpath = "//label[text()='Store Name']//..//span[@role='presentation']")
	 private WebElement storeNamedropdown;
	 
	 @FindBy(xpath = "//input[@aria-label='Search']")
	 private WebElement dropdownSearch;
	 
	 @FindBy(xpath = "//label[text()='Vendor Name']//..//span[@role='presentation']")
	 private WebElement vendorNamedropdown;
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[2]//../input")
	 private WebElement itemNameDropdown;
	 
	 @FindBy(xpath = "(//li[@class='item']//a)[1]")
	 private WebElement itemNameDropDown;
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[3]//../input")
	 private WebElement sKuidQuantity; 
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[4]//../input")
	 private WebElement quantity; 
	 
	 @FindBy(xpath = "(//button[@class='close']//span)[2]")
	 private WebElement closeBtn;
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[6]//../input")
	 private WebElement rateNumber;
	 
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[11]//span[@role='presentation']")
	 private WebElement taxCategory;
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[12]//span[@role='presentation']")
	 private WebElement tax;
	 
	 @FindBy(xpath = "//div[@id='home']//table//tbody//tr[1]//td[last()]//i[@class='zmdi zmdi-plus']")
	 private WebElement plusBtn;
	 
	 @FindBy(xpath = "//button[text()=' submit '][1]")
	 private WebElement submitBtn;
	 
	 @FindBy(xpath = "//button[text()='OK']")
	 private WebElement oKBtn;
	 
	 @FindBy(xpath = "(//div[@class='header'])[2]//table//tbody//tr[1]//td[last()]//button[text()=' Actions ']")
	 private WebElement pending_List;
	 
	 @FindBy(xpath = "(//div[@class='header'])[2]//table//tbody//tr[1]//td[last()]//button[text()=' Approved ']")
	 private WebElement approvedBtn;
	//logics
	
	
	public void clickOnThehamberBtn(WebDriver driver) {
		explictWaitForElementToBeVisible(driver, hamberBtn);
		hamberBtn.click();
	}
	
	public void enterThesearchForPageName(WebDriver driver, String page) {
		searchForPageName.sendKeys(page);
	}
	
	public void clickOnThePurchaseOrderPage(WebDriver driver) {
		PurchaseOrderPage.click();
	}
	
	public void clickOnTheAddBtn(WebDriver driver) throws Throwable{
		Thread.sleep(3000);
		AddBtn.click();
	}
	
	public void enterThestoreNamedropdrop(WebDriver driver, String name) throws Throwable{
		Thread.sleep(3000);
	  dropdown(driver, storeNamedropdown, dropdownSearch, name);	
		
	}
	
	public void enterThevendorNamedropdown(WebDriver driver, String vendorname)throws Throwable {
		Thread.sleep(3000);
		dropdown(driver, vendorNamedropdown, dropdownSearch, vendorname);
	}
	
	public void enterTheLineofitemNameDropdown(WebDriver driver,List<String>itemsNames) throws Throwable{
		Thread.sleep(3000);
		
		for (String itemsName : itemsNames) {
			itemNameDropdown.sendKeys(itemsName);
			Thread.sleep(3000);
			itemNameDropDown.click();
			Thread.sleep(2000);
			quantity.sendKeys("7",Keys.TAB);
			
			
		}
	}
	
	public void clickonThecloseBtn(WebDriver driver)throws Throwable {
		Thread.sleep(300);
		closeBtn.click();
	}
	
	 public void enterTherateNumber(WebDriver driver) throws Throwable {
		 Thread.sleep(3000);
            rateNumber.sendKeys("5");
	}
						
	
	public void clickOnThetaxCategory(WebDriver driver) throws Throwable{
		Thread.sleep(3000);
		taxCategory.click();
		dropdownSearch.sendKeys("IGST",Keys.ENTER);
	}
	
	public void clickOnThetaxname(WebDriver driver,String taxname) {
         dropdown(driver, tax,dropdownSearch , taxname);
         scrollDownByUsingActionClass(driver);
	}
	
	public void clickOnTheplusBtn(WebDriver driver) {
		plusBtn.click();
	}
	
	public void clickOnThesubmitBtn(WebDriver driver) {
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
	
   public void clickOnTheoKBtn(WebDriver driver) throws Throwable {
	   Thread.sleep(2000);
	   oKBtn.click();
   }
   
   public void enterthepending_List(WebDriver driver)throws Throwable {
	   Thread.sleep(3000);
	   clickOnTheElementUsedToJavascriptExecuter(driver, pending_List);
		 //explictWaitForElementToBeVisible(driver, approvedBtn);
           pending_List.click();
   }
   
   
   public void clickOnThePendingListApproved(WebDriver driver) throws Throwable{
	   Thread.sleep(3000);
          //scrollDownByUsingActionClass(driver);
	  // explictWaitForElementToBeVisible(driver, approvedBtn);
	   approvedBtn.click();
   }
}
	
	
	
	
	
	
	
	

