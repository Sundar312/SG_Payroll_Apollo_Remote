package com.BrowserFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchBrowser {

	WebDriver driver;

	public WebDriver launchBrowser(String Browser, String URL) throws Exception {
		
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sundar149\\eclipse-workspace\\SG_Payroll_Apollo\\src\\test\\java\\com.Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Launched the browser");
		}
		if(Browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup(); 
			driver = new FirefoxDriver();
		}
		if(Browser.equalsIgnoreCase("Internet Explorer")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else {
			System.out.println("The Browser you have requested cannot be found");
		}

		System.out.println("Outta if loop");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);
		Thread.sleep(3000);
		return driver;
	}

}
