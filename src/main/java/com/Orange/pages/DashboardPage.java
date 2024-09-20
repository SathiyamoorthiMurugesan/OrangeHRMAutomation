package com.Orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;

	DashboardPage dashBoardPage =  
	           PageFactory.initElements(driver, 
	        		   DashboardPage.class); 
}
