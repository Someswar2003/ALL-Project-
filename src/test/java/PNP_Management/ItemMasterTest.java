package PNP_Management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.HomePage;
import com.Dalvkot.PNP_ObjectRepository.ItemMasterPage;
import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItemMasterTest extends BaseClass {

	@Test
	public void checkThatUserCreateTheItem_Test() throws Throwable {

		String itemName = "Kumkum";
		String itemCategory = "Home Decor";
		String subCategory = "pooja Room Decor";
		String varient = "6";

		String skuId = jutil.generate_RandomNumbers();
		HomePage hp = new HomePage(driver);
		ItemMasterPage itemMasterPage = new ItemMasterPage(driver);
		itemMasterPage.setStoreName("DALVKOT PNP");
		itemMasterPage.setZoneNumber("10");
		itemMasterPage.setRack("5");
		itemMasterPage.setShelf("12");
		itemMasterPage.setBin("2");
		itemMasterPage.setMinStockQuantity("100");
		itemMasterPage.setMaxStockQuantity("100");
		itemMasterPage.setReOrderLevel("100");
		itemMasterPage.setUOM_Quantity("100");

		hp.homeBtnForvims(driver);
		itemMasterPage.clickOnTheItemMasterPage(driver);
		hp.homeBtnForvims(driver);
		itemMasterPage.clickOnTheAddButton(driver);
		itemMasterPage.itemMasterCreation(driver, itemName, itemCategory, subCategory, varient, skuId, itemMasterPage);
		itemMasterPage.clickOnTheSubmit(driver);
	}
}
