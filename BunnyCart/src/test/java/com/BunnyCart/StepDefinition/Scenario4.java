package com.BunnyCart.StepDefinition;

import com.BunnyCart.Pages.BunnyCartPage4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Scenario4 {

@When("User Search for a product1 {string} in search textbox")
public void user_search_for_a_product1_in_search_textbox(String string) throws InterruptedException {
	Thread.sleep(2000);
   BunnyCartPage4.searchProduct1("Dwarf Hairgrass");
}


@And("User select product1 from the search results")
public void user_select_product1_from_the_search_results() {
    BunnyCartPage4.selectProduct1();
}

@And("User click type of the product1")
public void user_click_type_of_the_product1() {
   BunnyCartPage4.clickProductType1();
}

@When("User Search for product2 {string} in search textbox")
public void user_search_for_product2_in_search_textbox(String string) {
   BunnyCartPage4.searchProduct2("Money Plant");
}



@And("User click type of the product2")
public void user_click_type_of_the_product2() throws Exception {
   Thread.sleep(2000);
   BunnyCartPage4.clickProductType2();
}


@And("User click on Add to cart for product1")
public void user_click_on_add_to_cart_for_product1() {
    BunnyCartPage4.clickAddToCart1();
}

@And("User click on Add to cart for product2")
public void user_click_on_add_to_cart_for_product2() throws InterruptedException {
	Thread.sleep(2000);
	BunnyCartPage4.clickAddToCart2();
    }

}
