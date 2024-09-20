package com.Orange.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Orange.base.Generic;

public class LoginPage {

	WebDriver driver;
	Generic generic = new Generic();
	
	
	LoginPage dashBoardPage = PageFactory.initElements(driver, LoginPage.class);
	
	@FindBy(name = "username")
	WebElement textBox_UserName;

	@FindBy(name = "password")
	WebElement textBox_Password;

	@FindBy(xpath = "//button[text() = ' Login ']")
	WebElement button_Login;
	
	
	
	public void loginOrangeHRMPage(String userName, String password) {
//		textBox_UserName.sendKeys(userName);
		generic.sendTextToAnElement(textBox_UserName, userName);
		generic.sendTextToAnElement(textBox_Password, password);
		generic.clickAnElement(button_Login);

	}
}
