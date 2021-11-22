package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.BrowserFactory.LaunchBrowser;
import com.PageClasses.LoginPage;
import com.Utilities.ConfigReader;
import com.Utilities.ExcelReader;

public class BaseClass {

	ExcelReader ExReader;
	ConfigReader CfgReader;
	LaunchBrowser launch;
	WebDriver driver;
	LoginPage LoginPage;

	public BaseClass() {		
		ExReader = new ExcelReader();
		CfgReader = new ConfigReader();
		launch = new LaunchBrowser();
	}

	public WebDriver Setup() throws Exception {
		CfgReader.ConfigSetup("C:\\Users\\sundar149\\git\\SG_Payroll_Apollo_Remote\\SG_Payroll_Apollo\\TestData\\configuration.properties");
		driver = launch.launchBrowser(CfgReader.GetConfigValue("Browser"), CfgReader.GetConfigValue("RegressionTestURL"));
		return driver;
	}

	public void loginPage() throws Exception {
		LoginPage = PageFactory.initElements(driver, LoginPage.class);
		LoginPage.LoginHomePageAsAdmi(CfgReader);
	}

	public void logOut() throws Exception {
		LoginPage.Logout();
	}

	public void Teardown() {
		driver.quit();
	}
}
