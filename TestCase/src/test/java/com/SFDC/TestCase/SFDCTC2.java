package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDCTC2 extends ReuseableFucntionsForSFDC {

	public static void TestCase2() throws InterruptedException {
		stratExtentReport();
		initializeDriver();
		launch("https://login.salesforce.com/");

		WebElement userName = driver.findElement(By.xpath(" //input[@id='username']"));
		enterText(userName, "shankarreddy.t-ibof@force.com");
		// findElement(By location, String objName)
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "Reddy@143");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		clickObject(login);
		Thread.sleep(2000);
		endExtentReport();
	}

}
