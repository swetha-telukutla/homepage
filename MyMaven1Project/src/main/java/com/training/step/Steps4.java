package com.training.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Steps4 {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
	}
	@Given("^valid url to open salesforce application$")
	public void valid_url_to_open_salesforce_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();  
	}

	@Given("^click on Forgot password$")
	public void click_on_Forgot_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement forgotpw = driver.findElement(By.xpath("//a[@class='fl small']"));
		forgotpw.click();
	}

	@When("^I clicked that  then salesforce forgot password page is displayed$")
	public void i_clicked_that_then_salesforce_forgot_password_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		System.out.println("salesforce forgot password page is displayed");
	}

	@Then("^i provid  valid username$")
	public void i_provid_valid_username() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement un = driver.findElement(By.xpath("//input[@id='un'])"));
		un.sendKeys("shankarreddy.t-ibof@force.com");
		//driver.findElement(By.xpath("//input[@id='un'])")).click();
	}

	@Then("^click on contiune button$")
	public void click_on_contiune_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
		conti.click();
	}

	@Then("^password reset message page is displayed$")
	public void password_reset_message_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Password reset message is displlyed");
	}



}
