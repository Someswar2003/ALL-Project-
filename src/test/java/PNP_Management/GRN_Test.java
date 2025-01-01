package PNP_Management;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.GRN_Page;

public class GRN_Test extends BaseClass {
	@Test
	public void userableToApprovalTheGrn() throws Throwable{
		
		
		GRN_Page gatepage = new GRN_Page(driver);
		String page = "gate";
		String gate = "grn";
	    String name = "BHAGEERA"; 


		
		gatepage.clickOnThehamberBtn(driver);
		gatepage.enterTheSearchForPage(driver, page);
		gatepage.clickOnThehamberBtn(driver);
		gatepage.clickOnThegateEntrypage(driver);
		gatepage.clickOnThebackBtn(driver);
		String number = gatepage.captureThegateEntrylist(driver);
		gatepage.clickOnThehamberBtn(driver);
		gatepage.enterTheSearchForPageGate(driver, gate);
        gatepage.clickOnThegrnPage(driver);
        gatepage.clickOnthenewBtn(driver);
        gatepage.clickOnThevendorName(driver, name);
        gatepage.clickonThegateEntryNumber(driver, number);
        gatepage.clickOnThesubmitBtn(driver);
		gatepage.closeThejaserReport(driver);
		gatepage.clickOnTheoKBtn(driver);

		
		
	}

}
