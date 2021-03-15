package com.adaction.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project_batch.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adaction//feature", glue = "com\\adactin\\stepdefinition")

public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = Base_Class.getBrowser("Chrome");
	}

	
	  @AfterClass 
	  public static void teardown() {
		  Base_Class.close();
	  
	  }
	 

}
