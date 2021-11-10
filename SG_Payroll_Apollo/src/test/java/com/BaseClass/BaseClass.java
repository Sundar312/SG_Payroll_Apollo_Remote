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

	public BaseClass() {		
		ExReader = new ExcelReader();
		CfgReader = new ConfigReader();
		launch = new LaunchBrowser();
	}

	public void Setup() throws Exception {
		CfgReader.ConfigSetup("C:\\Users\\sundar149\\git\\SG_Payroll_Apollo_Remote\\SG_Payroll_Apollo\\target\\TestData\\configuration.properties");
		driver = launch.launchBrowser(CfgReader.GetConfigValue("Browser"), CfgReader.GetConfigValue("RegressionTestURL"));
	}
}
