package PNP_Management;

import org.testng.annotations.Test;

import com.Dalvkot.PNP_GenericUtility.BaseClass;
import com.Dalvkot.PNP_ObjectRepository.Query_Item_Page;

public class Query_Item_Test extends BaseClass{
	@Test(invocationCount = 50)
      public void ToSearchQueryItems ()throws Throwable {
    	 
		Query_Item_Page ip = new Query_Item_Page(driver);
		String page = "Query On Item";
		
		ip.clickOnTheHamberBtn(driver);
		ip.SearchForPage(driver, page);
		ip.clickonThequeryOnItemText(driver);
		ip.clickOnTheHamberBtn(driver);
		ip.selecttheitemName(driver);

      }

}
