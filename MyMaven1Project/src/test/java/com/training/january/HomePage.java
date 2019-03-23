package com.training.january;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class HomePage {
	static ExtentReports report;
	static ExtentTest Logger;
	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");
		String path = "C:\\Swetha\\JanQaReports\\Report1.html";
		report = new ExtentReports(path);
		Logger = report.startTest("");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SankarA\\mvn2\\My Maven1Project\\drivers\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,40);
		driver.get("https://selenium-prd.firebaseapp.com/");
		System.out.println("Application Launched Sucessfully");
		Thread.sleep(5000);
		//Enter username
		WebElement emailUserName =driver.findElement(By.id("email_field"));
		emailUserName.sendKeys("admin123@gmail.com");
		System.out.println("email is entered sucessfully");
		Logger.log(LogStatus.PASS,  " Username is enterd in User name field");

		//Enter password
		
		WebElement password=driver.findElement(By.id("password_field"));
		password.clear();
		
		password.sendKeys("admin123");
		System.out.println("Password is entered successfully");
		Logger.log(LogStatus.PASS,  "Password is enterd in User name field");

		//Click login button
		WebElement LoginButton=driver.findElement(By.xpath("//button[@onclick='login()']"));
		LoginButton.click();
		System.out.println("Login buton cliced successfully");
		//Click on the home button
		Thread.sleep(4000);
		WebElement homeTab=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/a[1]"));
		homeTab.click();
		System.out.println("hometab is successfully clicked");
		//enter name
		WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		name.clear();
		name.sendKeys("Sloka");
		//enter father name
		WebElement fatherName=driver.findElement(By.xpath("//input[@id='name']"));
		fatherName.clear();
		fatherName.sendKeys("Shankar");
		//enter postal address
		WebElement postalAdress=driver.findElement(By.id("postaladdress"));
		postalAdress.clear();
		postalAdress.sendKeys("560072");
		//enter personal address
		WebElement personalAdress=driver.findElement(By.id("personaladdress"));
		personalAdress.clear();
		personalAdress.sendKeys("Hyderabad");
		//Identifying gender
		WebElement genderFemale=driver.findElement(By.id("radiobut"));
		genderFemale.click();
		//Select the city from dropdown
		Select city=new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("MUMBAI");
		
		Select course=new Select(driver.findElement(By.id("course")));
		course.selectByVisibleText("MBA");
		Select district=new Select(driver.findElement(By.id("district")));
		district.selectByIndex(1);
		Select state=new Select(driver.findElement(By.id("state")));
		state.selectByValue("mba");;
		WebElement pinCode=driver.findElement(By.id("pincode"));
		pinCode.clear();
		pinCode.sendKeys("20147");
		WebElement email=driver.findElement(By.id("emailid"));
		email.sendKeys("123@gmail.com");
		WebElement submit=driver.findElement(By.xpath("//button[@class='bootbutton']"));
		submit.click();
		report.endTest(Logger);
		report.flush();
		report.close();
		System.out.println("end");
	}}
	