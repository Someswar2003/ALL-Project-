package com.Dalvkot.PNP_ObjectRepository;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class Item_Sales_Page extends WebDriverUtility{
	
	public Item_Sales_Page (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

   
        
	     //Xpaths
	

	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	private WebElement hamberBtn;

	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement searchForPage;

	@FindBy(xpath = "//a[text()=' Item Sales ']")
	private WebElement itemSalesname;

	@FindBy(xpath = "//button[text()=' New']")
	private WebElement addBtn;
	
	@FindBy(xpath = "//label[text()='Store Name']//..//span[@role='presentation']")
	private WebElement  storeNameText;
	
	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement dropdownDataSearch;
	
	@FindBy(xpath = "//label[text()='Customer ']//..//span[@role='presentation']")
	private WebElement customerNameText;
	
	@FindBy(xpath = "//label[text()='Source ']//..//span[@role='presentation']")
	private WebElement sourceNameText;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[2]//./input")
	private WebElement lineofItems;
	
	@FindBy(xpath = "(//tr[@class='table-item']//td)[3]")
	private WebElement lineofItemsDropDown;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[6]//./input")
	private WebElement salesQty;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[8]//./input")
	private WebElement salesPrice;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[9]//./input")
	private WebElement mrpRate;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[12]//span[@role='presentation']")
	private WebElement taxCategory;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[13]//span[@role='presentation']")
	private WebElement tax;
	
	@FindBy(xpath = "//table//tbody//tr[1]//td[last()]//button[@type='button']")
	private WebElement plusBtn;
	
	@FindBy(xpath = "//button[text()=' Save Bill '][1]")
	private WebElement saveBill;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement oKBtn;
	
	
	
	
	
	
	      //Logics
	
	
	
	
	public void clickOnTheHamberBtn(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		explictWaitForElementToBeVisible(driver, hamberBtn);
		hamberBtn.click();
	}

	public void enterTheSearchForPage(WebDriver driver, String page) throws Throwable {
		Thread.sleep(3000);
		searchForPage.sendKeys(page);
	}

	public void clickTheOnTheItemsalesname(WebDriver driver) {
		itemSalesname.click();
	}

	public void clickOnTheaddBtn(WebDriver driver) {
		explictWaitForElementToBeVisible(driver, addBtn);
		addBtn.click();
	}
	
	
     public void selectThestoreNameText(WebDriver driver,String item) throws Throwable {
    	 Thread.sleep(3000);
    	 dropdown(driver, storeNameText, dropdownDataSearch, item);
     }
	
     public void selectThecustomerNameText(WebDriver driver,String customername) throws Throwable {
    	 Thread.sleep(6000);
    	 dropdown(driver, customerNameText, dropdownDataSearch, customername);
     }
    
     public void selectThesourceNameText(WebDriver driver,String source) {
    	 dropdown(driver, sourceNameText, dropdownDataSearch, source);
     }
     
     public  void enterThelineofItems(WebDriver driver,List<String>lineofItem) throws Throwable{
    	 Thread.sleep(3000);
    	 for (String LineofItems : lineofItem) {
    		 lineofItems.sendKeys(LineofItems);
 			 Thread.sleep(4000);
 			 explictWaitForElementToBeVisible(driver, lineofItemsDropDown);
 			 lineofItemsDropDown.click();
 			 salesQty.sendKeys("1");
 			 salesPrice.sendKeys("160");
 			 mrpRate.sendKeys("165");
    	 }
     }
     
     public void selectthetaxCategorytype(WebDriver driver ) {
    	 taxCategory.click();
    	 dropdownDataSearch.sendKeys("IGST",Keys.ENTER);
    	 tax.click();
    	 dropdownDataSearch.sendKeys("5",Keys.ENTER);
     }
 
     
     public void clickonTheplusBtn(WebDriver driver) {
    	 plusBtn.click();
     }
     
     
     public void clickOnThesaveBill(WebDriver driver) {
    	 saveBill.click();
     }
     
     public void clickOnTheoKBtn(WebDriver driver) throws Throwable {
    	 Thread.sleep(3000);
    	 oKBtn.click();
     }
     
     
     
     
     
     
     
     
     
     
     
}
