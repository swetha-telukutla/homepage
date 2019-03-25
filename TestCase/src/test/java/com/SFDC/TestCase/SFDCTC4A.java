package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

public class SFDCTC4A extends ReuseableFucntionsForSFDC {

	public static void TestCase4A() throws InterruptedException {
		stratExtentReport();
		initializeDriver();
		launch("https://login.salesforce.com/");

		// findElement(By location, String objName)
		WebElement forgotpw = driver.findElement(By.xpath("//a[@class='fl small']"));
		clickObject(forgotpw);
		System.out.println("Salesforce forgot password page is displayed");
		Logger.log(LogStatus.PASS, forgotpw + "Salesforce forgot password page is displayed ");

		WebElement un = driver.findElement(By.name("un"));
		enterText(un, "shankarreddy.t-ibof@force.com");
		// WebElement un = findElement(By.name("un"), "user name");
		// enterText(un, "username", "shankarreddy.t-ibof@force.com");
		// un.click();
		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
		System.out.println("Password reset message page is displayed.");
		Logger.log(LogStatus.PASS, conti + " Password reset message page is displayed");

		WebElement returntologin = driver.findElement(By.linkText("Return to Login"));
		returntologin.click();
		System.out.println("return to login  page is displayed.");
		Logger.log(LogStatus.PASS, returntologin + " Password reset message page is displayed");

		endExtentReport();
	}

}
