package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "Passward")
	private WebElement passward;

	@FindBy(id = "login")
	private WebElement login;

	// For Login Taken From POM Class

	public Adactin_Login(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassward() {
		return passward;
	}

	public WebElement getLogin() {
		return login;
	}

}
