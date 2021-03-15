package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personal_Details {

	public static WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cctype;
	
	//Constructor 

	public Personal_Details(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getFname() {
		return fname;
	}

	public void setFname(WebElement fname) {
		this.fname = fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public void setLname(WebElement lname) {
		this.lname = lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public void setCcnum(WebElement ccnum) {
		this.ccnum = ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBk() {
		return bk;
	}

	public void setBk(WebElement bk) {
		this.bk = bk;
	}

	@FindBy(id = "cc_exp_month")
	private WebElement month;

	@FindBy(id = "cc_exp_year")
	private WebElement year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bk;

}
