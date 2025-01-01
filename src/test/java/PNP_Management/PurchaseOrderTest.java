package PNP_Management;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.purchaseOrderPage;

public class PurchaseOrderTest extends BaseClass {
     @Test(invocationCount = 1)
	public void userAbleTocreatePurchaseOrder ()throws Throwable {
    	 
    	 List<String>itemsNames = Arrays.asList("Agarbatti champa Incense Sticks"); 
		
		purchaseOrderPage orderpage = new purchaseOrderPage(driver);
		String page = "Purchase Order";
		String name = "DALVKOT PNP";
		String vendorname = "BHAGEERA";
		String taxname = "5";
		
		orderpage.clickOnThehamberBtn(driver);
		orderpage.enterThesearchForPageName(driver,page);
		orderpage.clickOnThePurchaseOrderPage(driver);
		orderpage.clickOnTheAddBtn(driver);
		orderpage.clickOnThehamberBtn(driver);
		orderpage.enterThestoreNamedropdrop(driver,name);
		orderpage.enterThevendorNamedropdown(driver,vendorname);
		orderpage.enterTheLineofitemNameDropdown(driver,itemsNames);
		orderpage.clickonThecloseBtn(driver);
	    orderpage.enterTherateNumber(driver);
		orderpage.clickOnThetaxCategory(driver);
		orderpage.clickOnThetaxname(driver, taxname);
		orderpage.clickOnTheplusBtn(driver);
		orderpage.clickOnThesubmitBtn(driver);
		orderpage.closeThejaserReport(driver);
		orderpage.clickOnTheoKBtn(driver);
	}
     
     
     
     @Test
     public void enterTheorderlist()throws Throwable {
 		purchaseOrderPage orderpage = new purchaseOrderPage(driver);
		String page = "Purchase Order";

      
 		orderpage.clickOnThehamberBtn(driver);
		orderpage.enterThesearchForPageName(driver,page);
		orderpage.clickOnThePurchaseOrderPage(driver);
 		orderpage.clickOnThehamberBtn(driver);
		orderpage.enterthepending_List(driver);
		orderpage.clickOnThePendingListApproved(driver);
		orderpage.clickOnTheoKBtn(driver);
		orderpage.clickOnTheoKBtn(driver);
		orderpage.clickOnTheoKBtn(driver);



     }

     
     
     
     
     
    
}

   
   




















