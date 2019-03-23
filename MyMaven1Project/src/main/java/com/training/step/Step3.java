package com.training.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.java.en.*;

public class Step3 {
	static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SankarA\\Downloads\\chromedriver_win32\\chromedriver.exe ");
	}

	@Given("^valid url to open the salesforce application$")
	public void valid_url_to_open_the_salesforce_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();

	}

	@Given("^valid username in the username field$")
	public void valid_username_in_the_username_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement un = driver.findElement(By.xpath(" //input[@id='username']"));
		un.sendKeys("shankarreddy.t-ibof@force.com");

	}

	@Given("^I provide valid password also$")
	public void i_provide_valid_password_also() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("Reddy@143");
	}

	@Given("^select the remeber username  check box$")
	public void select_the_remeber_username_check_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement remember = driver.findElement(By.cssSelector("#rememberUn"));
		clickCheckBox(remember, "Remember Me");
	}

	@When("^I click on login button in salesforce application login page$")
	public void i_click_on_login_button_in_salesforce_application_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}

	@Then("^salesforce home page is displayed$")
	public void salesforce_home_page_is_displayed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Pass:Salesforce home page is displayed");
	}

	@When("^I click on usermenu dropdown$")
	public void i_click_on_usermenu_dropdown() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement selectMenu = driver.findElement(By.id("userNav-arrow"));
		// Select select = new Select(selectMenu);
		selectMenu.click();
		// select.selectByIndex(5);

	}

	@When("^select logout link$")
	public void select_logout_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement logOut = driver.findElement(By.linkText("Logout"));
		logOut.click();
	}

	@Then("^username should be displayed in salesforce login page$")
	public void username_should_be_displayed_in_salesforce_login_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Pass:In Salesforce login page username should be displayed");
	}

	public static void clickCheckBox(WebElement obj, String objName) {
		if (obj == null)
			return;
		if (obj.isDisplayed()) {
			if (!obj.isSelected()) {
				obj.click();
			}
			
			// System.out.println("pass: " + objName + "found on the page");
		} else {
			
			 System.out.println("Fail:" + objName + "could not be found on the page");
		}


}}