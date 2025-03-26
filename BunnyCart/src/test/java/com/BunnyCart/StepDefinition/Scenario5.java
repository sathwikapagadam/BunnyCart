package com.BunnyCart.StepDefinition;

import com.BunnyCart.Pages.BunnyCartPage5;

import io.cucumber.java.en.And;

public class Scenario5 {

@And("User click on sign in")
public void user_click_on_sign_in() {
    BunnyCartPage5.clickSignIn();
}

@And("User enter valid {string} email to sign in")
public void user_enter_valid_email_to_sign_in(String string) {
   BunnyCartPage5.enterEmail("pagadamsathwika@gmail.com");
}

@And("User enter valid {string} password to sign in")
public void user_enter_valid_password_to_sign_in(String string) {
   BunnyCartPage5.enterPassword("Sathwika@123");
}

@And("User click on sign out button")
public void user_click_on_sign_out_button() throws Exception{
   Thread.sleep(2000);
   BunnyCartPage5.clickSignOut();
}

}
