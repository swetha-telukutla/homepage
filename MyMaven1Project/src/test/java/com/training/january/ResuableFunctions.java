package com.training.january;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;




//import com.relevantcodes.extentreports.LogStatus;

public class ResuableFunctions {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest Logger;
	//Name of the method:ExtentReport
	public static void stratExtentReport(){
		System.out.println("start");
		//initialize extent report
		String path = "C:\\Swetha\\JanQaReports\\Test1.html";
		report = new ExtentReports(path,false);
		//initialize logger
		Logger = report.startTest("Login to SFDC");
	}
	//Name of the method:InitialzindDriver
	public static void initializeDriver() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
		driver = new ChromeDriver();

	}
	//Name of the method:Launching Url
	public static void launch(String url) {

		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Pass:Salesforce application page is displayed");
		Logger.log(LogStatus.PASS, url + "Salesforce application is displayed");
	}
	//Name of the method:FindElement
	public static WebElement findElement(By location, String element) {

		WebElement obj = null;
		try {
			obj = driver.findElement(location);
			System.out.println("pass:" + element+" " + "found on the page");
			Logger.log(LogStatus.PASS, element + " found on the page");

		} catch (NoSuchElementException errMessage) {
			System.out.println("Fail:" + element + "not found on the page");
			 Logger.log(LogStatus.FAIL, element);

		}
		return obj;
	}
	//Creating the method for enterText
	public static void enterText(WebElement element,String textVal) throws InterruptedException
	{
		if(element.isDisplayed()){
			Thread.sleep(4000);
			element.sendKeys(textVal);
			System.out.println("Entering into text field is success");
			Logger.log(LogStatus.PASS, element + " entered text successfully");
		}else
			{
			System.out.println("Failed, doesn't exit please chek");
			Logger.log(LogStatus.FAIL, element+"unable to enter the text in the text field");
		}
	}
	/*  Name of the method:clickObject--->Button
	 * Brief Description:Clicking on the button
	 * Arguments :WebElement
	 * Created By:Automation  Team
	 * Created date:03/12/2019
	 * Last Modified:
	 */
	public static void clickObject(WebElement element) throws InterruptedException
	{
		if(element.isDisplayed()){
			Thread.sleep(4000);
			element.click();
			System.out.println("Element is successfully clicked");
			Logger.log(LogStatus.PASS, element + "clicked button successfully");
		}
			else{
				System.out.println("Uanble to find the Button");
				Logger.log(LogStatus.FAIL, element+"unable to click the button");
			}
	}
	public static void clickCheckBox(WebElement element, String value) {
		
		if (element.isDisplayed()) {
			if (element.isSelected()) {
				element.click();
			}
			System.out.println("check box is selected");
			Logger.log(LogStatus.PASS, element+"Checkbox selected");
			// System.out.println("pass: " + objName + "found on the page");
		} else {
			Logger.log(LogStatus.FAIL, element+"checkbox selected");
		}
	}
		public static void selectByValue(WebElement element,String value) throws InterruptedException
		{
			if(element.isDisplayed()){
				Select state=new Select(element);
				state.selectByValue(value);
				System.out.println("Element is selected");
				Logger.log(LogStatus.PASS, element + "Selected element successfully");
			}
			else{
				System.out.println("Unable to select the element");
				Logger.log(LogStatus.FAIL, element+"unable to select the element");
			}
		}
			
			
			public static void endExtentReport(){
				report.endTest(Logger);
				report.flush();
				System.out.println("end");
	
			}
		
	


		
}

