package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
	private WebDriver driver;
	private WebDriverWait wait;

	private By userNameField = By.xpath("//input[@id='email']");
	private By passwordField = By.xpath("//input[@id='password']");
	private By loginButton = By.xpath("//button[@type='submit']");
	private By helloName = By.xpath("//span[@class='name']");
	private By toasterMsg = By.xpath("//div[@id='toast-container']");

	public Login(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // 10 seconds explicit wait

	}

	public void enterUserName(String userName) {
		WebElement userField = wait.until(ExpectedConditions.visibilityOfElementLocated(userNameField));
		userField.sendKeys(userName);
	}

	public void enterPassword(String password) {
		WebElement passField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
		passField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginBtn.click();
	}
	
	public String getToasterMessage () {
		WebElement  getToasterMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(toasterMsg));
		return getToasterMessage.getText();
	}

	public String getTheName() {
		WebElement getName = wait.until(ExpectedConditions.visibilityOfElementLocated(helloName));
		return getName.getText();

	}

}
