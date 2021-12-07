package com.Utilities;

import org.openqa.selenium.WebDriver;

public class SwitchFrame {

	public void SwitchToFrame(WebDriver driver, String frameid) {
		driver.switchTo().frame(frameid);
		System.out.println("Switched to frame\t:" +frameid);
	}
}
