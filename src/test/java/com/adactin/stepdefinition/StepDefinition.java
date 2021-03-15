package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.Adactin_Project_batch.Base_Class;
import com.adaction.runner.Runner;
import com.automation.pom.Adactin_Login;
import com.automation.pom.F_Logout;
import com.automation.pom.Fix_Hotel;
import com.automation.pom.Personal_Details;
import com.automation.pom.Search_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	
	//Adactin_Login log = new Adactin_Login(driver);
	
	Adactin_Login log =new Adactin_Login(driver);
	
	F_Logout l_out = new F_Logout(driver);
	
	
	
	Fix_Hotel f_l = new Fix_Hotel(driver);
	
	Personal_Details p_d = new Personal_Details(driver);
	
	Search_Hotel s_h = new Search_Hotel(driver);
	
	
	@Given("^user launch The Application$")
	public void user_launch_The_Application() throws Throwable {
		getUrl("http://adactinhotelapp.com/");
		
	}

	@When("^user Enter The User name In The User Field$")
	public void user_Enter_The_User_name_In_The_User_Field() throws Throwable {
		
		inputValueElement(log.getUsername(), "KumarSandeep");
	}

	@When("^user Enter The Passward In the Passward Field$")
	public void user_Enter_The_Passward_In_the_Passward_Field() throws Throwable {
		
		inputValueElement(log.getPassward(), "06744L");
	}

	@Then("^user  Click On The Login Button And Its  Navigate To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_Its_Navigate_To_Search_Hotel_Page() throws Throwable {
	
		clickOnElement(log.getLogin());
	}

	@When("^user Select The Location In Location Field$")
	public void user_Select_The_Location_In_Location_Field() throws Throwable {
		dropDown(s_h.getLocation(), "value", "Melbourne");
		
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
	}

	@When("^user Select The Room Type in Room Field$")
	public void user_Select_The_Room_Type_in_Room_Field() throws Throwable {
	}

	@When("^user Select The Number Of Rooms In Number Of RoomField$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_RoomField() throws Throwable {
	}

	@When("^user Check In Date In Check In Date Field$")
	public void user_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	}

	@When("^user Check Out Date In Check Out Date Field$")
	public void user_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	}

	@When("^user Select The Room For Adults$")
	public void user_Select_The_Room_For_Adults() throws Throwable {
	}

	@When("^user Select The Room For Children$")
	public void user_Select_The_Room_For_Children() throws Throwable {
	}

	@Then("^user Click On The Search Button And its Navigate To Select Hotel$")
	public void user_Click_On_The_Search_Button_And_its_Navigate_To_Select_Hotel() throws Throwable {
	}

	@When("^user Click On The Radio Button$")
	public void user_Click_On_The_Radio_Button() throws Throwable {
	}

	@Then("^user Clickon The Continue Button And Its Navigate To Book A Hotel Class$")
	public void user_Clickon_The_Continue_Button_And_Its_Navigate_To_Book_A_Hotel_Class() throws Throwable {
	}

	@Given("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
	}

	@Given("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
	}

	@Given("^user Enter The BillingAddress$")
	public void user_Enter_The_BillingAddress() throws Throwable {
	}

	@Given("^user Select The Credit Card Number$")
	public void user_Select_The_Credit_Card_Number() throws Throwable {
	}

	@Given("^user Select The Credit CardType$")
	public void user_Select_The_Credit_CardType() throws Throwable {
	}

	@Given("^user Select The month$")
	public void user_Select_The_month() throws Throwable {
	}

	@Given("^user Select The Year$")
	public void user_Select_The_Year() throws Throwable {
	}

	@Given("^user Enter The cvv Number$")
	public void user_Enter_The_cvv_Number() throws Throwable {
	}

	@Then("^user Click The Book Noe Button And Its Navigate to Booking Confirmation$")
	public void user_Click_The_Book_Noe_Button_And_Its_Navigate_to_Booking_Confirmation() throws Throwable {
	}
	
	@Then("^user Click On Logout Button To Leave That Page$")
	public void user_Click_On_Logout_Button_To_Leave_That_Page() throws Throwable {
	}


}
