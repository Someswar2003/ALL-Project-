package PNP_Management;
import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.Item_Sales_Page;

public class Item_Sales_Test extends BaseClass {
	@Test
	public void userAbleToCreateItemSales()throws Throwable {
		
		 Item_Sales_Page salespage = new Item_Sales_Page(driver);
		 
		 List<String>lineofItem= Arrays.asList("25 pk tealight white");
		 	
		 String page = "Item sales";
		 String item = "DALVKOT PNP"; 
		 String customername = "DALVKOT BIOFUELS PRIVATE LIMITED";
		 String source = "";
		 
		 
		 
		 salespage.clickOnTheHamberBtn(driver);
	     salespage.enterTheSearchForPage(driver,page);
		 salespage.clickTheOnTheItemsalesname(driver);
	     salespage.clickOnTheaddBtn(driver);
		 salespage.clickOnTheHamberBtn(driver);
         salespage.selectThestoreNameText(driver, item);
         salespage.selectThecustomerNameText(driver, customername);
         salespage.selectThesourceNameText(driver, source);
         salespage.enterThelineofItems(driver, lineofItem);
         salespage.selectthetaxCategorytype(driver);
         salespage.clickonTheplusBtn(driver);
         salespage.clickOnThesaveBill(driver);
         salespage.clickOnTheoKBtn(driver);
         
         
		
	}

}
