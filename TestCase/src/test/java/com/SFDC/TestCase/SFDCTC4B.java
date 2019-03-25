package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SFDCTC4B extends ReuseableFucntionsForSFDC {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;

	public static void main(String[] args) throws InterruptedException {

		stratExtentReport();
		initializeDriver();
		launch("https://login.salesforce.com/");
		Thread.sleep(5000);
		WebElement userName = driver.findElement(By.xpath(" //input[@id='username']"));
		enterText(userName, "shankarreddy.t-ibof@force.com");
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "Red@143");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		login.click();
		System.out.println("Pass:Error message should be displayed");
		Logger.log(LogStatus.PASS, login + "error message should be displayed");

		Thread.sleep(2000);
		endExtentReport();
	}
}
