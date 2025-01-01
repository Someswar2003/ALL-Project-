package PNP_Management;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.VendorMasterPage;

public class VendorMasterTest  extends BaseClass{
	@Test(invocationCount = 10)
	public void userAbleTocreateVendorMaster() throws Throwable {
		
		VendorMasterPage vendormaster = new VendorMasterPage(driver);
	     String page = "vendor";
	     String supplier ="PNP";
	     String pincode = "560010";
	     String post = "RAJAJINAGAR H.O";
	     String vendoraddress = "123 Main Street";
	     String cst = "CST NUMBER";
		
		String VendorNames= vendormaster.generateRandomvendorName() ;
		String VendorshortNames = vendormaster.generateTheRandomVendorShortName();
		String ConcernHead = vendormaster.generateTherandomConcernHead();
		String holdername  = vendormaster.generateTheaccountHolderName();
		
		
		vendormaster.clickOnTheHamberBtn(driver);
		vendormaster.enterTheSearchForPage(driver,page);
		vendormaster.clickTheOnThevendorMastername(driver);
        vendormaster.clickOnTheaddBtn(driver);	
		vendormaster.clickOnTheHamberBtn(driver);
        vendormaster.clickOnThesupplierGrouplabel(driver,supplier);
        vendormaster.enterThevendorName(driver, VendorNames);
        vendormaster.enterThevendorshortName(driver,VendorshortNames);
        vendormaster.enterThepincode(driver, pincode);
        vendormaster.enterThepostoffice(driver,post);
        vendormaster.enterThevendoraddress(driver,vendoraddress);
        vendormaster.enterTheConcernHead(driver, ConcernHead);
        vendormaster.enterTheMobileNumber();
        vendormaster.enterTheAccountNumber();
        vendormaster.enterTheAccountHolderNames(driver, holdername);
        vendormaster.enterTheCSTNUMBER(driver, cst);
        vendormaster.enterThestatutoryDescriptionText(driver);
        vendormaster.clickOnTheoffAndNoBtn(driver);
        vendormaster.clickOnTheactionBtn(driver);
        vendormaster.clickOnThesumbitBtn(driver);
        vendormaster.clickOnTheOkBtn(driver);
        

	}

}
