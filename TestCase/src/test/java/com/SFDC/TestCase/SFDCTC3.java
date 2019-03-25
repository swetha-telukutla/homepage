package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class SFDCTC3 extends ReuseableFucntionsForSFDC {

	public  static void  TestCase3() throws InterruptedException {
		stratExtentReport();
		initializeDriver();
		launch("https://login.salesforce.com/");

		WebElement userName = driver.findElement(By.xpath(" //input[@id='username']"));
		enterText(userName, "shankarreddy.t-ibof@force.com");
		// findElement(By location, String objName)
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "Reddy@143");
		WebElement remember = driver.findElement(By.cssSelector("#rememberUn"));
		clickCheckBox(remember, "Remember Me");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		clickObject(login);
		Thread.sleep(2000);
		WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
		clickObject(userMenu);
		Logger.log(LogStatus.PASS, userMenu + "UserMenu  is displayed");
		WebElement logOut = driver.findElement(By.linkText("Logout"));
		clickObject(logOut);
		Logger.log(LogStatus.PASS, logOut + "logout is selected");

		endExtentReport();
	}

}
