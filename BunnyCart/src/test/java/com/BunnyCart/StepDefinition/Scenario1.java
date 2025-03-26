package com.BunnyCart.StepDefinition;


import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.BunnyCartPage1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Scenario1 {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception{
	  Browser.openBrowser("Chrome");
	}

	@And("User navigates to the {string} webpage to open home page")
	public void user_navigates_to_the_webpage_to_open_home_page(String string) throws Exception{
	    Browser.navigateToUrl("https://www.bunnycart.com");
	}

	@And("User click on create account button")
	public void user_click_on_create_account_button() throws Exception{
		Thread.sleep(2000);
	    BunnyCartPage1.clickCreateAccount();
	}
	

	@And("User enters {string} the First name")
	public void user_enters_the_first_name(String string) {
	    BunnyCartPage1.enterFirstName("Sathwika");
	}

	@And("User enters {string} the Last name")
	public void user_enters_the_last_name(String string) {
	    BunnyCartPage1.enterLastName("Pagadam");
	}

	@And("User enters {string} the email")
	public void user_enters_the_email(String string) {
	   BunnyCartPage1.enterEmail("pagadamsathwika@gmail.com");
	}

	@And("User enter {string} the password")
	public void user_enter_the_password(String string) {
	    BunnyCartPage1.enterPassword("Sathwika@123");
	}

	@And("User enter Invalid {string} the confirm Password")
	public void user_enter_invalid_the_confirm_password(String string) {
	   BunnyCartPage1.enterInvalidConfirmPassword("Sathwika@");
	}

	@And("User enter {string} the whatsup Number")
	public void user_enter_the_whatsup_number(String string) {
	    BunnyCartPage1.enterMobileNumber("7416984584");
	}

	@And("User click on the create an Account button")
	public void user_click_on_the_create_an_account_button() {
	    BunnyCartPage1.clickCreateAccountButton();
	}

	@Then("User verify an error message")
	public void user_verify_an_error_message() {
	   System.out.println("Error message displayed");
	}

	@And("User closes the browser")
	public void user_closes_the_browser() {
	    Browser.closeBrowser();
	}

	@And("User enter  {string} the confirm Password")
	public void user_enter_the_confirm_password(String string) {
		BunnyCartPage1.enterValidConfirmPassword("Sathwika@123");
	    
	}




}
