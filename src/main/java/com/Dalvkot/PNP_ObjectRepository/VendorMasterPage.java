package com.Dalvkot.PNP_ObjectRepository;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class VendorMasterPage extends WebDriverUtility {
	String[] VendorNames = { "Shree Enterprises", "Vikas Traders", "Siddhi Solutions", "Aarav Industries",
			"Kumar & Sons", "Anjali Creations", "Rajesh Suppliers", "Mohan Textiles", "Pooja Distributors",
			"Suresh & Co.", "Aditi Exports", "Ravi & Brothers", "Karan Enterprises", "Nidhi Crafts", "Saanvi Goods",
			"Aditya Imports" };
	
	String[] VendorShortNames = { "Shree Enterprises", "Vikas Traders", "Siddhi Solutions", "Aarav Industries",
            "Kumar & Sons", "Anjali Creations", "Rajesh Suppliers", "Mohan Textiles", 
            "Pooja Distributors", "Suresh & Co.", "Aditi Exports", "Ravi & Brothers", 
            "Karan Enterprises", "Nidhi Crafts", "Saanvi Goods", "Aditya Imports" };
	
	String[] ConcernHead  = { "Shree Enterprises", "Vikas Traders", "Siddhi Solutions", "Aarav Industries",
            "Kumar & Sons", "Anjali Creations", "Rajesh Suppliers", "Mohan Textiles", 
            "Pooja Distributors", "Suresh & Co.", "Aditi Exports", "Ravi & Brothers", 
            "Karan Enterprises", "Nidhi Crafts", "Saanvi Goods", "Aditya Imports" };
	
	String[] AccountHolderNames = {"Rajesh Kumar","Anjali Sharma","Amitabh Verma","Sneha Mehta","Ravi Gupta","Priya Nair", 
		    "Vikram Singh","Manoj Desai","Sangeeta Joshi","Neha Kulkarni"};





	public VendorMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	// xpaths

	@FindBy(xpath = "//i[@class='zmdi zmdi-swap']")
	private WebElement hamberBtn;

	@FindBy(xpath = "//input[@placeholder='Search For Page']")
	private WebElement searchForPage;

	@FindBy(xpath = "//a[text()=' Vendor Master ']")
	private WebElement vendorMastername;

	@FindBy(xpath = "//button[text()='New']")
	private WebElement addBtn;

	@FindBy(xpath = "//label[text()='Supplier Group ']//..//span[@role='presentation']")
	private WebElement supplierGrouplabel;

	@FindBy(xpath = "//input[@aria-label='Search']")
	private WebElement dropdownTextArea;

	@FindBy(xpath = "//input[@formcontrolname='vendorName']")
	private WebElement vendorName;

	@FindBy(xpath = "//input[@placeholder='Vendor Short Name']")
	private WebElement vendorShortName;

	@FindBy(xpath = "//input[@formcontrolname='pincode']")
	private WebElement pincodeno;

	@FindBy(xpath = "//label[text()='Post Office']//..//span[@role='presentation']")
	private WebElement PostOffice;
	
	@FindBy(xpath = "//textarea[@formcontrolname='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@formcontrolname='businessHead']")
	private WebElement businessHead;
	
	@FindBy(xpath = "//input[@placeholder='Mobile Number']")
	private WebElement mobilenumber;
	
	@FindBy (xpath = "//input[@formcontrolname='accountNumber']")
	private WebElement accountNumber;
	
	@FindBy(xpath = "//input[@formcontrolname='accountHolderName']")
	private WebElement accountHolderName;
	
	@FindBy(xpath = "//div[@id='Statutory-Details']//table//tbody//tr[1]//td[2]//span[@role='presentation']")
	private WebElement statutoryDetails;
	
	@FindBy(xpath = "//div[@id='Statutory-Details']//table//tbody//tr[1]//td[3]//input[@placeholder='Statutory Description']")
	private WebElement  statutoryDescriptionText;
	
	@FindBy(xpath = "//div[@id='Statutory-Details']//table//tbody//tr[1]//td[4]//span[@data-off='No']")
	private WebElement offAndNoBtn;
	
	@FindBy(xpath = "//div[@id='Statutory-Details']//table//tbody//tr[1]//td[last()]//i[@class='zmdi zmdi-plus']")
	private WebElement actionBtn;
	
	@FindBy(xpath = "//button[text()=' Submit']")
	private WebElement sumbitBtn;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement oKBtn;
	

	// logics

	public void clickOnTheHamberBtn(WebDriver driver) throws Throwable {
		Thread.sleep(3000);
		explictWaitForElementToBeVisible(driver, hamberBtn);
		hamberBtn.click();
	}

	public void enterTheSearchForPage(WebDriver driver, String page) throws Throwable {
		Thread.sleep(3000);
		searchForPage.sendKeys(page);
	}

	public void clickTheOnThevendorMastername(WebDriver driver) {
		vendorMastername.click();
	}

	public void clickOnTheaddBtn(WebDriver driver) {
		explictWaitForElementToBeVisible(driver, addBtn);
		addBtn.click();
	}

	public void clickOnThesupplierGrouplabel(WebDriver driver, String supplier) throws Throwable {
		Thread.sleep(3000);
		dropdown(driver, supplierGrouplabel, dropdownTextArea, supplier);
	}

	public void enterThevendorName(WebDriver driver, String name) throws Throwable {
		vendorName.sendKeys(name);
	}

	public String generateRandomvendorName() {
		Random random = new Random();
		int randomIndex = random.nextInt(VendorNames.length);
		String VendorName = VendorNames[randomIndex];
		return VendorName;

	}

	public void enterThevendorshortName(WebDriver driver, String secondname) {
		vendorShortName.sendKeys(secondname);
	}
	
	public String generateTheRandomVendorShortName() {
		Random random = new Random();
		int randomIndex = random.nextInt(VendorShortNames.length);
		String  vendorshortname = VendorShortNames[randomIndex];
		return vendorshortname;
		
	}
	     
	public void enterThepincode(WebDriver driver, String pincode) {
		pincodeno.sendKeys(pincode);
	}

	public void enterThepostoffice(WebDriver driver, String post) throws Throwable {
		Thread.sleep(3000);
		dropdown(driver, PostOffice, dropdownTextArea, post);

	}
	
	public void enterThevendoraddress(WebDriver driver, String vendoraddress) {
		address.sendKeys(VendorNames);
	}
	
	
	public void enterTheConcernHead(WebDriver driver,String name)  {
		businessHead.sendKeys(name);
	}
	
	public String generateTherandomConcernHead () {
		Random random = new Random();
		int randamIndex = random.nextInt(ConcernHead.length);
		String head = ConcernHead[randamIndex];
		return head;
	}
	
	
	public void enterTheMobileNumber() {
		mobilenumber.sendKeys(generate_RandomNumbers());
	}
	
	public void enterTheAccountNumber() {
		accountNumber.sendKeys(generateAadharNumber_Random());
	}
	
	public void enterTheAccountHolderNames(WebDriver driver,String account) {
		scrollDownByUsingJavascriptExecuter(driver);
		accountHolderName.sendKeys(account);
	}
	 
	public String generateTheaccountHolderName() {
		Random random = new Random();
		int randamIndex = random.nextInt(AccountHolderNames.length);
		String holdername=AccountHolderNames[randamIndex];
		return holdername;
	   
	}
	
	  public void enterTheCSTNUMBER(WebDriver driver,String cst) {
		  dropdown(driver, statutoryDetails, dropdownTextArea, cst);
	
	 }
	  
	  
	  
	  public void enterThestatutoryDescriptionText(WebDriver driver) {
		  statutoryDescriptionText.sendKeys("1234567898");
	  }
	  public void clickOnTheoffAndNoBtn(WebDriver driver) {
		  offAndNoBtn.click();
	  }
	  
	  public void clickOnTheactionBtn(WebDriver driver) {
		  actionBtn.click();
	  }
	  
	  public void clickOnThesumbitBtn(WebDriver driver)throws Throwable {
		 Thread.sleep(300);
		  sumbitBtn.click();
	  }
	  
	  public void clickOnTheOkBtn(WebDriver driver) throws Throwable {
		  Thread.sleep(3000);
		  oKBtn.click();
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
