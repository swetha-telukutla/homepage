package com.training.january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interactions extends ResuableFunctions{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SankarA\\mvn2\\My Maven1Project\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,40);
		driver.get("https://selenium-prd.firebaseapp.com/");
		Thread.sleep(4000);
		WebElement emailUserName =driver.findElement(By.id("email_field"));
		enterText(emailUserName,"admin123@gmail.com");
		WebElement password=driver.findElement(By.id("password_field"));
		enterText(password,"admin123");
		WebElement LoginButton=driver.findElement(By.xpath("//button[@onclick='login()']"));
		clickObject(LoginButton);
		WebElement state=driver.findElement(By.id("state"));
		selectByValue(state,"mba");
		
	}

}
