package com.Dalvkot.PNP_ObjectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Dalvkot.PNP_GenericUtility.WebDriverUtility;

public class HomePage extends WebDriverUtility {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//li//a[@class='ls-toggle-btn']"), @FindBy(xpath = "") })
	private WebElement homeButtonForVims;

	public void homeBtnForvims(WebDriver driver) throws Throwable {
		Thread.sleep(500);
		clickOnTheElementUsedToJavascriptExecuter(driver, homeButtonForVims);
	}

}
