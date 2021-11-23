package com.PageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProcessPayrollPage {
	
	WebDriver driver;
	
	public ProcessPayrollPage(WebDriver driver) {
		this.driver=driver;
	}
	
    @FindBy(how=How.XPATH,using="//select[@name='payGrouping']")
    WebElement Paygroup;
    
    @FindBy(how=How.XPATH,using="//select[@formcontrolname='year']")
    WebElement Year;

    @FindBy(how=How.XPATH,using="//select[@formcontrolname='month']")
    WebElement Month;
    
    @FindBy(how=How.XPATH,using="//select[@formcontrolname='payRun']")
    WebElement PayRun;
    
    @FindBy(how=How.XPATH,using="//input[@value='Process']")
    WebElement ProcessBtn;
    
    public void ProcessPayroll(String payGrp) {
    	Paygroup.click();
    	List<WebElement> PayGrpValues = driver.findElements(By.xpath("//select[@name='payGrouping']/option"));
    	for(WebElement pgValues:PayGrpValues) {
    		if(payGrp.contains(pgValues.getText())) {
    			pgValues.click();
    		}
    		break;
    	}
    }
    
}
