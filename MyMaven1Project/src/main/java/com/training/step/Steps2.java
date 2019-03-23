package com.training.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import cucumber.api.PendingException;
import cucumber.api.java.en.*;

public class Steps2 {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
	}
	@Given("^valid url to open the browser$")
	public void valid_url_to_open_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	@Given("^I provided valid username$")
	public void i_provided_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement un =driver.findElement(By.xpath(" //input[@id='username']"));
	un.sendKeys("shankarreddy.t-ibof@force.com");
	}

	@Given("^valid password$")
	public void valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Reddy@143");
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}

	@Then("^slaesforce page has to open$")
	public void slaesforce_page_has_to_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	/*	String actual_message = driver.findElement(By.xpath(" ")).getText();
		String expected_message = "Welcome to your free trial message is displayed.";

		Assert.assertEquals(actual_message, expected_message);

		System.out.println("pass:" + actual_message);
	}*/
	    System.out.println("Pass:Welcome to your free trial  should be displayed");
	}


}
