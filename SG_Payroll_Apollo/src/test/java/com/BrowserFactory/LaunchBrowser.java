package com.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	WebDriver driver;

	public WebDriver launchBrowser(String Browser, String URL) throws Exception {

		if(Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundar149\\eclipse-workspace\\SG_Payroll_Apollo\\src\\test\\java\\com.Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(Browser.equalsIgnoreCase("Firefox")) {

		}
		if(Browser.equalsIgnoreCase("Internet Explorer")){

		}
		else {
			System.out.println("The Browser you have requested cannot be found");
		}

		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(URL);
        Thread.sleep(3000);
        return driver;
	}

}
