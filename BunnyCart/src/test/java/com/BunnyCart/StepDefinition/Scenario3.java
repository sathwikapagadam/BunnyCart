package com.BunnyCart.StepDefinition;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.BunnyCartPage3;

import io.cucumber.java.en.And;

public class Scenario3 {

@And("User enters invalid {string} password")
public void user_enters_invalid_password(String string) {
    BunnyCartPage3.enterPassword("Sathwika@");
}

@And("User close the Browser")
public void user_close_the_browser() {
    Browser.closeBrowser();
}

@And("User enters valid {string} password")
public void user_enters_valid_password(String string) {
   BunnyCartPage3.enterPassword("Sathwika@123");
}
@And("User click on sign in button")
public void user_click_on_sign_in_button() {
    BunnyCartPage3.clickSignIn();
}
@And("User enters invalid {string} email")
public void user_enters_invalid_email(String string) {
    BunnyCartPage3.enterEmail("sathwikapagadam@gmail.com");
}

@And("User enters valid {string} email")
public void user_enters_valid_email(String string) {
  BunnyCartPage3.enterEmail("pagadamsathwika@gmail.com");
}

}
