package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement n_of_rooms;// =

	@FindBy(id = "datepick_in")
	private WebElement check_in_date;// =

	@FindBy(id = "datepick_out")
	private WebElement check_out_date;// =

	@FindBy(id = "adult_room")
	private WebElement a_Per_room;
	
	//constructor

	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public void setHotel(WebElement hotel) {
		this.hotel = hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getN_of_rooms() {
		return n_of_rooms;
	}

	public void setN_of_rooms(WebElement n_of_rooms) {
		this.n_of_rooms = n_of_rooms;
	}

	public WebElement getCheck_in_date() {
		return check_in_date;
	}

	public void setCheck_in_date(WebElement check_in_date) {
		this.check_in_date = check_in_date;
	}

	public WebElement getCheck_out_date() {
		return check_out_date;
	}

	public void setCheck_out_date(WebElement check_out_date) {
		this.check_out_date = check_out_date;
	}

	public WebElement getA_Per_room() {
		return a_Per_room;
	}

	public void setA_Per_room(WebElement a_Per_room) {
		this.a_Per_room = a_Per_room;
	}

	public WebElement getC_per_room() {
		return c_per_room;
	}

	public void setC_per_room(WebElement c_per_room) {
		this.c_per_room = c_per_room;
	}

	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	@FindBy(id = "child_room")
	private WebElement c_per_room;

	@FindBy(id = "Submit")
	private WebElement search;

}
