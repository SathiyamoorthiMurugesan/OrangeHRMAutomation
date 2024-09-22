package com.Orange.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Orange.base.Generic;

public class HRM_CommonPage {

	WebDriver driver;
	Generic generic = new Generic();

	public HRM_CommonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class = 'oxd-brand-banner']//img")
	WebElement image_ClientImage;

	@FindBy(tagName = "h6")
	WebElement text_PageHeading;

	@FindBy(xpath = "//input[@placeholder='Search']")
	WebElement textBox_Search;

	@FindBy(xpath = "//ul[@class='oxd-main-menu']//a")
	List<WebElement> links_allMenu;

	@FindBy(className = "oxd-icon bi-chevron-left")
	WebElement button_MinimizeMenu;

	@FindBy(className = "oxd-userdropdown-name")
	WebElement text_UserName;

	@FindBy(className = "oxd-icon orangehrm-upgrade-icon")
	WebElement button_Upgrade;

	@FindBy(xpath = "//ul[@class = 'oxd-dropdown-menu']//a")
	List<WebElement> dropDown_UserMenu;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

//	@FindBy(xpath = "")
//	WebElement a;

	public void validateClientImage() {
		Assert.assertTrue(image_ClientImage.isDisplayed());
	}

	public void minimizeTheMenuSection() {
		textBox_Search.click();
	}
	
	public void searchAPage(String inputText) {
		textBox_Search.sendKeys(inputText);
	}
	
	public void searchAndGoToPage(String inputText) {
		textBox_Search.sendKeys(inputText);
			links_allMenu.get(0);
	}
	
	
	public void goToTheGivenPage(String pageName) {
		for (WebElement eachPage : links_allMenu) {
			if (eachPage.getText().equalsIgnoreCase(pageName)) {
				eachPage.click();
			}
		}
		Assert.assertEquals(text_PageHeading.getText(), pageName);
	}
	
	public String getUserName() {
		return text_UserName.getText();
	}
	
	public void goToUserMenuOption(String menuName) {
		for (WebElement eachPage : dropDown_UserMenu) {
			if (eachPage.getText().equalsIgnoreCase(menuName)) {
				eachPage.click();
			}
		}
	}
}
