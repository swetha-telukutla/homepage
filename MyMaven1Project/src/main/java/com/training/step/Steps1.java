package com.training.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.*;

public class Steps1 {
	static WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
	}
	@Given("^Valid url to open the salesforce application$")
	public void valid_url_to_open_the_salesforce_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
	}

	@Given("^valid username in username field$")
	public void valid_username_in_username_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement un =driver.findElement(By.xpath(" //input[@id='username']"));
		un.sendKeys("abc@gmail.com");
	}

	@Given("^I didnt  provide any password value in password field$")
	public void i_didnt_provide_any_password_value_in_password_field() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));   
	}

	@When("^i click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}

	@Then("^error message should be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual_message = driver.findElement(By.xpath(" //div[@id='error']")).getText();
		String expected_error = "Please enter your password.";

		Assert.assertEquals(actual_message, expected_error);

		System.out.println("pass:" + actual_message);
	}

}

