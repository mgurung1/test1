package com.citi.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.citi.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@name=\"username\"]")
	WebElement username;

	@FindBy(xpath = "//input[@name=\"password\"]")
	WebElement password;

	@FindBy(xpath = "//input[@name=\"login\"]")
	WebElement LoginBtn;

	@FindBy(xpath = "//img[@class=\"logo\"]")
	WebElement TechfiosLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// public String validateLoginPage() {
	// return driver.getTitle();

	public String VerifyLoginPage() {
		return driver.getTitle();
	}

	public boolean logo() {
		return TechfiosLogo.isDisplayed();
	}

	public HomePage Login1(String un, String pass) {
		username.sendKeys(un);
		password.sendKeys(pass);
		LoginBtn.click();
		return new HomePage();

	}
}
