package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class PharmacySalesPage extends WebDriverUtility {
	// intilization f the WebElements
	public PharmacySalesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space(text())='Pharmacy Sales']")
	private WebElement pharmacySalesPage;

	@FindBy(xpath = "//button[normalize-space(text())='Add']")
	private WebElement addButton;

	@FindBy(xpath = "//label[text()='Sales Location']/..//span[@role='presentation']")
	private WebElement saleLocationDropdownBtn;

	@FindBy(xpath = "//label[text()='Sale Type']/..//span[@role='presentation']")
	private WebElement saleTypeDropdownBtn;

	@FindBy(xpath = "//label[text()='Hospital Name']/..//span[@role='presentation']")
	private WebElement hospitalNumberDropdownBtn;

	@FindBy(xpath = "//label[text()='Visit Number']/..//span[@role='presentation']")
	private WebElement visitNumberDropdownBtn;

	@FindBy(xpath = "//input[@formcontrolname='hospitalNumber']")
	private WebElement hospitalNumberText;

	@FindBy(xpath = "//input[@formcontrolname='patientName']")
	private WebElement patientNameText;

	@FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
	private WebElement phoneNumberText;

	@FindBy(xpath = "//input[@formcontrolname='receiptDate']")
	private WebElement ManualReceiptDate;

	@FindBy(xpath = "//div[@id='table']/table/tbody/tr[1]/td[1]//span[@role='presentation']")
	private WebElement genericNameDropdownBtn;

	@FindBy(xpath = "//div[@id='table']/table/tbody/tr[1]/td[2]//span[@role='presentation']")
	private WebElement drugNameDropdownBtn;

	@FindBy(xpath = "//div[@id='table']/table/tbody/tr[1]/td[4]//span[@role='presentation']")
	private WebElement batchNumberDropdownBtn;

	@FindBy(xpath = "//div[@id='table']/table/tbody/tr[1]/td//input[@placeholder='sales qty']")
	private WebElement salesQuantityText;

	@FindBy(xpath = "//div[@id='table']/table/tbody/tr[1]/td//input[@placeholder='Disc (%)']")
	private WebElement discountText;

}
