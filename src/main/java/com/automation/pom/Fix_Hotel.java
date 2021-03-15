package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fix_Hotel {

	public static WebDriver driver;

	@FindBy(id = "radiobutton_0")
	private WebElement radio_button;
	
	//constructor

	public Fix_Hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getRadio_button() {
		return radio_button;
	}

	public void setRadio_button(WebElement radio_button) {
		this.radio_button = radio_button;
	}

	public WebElement getContinue_button() {
		return continue_button;
	}

	public void setContinue_button(WebElement continue_button) {
		this.continue_button = continue_button;
	}

	@FindBy(id = "continue")
	private WebElement continue_button;

}
