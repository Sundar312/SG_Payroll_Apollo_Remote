package com.Utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScrnShot {

	TakesScreenshot TkeSrnShot;

	public CaptureScrnShot(WebDriver driver) {
		TkeSrnShot = (TakesScreenshot)driver;
	}

	public void GetScreenShot(String ScrnShotName) throws Exception {			
		String date = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(new Date());
		String newName = ScrnShotName+"_"+date.replaceAll("\\s", "_");
		File src = TkeSrnShot.getScreenshotAs(OutputType.FILE);
		System.out.println("Captured the Screenshot");
		File dest = new File("C:\\Users\\sundar149\\git\\SG_Payroll_Apollo_Remote\\SG_Payroll_Apollo\\Screenshots\\"+newName+".png");
		FileUtils.copyFile(src, dest);
		System.out.println("Screenshot saved");
	}

}
