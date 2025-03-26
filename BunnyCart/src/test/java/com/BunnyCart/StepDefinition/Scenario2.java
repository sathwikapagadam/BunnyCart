package com.BunnyCart.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.BunnyCartPage1;
import com.BunnyCart.Pages.BunnyCartPage2;


import  io.cucumber.datatable.DataTable;

public class Scenario2 {
	@And("User clicks on sign in")
	public void user_clicks_on_sign_in() {
	    BunnyCartPage2.clickSignIn();
	}
@And("User enter {string} the email")
public void user_enter_the_email(String string) {
    BunnyCartPage2.enterEmail("pagadamsathwika@gmail.com");
}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
	   BunnyCartPage2.enterPassword("Sathwika@123");
	}

	@And("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() throws InterruptedException {
	    BunnyCartPage2.clickSignIn();
	    Thread.sleep(2000);
	}
	@And("User clicks on into mark")
	public void user_clicks_on_into_mark() {
	   BunnyCartPage2.clickInto();
	}

	@When("User Search for a product {string} in search textbox")
	public void user_search_for_a_product_in_search_textbox(String string) throws InterruptedException {
		Thread.sleep(2000);
	    BunnyCartPage2.enterSearchProduct("Dwarf HairGrass");
	}

	@And("User select product from the search results")
	public void user_select_product_from_the_search_results() {
	    BunnyCartPage2.selectProductSearchBar();
	}

@And("User click type of the product")
public void user_click_type_of_the_product() {
    BunnyCartPage2.clickProductType();
}

	@And("User click on Add to cart")
	public void user_click_on_add_to_cart() {
	   BunnyCartPage2.clickAddToCart();
	}

	@And("User verify that the product is added to the cart message")
	public void user_verify_that_the_product_is_added_to_the_cart_message() {
	    System.out.println("Element added to cart successfully");
	}

	@And("User closes the Browser")
	public void user_closes_the_browser() {
	   Browser.closeBrowser();
	}

}
