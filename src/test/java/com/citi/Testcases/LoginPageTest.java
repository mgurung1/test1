package com.citi.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.citi.base.TestBase;
import com.citi.pages.HomePage;
import com.citi.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization1();
		loginpage = new LoginPage();
	}

	@Test(priority = 1)
	public void VerifyTitle() {
		String title = loginpage.VerifyLoginPage();
		Assert.assertEquals(title, "Login - TechFios Test Application - Billing");

	}

	@Test(priority = 2)
	public void LogoimageTest() {
		boolean logo = loginpage.logo();
		Assert.assertTrue(logo);

	}

	@Test(priority = 3)
	public void loginTest() {

		homepage = loginpage.Login1(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
