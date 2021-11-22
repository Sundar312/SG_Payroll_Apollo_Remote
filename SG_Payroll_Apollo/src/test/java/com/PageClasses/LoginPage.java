package com.PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.Utilities.ConfigReader;


public class LoginPage {

	WebDriver driver;
	ConfigReader lCfgReader;

	/*public LoginPage(WebDriver driver,ConfigReader CfgReader) {
		this.driver=driver;
		this.CfgReader=CfgReader;
	}*/

	@FindBy(how=How.XPATH,using="//*[@id='email']")
	WebElement username;

	@FindBy(how=How.XPATH,using="//*[@id='password']")
	WebElement password;

	@FindBy(how=How.XPATH,using="//button[@class='btn btn-block login-btn mb-4']")
	WebElement LoginBtn;

	public void LoginHomePageAsAdmi(ConfigReader CfgReader) throws Exception {
		this.lCfgReader=CfgReader;
		username.sendKeys(CfgReader.GetConfigValue("username"));
		password.sendKeys(CfgReader.GetConfigValue("password"));
		LoginBtn.click();
		Thread.sleep(5000);
	}

	public void LoginHomePageAsEmployee(ConfigReader CfgReader) throws Exception {
		username.sendKeys(CfgReader.GetConfigValue("username"));
		password.sendKeys(CfgReader.GetConfigValue("password"));
		LoginBtn.click();
		Thread.sleep(5000);
	}

	public void Logout() throws Exception {
		driver.findElement(By.xpath("//a[@id='navbarDropdown' and @role='button']/child::i")).click();
		driver.findElement(By.xpath("//a[@id='navbarDropdown' and @role='button']/following-sibling::div/child::a/child::i[@class='fa fa-key me-2']")).click();
		Thread.sleep(4000);
	}

}
