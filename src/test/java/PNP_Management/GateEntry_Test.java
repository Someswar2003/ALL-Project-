package PNP_Management;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.GateEntry_page;

public class GateEntry_Test extends BaseClass {
	@Test
	public void userAbleTocreategate()throws Throwable {
	GateEntry_page gateentry = new GateEntry_page(driver);
	String page = "Gate";
	String order = "Purchase";
    String name = "BHAGEERA"; 
    String mi = "56";
    String partner = "By Air";
    String Representative  = "sudarshan"; 
    String supervisior = "santhosh";
    
    
    gateentry.clickOnTheHamberBtn(driver);
	gateentry.enterTheSearchForPage(driver,order);
	gateentry.clickOnThePurchaseOrderPage(driver);
	String po = gateentry.selectThepurchaseOrderPending_List(driver);
	gateentry.clickOnTheHamberBtn(driver);
	gateentry.enterTheSearchForPage(driver,page);
	gateentry.clickOnThegateEntry(driver);
	gateentry.clickOnTheHamberBtn(driver);
	gateentry.clickOnThevendorName(driver, name);
	gateentry.enterThemINumber(driver, mi);
	gateentry.enterTheinvoiceNumber(driver);
	gateentry.enterThePONumber(driver,po);
	
	gateentry.enterThenumberOfItems(driver);
	gateentry.clickOnThecourierPartner(driver, partner);
	gateentry.enterTheRepresentativeName(driver, Representative);
	gateentry.enterThesupervisiorName(driver, supervisior);
	gateentry.clickOnThesubmitBtn(driver);
	gateentry.enterTheoKBtn(driver);

	
	
	}
	
}
