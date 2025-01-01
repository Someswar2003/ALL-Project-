package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class LogOutPage extends WebDriverUtility {
	public LogOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='zmdi zmdi-account-box-phone']/ancestor::ul[@class='nav navbar-nav navbar-left']/descendant::b")
	private WebElement signOutBtn;

	@FindAll({ @FindBy(xpath = "//img[@alt='User']/following-sibling::b"),
			@FindBy(xpath = "//i[@class='zmdi zmdi-chevron-down']") })
	private WebElement userNameBtn;

	@FindBy(xpath = "//i[@class='zmdi zmdi-power']")
	private WebElement logoutBtn;

	@FindBy(xpath = "//img[@alt='User']/following-sibling::b[1]")
	private WebElement userNameHeader;

	/*
	 * 
	 *
	 * Business Logics
	 * 
	 * 
	 */

	public void logoutTheApplication(WebDriver driver) throws Throwable {
		explictWaitForElementToBeVisible(driver, userNameBtn);
		userNameBtn.click();
		clickOnTheElementUsedToJavascriptExecuter(driver, logoutBtn);
	}

	public void logoutTheApplication_NewTab(WebDriver driver) throws Throwable {
		// explicityWaitForElemenToBeClickable_ForSeconds(driver, userNameBtn, 5);
		doubleClick(driver, userNameBtn);
		Thread.sleep(2000);
		clickOnTheElementUsedToJavascriptExecuter(driver, logoutBtn);
	}

	public String takeTheCurrentUserName(WebDriver driver) {
		String userName = userNameHeader.getText();
		return userName;
	}
}
