package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_Logout {

	public static WebDriver driver;

	@FindBy(id = "logout")
	private WebElement lg;
	
	//Constructor

	public F_Logout(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getLg() {
		return lg;
	}

	public void setLg(WebElement lg) {
		this.lg = lg;
	}

}
