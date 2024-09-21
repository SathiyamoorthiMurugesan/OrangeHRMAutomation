package com.Orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HRM_DashboardPage {
	
	WebDriver driver;

	HRM_DashboardPage dashBoardPage =  
	           PageFactory.initElements(driver, 
	        		   HRM_DashboardPage.class); 
}
