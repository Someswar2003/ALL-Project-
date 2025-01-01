package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.JavaUtility;
import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class ItemMasterPage extends WebDriverUtility {
	public String storeName;
	public String zoneNumber;
	public String rack;
	public String shelf;
	public String bin;
	public String minStockQuantity;
	public String maxStockQuantity;
	public String reOrderLevel;
	public String UOM_Quantity;

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getZoneNumber() {
		return zoneNumber;
	}

	public void setZoneNumber(String zoneNumber) {
		this.zoneNumber = zoneNumber;
	}

	public String getRack() {
		return rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	public String getShelf() {
		return shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getMinStockQuantity() {
		return minStockQuantity;
	}

	public void setMinStockQuantity(String minStockQuantity) {
		this.minStockQuantity = minStockQuantity;
	}

	public String getMaxStockQuantity() {
		return maxStockQuantity;
	}

	public void setMaxStockQuantity(String maxStockQuantity) {
		this.maxStockQuantity = maxStockQuantity;
	}

	public String getReOrderLevel() {
		return reOrderLevel;
	}

	public void setReOrderLevel(String reOrderLevel) {
		this.reOrderLevel = reOrderLevel;
	}

	public String getUOM_Quantity() {
		return UOM_Quantity;
	}

	public void setUOM_Quantity(String uOM_Quantity) {
		UOM_Quantity = uOM_Quantity;
	}

	public ItemMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space(text())='Item Master']")
	private WebElement itemMasterPageBtn;

	@FindBy(xpath = "//a[normalize-space(text())='Add']")
	private WebElement addBtn;

	@FindBy(xpath = "//label[normalize-space(text())='Item Name']/..//a")
	private WebElement itemNamePlusBtn;

	@FindAll({ @FindBy(xpath = "//label[contains(.,'Name *')]/following::input") })
	private WebElement nameTextInTheItemNamePopup;

	@FindBy(xpath = "//input[@id='brandNames']/ancestor::div[@class='modal-body']//descendant::button[text()=' Submit']")
	private WebElement submitBtnInTheItemNamePopup;

	@FindBy(xpath = "//input[@id='brandNames']/ancestor::div[@class='modal-body']//descendant::button[text()=' Cancel']")
	private WebElement cancelBtnInTheItemNamePopup;

	@FindBy(xpath = "//button[normalize-space(text())='OK']")
	private WebElement okBtn;

	@FindBy(xpath = "//label[text()='Item Name']/..//input")
	private WebElement itemNameText;

	@FindBy(xpath = "//div//li[@class='item']")
	private WebElement itemNameSuggestion;

	@FindBy(xpath = "//label[text()='Item Category']/..//span[@role='presentation']")
	private WebElement itemCategoryDropdownBtn;

	@FindBy(xpath = "//input[@role='searchbox']")
	private WebElement dropdownSearch;

	@FindBy(xpath = "//label[text()='Sub Category']/..//span[@role='presentation']")
	private WebElement subCategoryDropdown;

	@FindBy(xpath = "//label[text()='Varient']/..//span[@role='presentation']")
	private WebElement varientDropdownBtn;

	@FindBy(xpath = "//input[@formcontrolname='skuId']")
	private WebElement skuIdText;

	@FindBy(xpath = "//table/tbody/tr[1]/td[2]//span[@role='presentation']")
	private WebElement storeNameDropdownBtnTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@placeholder='Zone']")
	private WebElement zoneNumberTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@placeholder='Rack']")
	private WebElement rackTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@placeholder='Shelf']")
	private WebElement shelfTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@placeholder='Bin']")
	private WebElement binTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@name='minStock']")
	private WebElement minStockQtyTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@name='maxStock']")
	private WebElement maxStockQtyTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@name='reorderQty']")
	private WebElement reOrderLevelTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td//input[@name='uomQuantity']")
	private WebElement UOM_QtyTextTable;

	@FindBy(xpath = "//table/tbody/tr[1]/td[last()]//button")
	private WebElement plusBtnTable;

	@FindBy(xpath = "(//button[@type='submit' and text()=' Submit'])[1]")
	private WebElement submitBtnPageDown;

	@FindBy(xpath = "//button[@type='reset' and text()=' Cancel']")
	private WebElement cancelBtnPageDown;

	@FindBy(xpath = "//input[@formcontrolname='fileName']")
	private WebElement uploadImage;

	/*
	 * Business Logics
	 * 
	 */

	public void clickOnTheItemMasterPage(WebDriver driver) throws Throwable {
		Thread.sleep(1000);
		clickOnTheElementUsedToJavascriptExecuter(driver, itemMasterPageBtn);
	}

	public void addTheItemInThePopup(WebDriver driver, String itemName) throws Throwable {
		explictWaitForElementToBeVisible(driver, itemNamePlusBtn);
		itemNamePlusBtn.click();
		explictWaitForElementToBeVisible(driver, nameTextInTheItemNamePopup);
		nameTextInTheItemNamePopup.click();
		moveToElementAndEnterTheData(driver, nameTextInTheItemNamePopup, itemName);
		submitBtnInTheItemNamePopup.click();
	}

	public void selectItemCategory(WebDriver driver, String itemCategory) {
		explictWaitForElementToBeVisible(driver, itemCategoryDropdownBtn);
		dropdown(driver, itemCategoryDropdownBtn, dropdownSearch, itemCategory);
	}

	public void enterTheItemNameAndSelect(WebDriver driver, String itemName) throws Throwable {
		Thread.sleep(2000);
		itemNameText.sendKeys(itemName);
		explictWaitForElementToBeVisible(driver, itemNameSuggestion);
		itemNameSuggestion.click();
	}

	public void selectSubCategory(WebDriver driver, String subCategory) {
		explictWaitForElementToBeVisible(driver, subCategoryDropdown);
		dropdown(driver, subCategoryDropdown, dropdownSearch, subCategory);
	}

	public void selectVarient(WebDriver driver, String varient) {
		explictWaitForElementToBeVisible(driver, varientDropdownBtn);
		dropdown(driver, varientDropdownBtn, dropdownSearch, varient);
	}

	public void enterTheSKU_Id(WebDriver driver, String skuId) {
		skuIdText.sendKeys(skuId);
	}

	public void selectStoreNameTable(WebDriver driver, String storeName) {
		explictWaitForElementToBeVisible(driver, storeNameDropdownBtnTable);
		dropdown(driver, storeNameDropdownBtnTable, dropdownSearch, storeName);
	}

	public void addTheLineItems(WebDriver driver, ItemMasterPage itemMasterPage) {
		selectStoreNameTable(driver, itemMasterPage.getStoreName());
		zoneNumberTextTable.sendKeys(itemMasterPage.getZoneNumber());
		rackTextTable.sendKeys(itemMasterPage.getRack());
		shelfTextTable.sendKeys(itemMasterPage.getShelf());
		binTextTable.sendKeys(itemMasterPage.getBin());
		minStockQtyTextTable.sendKeys(itemMasterPage.getMinStockQuantity());
		maxStockQtyTable.sendKeys(itemMasterPage.getMaxStockQuantity());
		reOrderLevelTextTable.sendKeys(itemMasterPage.getReOrderLevel());
		UOM_QtyTextTable.sendKeys(itemMasterPage.getUOM_Quantity());
		plusBtnTable.click();
	}

	public void itemMasterCreation(WebDriver driver, String itemName, String itemCategory, String subCategory,
			String varient, String skuId,ItemMasterPage itemMasterPage) throws Throwable {
		// addTheItemInThePopup(driver, itemName);
		enterTheItemNameAndSelect(driver, itemName);
		selectItemCategory(driver, itemCategory);
		selectSubCategory(driver, subCategory);
		selectVarient(driver, varient);
		addTheLineItems(driver, itemMasterPage);
		enterTheSKU_Id(driver, skuId);
	}

	public void clickOnTheAddButton(WebDriver driver) {
		explictWaitForElementToBeVisible(driver, addBtn);
		addBtn.click();
	}

	public void clickOnTheSubmit(WebDriver driver) {
		scrollDownTheStillEndOfThePage(driver);
		submitBtnPageDown.click();
	}

}
