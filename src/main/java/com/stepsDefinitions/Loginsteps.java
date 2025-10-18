package com.stepsDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.base.Base;
import com.pages.Login;
import com.utils.Config;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	private WebDriver driver;
	private Login loginPage;
	private SoftAssert softassert = new SoftAssert();

	public Loginsteps() {
		System.out.println("Initializing LoginSteps...");
		this.driver = Base.getDriver();
		this.loginPage = new Login(driver);
		System.out.println("WebDriver in LoginSteps: " + driver);
	}

	// -----------------------------------------------

	@Given("the user navigates to login page")
	public void navigateToLoginPage() {
		String baseUrl = Config.getProperty("url"); // ✅ Fetch URL dynamically
		System.out.println("Navigating to: " + baseUrl);
		driver.get(baseUrl);
	}

	@When("the user enters username and password")
	public void enterCredentials() {
		loginPage.enterUserName("mahmoud");
		loginPage.enterPassword("Test@123");
		loginPage.clickOnLoginButton();

	}

	@Then("home page should be opened")
	public void homePageShouldBeOpened() {

		String actualName = loginPage.getTheName();
		String ExpectedName = "Hello, mahmoud";

		softassert.assertEquals(actualName, ExpectedName);
		softassert.assertAll();
	}

	// --------------------------------------------------------

}
