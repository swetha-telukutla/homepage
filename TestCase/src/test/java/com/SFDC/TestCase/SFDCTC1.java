package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

public class SFDCTC1 extends ReuseableFucntionsForSFDC {

	public static void Testcase1() throws InterruptedException {

		stratExtentReport();
		initializeDriver();
		launch("https://login.salesforce.com/");

		WebElement userName = driver.findElement(By.xpath(" //input[@id='username']"));
		enterText(userName, "shankarreddy.t-ibof@force.com");
		// findElement(By location, String objName)
		WebElement passWord = driver.findElement(By.xpath("//input[@id='password']"));
		enterText(passWord, "");
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		clickObject(login);
		Thread.sleep(2000);
		// WebElement msg=driver.findElement(By.xpath(" //div[@id='error']"));
		// System.out.println(msg.getText());
		String actual_message = driver.findElement(By.xpath(" //div[@id='error']")).getText();

		String expected_error = "Please enter your password.";

		Assert.assertEquals(actual_message, expected_error);

		System.out.println("pass:" + actual_message);
		Logger.log(LogStatus.PASS, actual_message);
		endExtentReport();
	}
}
