package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class Query_Item_Page extends WebDriverUtility{
	
	public Query_Item_Page (WebDriver driver)throws Throwable {
		PageFactory.initElements(driver, this);
		
		
	//	String [] itemname={"Golu Dolls Musical Instrument","Nine Planets Idols Statue Set",};
		
		
		
		
		
		
	}	
		//Xpaths
		
	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	private WebElement hamberBtn;
	
	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement  searchForPage;
	
	@FindBy(xpath = "//a[text()=' Query On Item ']")
	private WebElement queryOnItemText;
	
	@FindBy(xpath = "//input[@autocomplete='off']")
	private WebElement  itemName;
	
	@FindBy(xpath = "//li[@class='item']")
	private WebElement itemNameDropdown;
	
	
	
	
	
	
	
	
	
	
	/////li[@class='item']//a[1]
	
	      //Logics
	
	public void clickOnTheHamberBtn(WebDriver driver) {
		explictWaitForElementToBeVisible(driver, hamberBtn);
		 hamberBtn.click();
	}
	
	public void  SearchForPage (WebDriver driver,String page) {
		searchForPage.sendKeys(page);
	}
	
	public void clickonThequeryOnItemText(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		queryOnItemText.click();
	}
	
	public void selecttheitemName(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		itemName.sendKeys("Golu Dolls Musical Instrument");
		Thread.sleep(3000);
		itemNameDropdown.click();
	}
	
	

	
	
	
	
	
	
	
	
	
	
		
		

	

}
