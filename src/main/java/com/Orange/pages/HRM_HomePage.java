package com.Orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.base.Generic;

public class HRM_HomePage {

	WebDriver driver;
	Generic generic = new Generic();

	public HRM_HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;
//	
//	@FindBy(xpath = "")
//	WebElement a;

}
