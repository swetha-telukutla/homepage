package com.SFDC.TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDCTC5 extends ReuseableFucntionsForSFDC {
	public static void  TestCase5() throws InterruptedException {
		
	 
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

		String s1 = driver.findElement(By.linkText("My Profile")).getText();
		String s2 = "My Profile";
		CompareString(s1, s2);

		System.out.println(s1 + "is equal to" + s2);
		String s3 = driver.findElement(By.linkText("My Settings")).getText();
		String s4 = "My Settings";
		CompareString(s3, s4);

		String s5 = driver.findElement(By.linkText("Developer Console")).getText();
		String s6 = "Developer Console";
		CompareString(s5, s6);
		String s7 = driver.findElement(By.linkText("Logout")).getText();
		String s8 = "Logout";
		CompareString(s7, s8);
		System.out.println(s7+"is equal to "+s8);
		endExtentReport();
	}
}
