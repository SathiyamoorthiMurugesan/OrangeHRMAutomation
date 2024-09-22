package com.HRM.TCs;

import org.testng.annotations.Test;

import com.Orange.base.Generic;
import com.Orange.pages.HRM_CommonPage;
import com.Orange.pages.HRM_LoginPage;

public class TC_AllTestCases extends Generic {
	
	@Test
	public void validateAPage() throws Exception {
		HRM_LoginPage loginPage = new HRM_LoginPage(driver);
		HRM_CommonPage commonPage = new HRM_CommonPage(driver);
		
//		loginPage.loginOrangeHRMPage("Admin", "admin123");
//		commonPage.goToTheGivenPage("Time");
	}

}
