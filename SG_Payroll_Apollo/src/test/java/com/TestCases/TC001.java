package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;

public class TC001 {

	//This test case is to login into the Apollo and log out successfully

	BaseClass BC;
	WebDriver driver;

	@BeforeClass
	public void BaseClassSetUp() throws Exception {
		BC = new BaseClass();
		driver=BC.Setup();
	}

	@Test(priority = 1)
	public void loginTest() throws Exception {
		BC.loginPage();
		String LoginName = driver.findElement(By.xpath("//ul[@class='navbar-nav float-end']/child::li/child::a")).getText();
		Assert.assertEquals(LoginName, "Apollo test@1234");
	}

	@AfterClass
	public void TearDown() {
		BC.Teardown();
	}

}
