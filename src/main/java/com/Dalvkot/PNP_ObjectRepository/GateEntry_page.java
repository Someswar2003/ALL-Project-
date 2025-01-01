package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class GateEntry_page  extends WebDriverUtility{
	
	public GateEntry_page (WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);
		
	}	
		//Xpaths
	
	
	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement searchForPageName;

	 @FindBy (xpath = "//a[text()=' Purchase Order ']")
	 private WebElement PurchaseOrderPage;
	
	 @FindBy(xpath = "//table/tbody/tr[1]/td[2]//a")
	 private WebElement purchaseOrderPending_List;
	
	

	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	private WebElement hamberBtn;

	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement searchForPage;
	
	
	@FindBy(xpath = "//a[text()=' Gate Entry ']")
	private WebElement gateEntry; 
	
	@FindBy(xpath = "//button[text()=' New']")
	private WebElement newBtn;
	
	@FindBy(xpath = "//label[text()='Vendor Name ']//..//span[@role='presentation']")
	private WebElement vendorName;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement dropdownSearch;
	
	@FindBy(xpath = "//input[@placeholder='M I Number']")
	private WebElement mINumber;
	
	@FindBy(xpath = "//input[@placeholder='invoice Number']")
	private WebElement invoiceNumber;
	
	@FindBy(xpath = "//label[text()='PO Number']//..//span[@role='presentation']")
	private WebElement poNumber;
	
	@FindBy(xpath = "//input[@placeholder='Number of Items']")
	private WebElement numberOfItems;
	
	@FindBy(xpath = "//label[text()='Courier Partner ']//..//span[@role='presentation']")
	private WebElement courierPartner;
	
	@FindBy(xpath = "//input[@formcontrolname='nameOfRepresentative']")
	private WebElement nameOfRepresentative;
	
	@FindBy(xpath = "//input[@placeholder='Representative Name']")
	private WebElement RepresentativeName;
	
	@FindBy(xpath = "//input[@placeholder='Supervisior Name']")
	private WebElement supervisiorName;
	
	@FindBy(xpath = "//button[text()=' Submit']")
	private WebElement  submitBtn;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement  oKBtn;
	
	//logics
	
	
	public void enterThesearchForPageName(WebDriver driver, String order) {
		searchForPageName.sendKeys(order);
	}
	
	public void clickOnThePurchaseOrderPage(WebDriver driver) {
		PurchaseOrderPage.click();
	}
	
	

	public String selectThepurchaseOrderPending_List(WebDriver driver)throws Throwable {
		Thread.sleep(5000);
	 	//explictWaitForElementToBeVisible(driver, purchaseOrderPending_List);
		String number  =purchaseOrderPending_List .getText().trim();
		return  number;
	
		
	}
	public void clickOnTheHamberBtn(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		explictWaitForElementToBeVisible(driver, hamberBtn);
		hamberBtn.click();
	}

	public void enterTheSearchForPage(WebDriver driver, String page) throws Throwable {
		Thread.sleep(3000);
		explictWaitForElementToBeVisible(driver, searchForPage);
		searchForPage.clear();
		searchForPage.sendKeys(page); 
	}
	
	public void clickOnThegateEntry(WebDriver driver) {
		gateEntry.click();
	}
	
	public void clickOnThenewBtn(WebDriver driver) throws Throwable{
	       Thread.sleep(3000);
		newBtn.click();
	}
	
	public void clickOnThevendorName(WebDriver driver,String name  ) {
	 dropdown(driver, vendorName, dropdownSearch, name);	

	}
	
	public void enterThemINumber(WebDriver driver ,String mi) {
		mINumber.sendKeys(mi);
	}
	
	public void enterTheinvoiceNumber(WebDriver driver) {
		invoiceNumber.sendKeys("34522");
	}
	
	public void enterThePONumber(WebDriver driver,String po)throws Throwable {
		Thread.sleep(3000);
		dropdown(driver, poNumber, dropdownSearch, po);
	//	poNumber.sendKeys(po,Keys.ENTER);
		
		
	}
	
	public void enterThenumberOfItems(WebDriver driver) {
		numberOfItems.sendKeys("6");
	}
	
	public void clickOnThecourierPartner(WebDriver driver,String partner) {
		dropdown(driver, courierPartner, dropdownSearch, partner);
	}
	
	public void enterTheRepresentativeName(WebDriver driver,String Representative) {
	      RepresentativeName.sendKeys(Representative);
	}
	
	public void enterThesupervisiorName(WebDriver driver,String supervisior) {
		supervisiorName.sendKeys(supervisior);
	}
	
	public void clickOnThesubmitBtn(WebDriver driver) {
		submitBtn.click();
	}
	
	public void enterTheoKBtn(WebDriver driver)throws Throwable {
		Thread.sleep(2000);
		oKBtn.click();
	}
	
	
	
	
	
	
	
	
	
	
}
