package com.BunnyCart.Pages;

import java.time.Duration;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Screenshot.Capture;
import com.BuunyCart.Locators.BunnyCartPage1Objects;
import com.aventstack.extentreports.Status;


public class BunnyCartPage1 extends Browser {
	
	  
    static {
        init("BunnyCartPage1_Report"); 
    } 
    public static void clickCreateAccount()
	{
		    extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click Create Account Button");
		    logger1.log(Status.INFO, "Attempting to click Create Account button");

		    try {
		        BunnyCartPage1Objects.createAccount().click();
		        logger1.log(Status.PASS, "Successfully clicked Create Account button");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to click Create Account button: " + e);
		        System.out.println("Create Account: " + e);
		    }

		    extent.flush();
		}

	public static void enterFirstName(String str)
	{
		
		 logger1 = extent.createTest("Enter First Name");
		 logger1.log(Status.INFO, "Entering First Name: " + str);

		    try {
		        wait = new WebDriverWait(Browser.driver, Duration.ofSeconds(10));
		        BunnyCartPage1Objects.firstName().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered First Name: " + str);
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter First Name: " + e);
		        System.out.println("FirstName: " + e);
		    }

		    extent.flush();
	}
	
	public static void enterLastName(String str)
	{
		
		 logger1 = extent.createTest("Enter Last Name");
		    logger1.log(Status.INFO, "Entering Last Name: " + str);

		    try {
		        BunnyCartPage1Objects.lastName().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered Last Name: " + str);
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter Last Name: " + e);
		        System.out.println("LastName: " + e);
		    }

		    extent.flush();
	}
	public static void enterEmail(String str)
	{
		
		 logger1 = extent.createTest("Enter Email");
		    logger1.log(Status.INFO, "Entering Email: " + str);

		    try {
		        BunnyCartPage1Objects.email().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered Email: " + str);
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter Email: " + e);
		        System.out.println("Email: " + e);
		    }

		    extent.flush();
	}
	public static void enterPassword(String str)
	{
		
		 logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering Password");

		    try {
		        BunnyCartPage1Objects.password().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered Password");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter Password: " + e);
		        System.out.println("Password: " + e);
		    }

		    extent.flush();
	}
	public static void enterInvalidConfirmPassword(String str)
	{
		 logger1 = extent.createTest("Enter Invalid Confirm Password");
		    logger1.log(Status.INFO, "Entering Invalid Confirm Password");

		    try {
		        BunnyCartPage1Objects.invalidConfirmPassword().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered Invalid Confirm Password");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter Invalid Confirm Password: " + e);
		        System.out.println("InvalidConfirmPassword: " + e);
		    }

		    extent.flush();
	}
	public static void enterValidConfirmPassword(String str)
	{
		 logger1 = extent.createTest("Enter Valid Confirm Password");
		    logger1.log(Status.INFO, "Entering Valid Confirm Password");

		    try {
		        BunnyCartPage1Objects.validConfirmPassword().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered Valid Confirm Password");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter Valid Confirm Password: " + e);
		        System.out.println("ValidConfirmPassword: " + e);
		    }

		    extent.flush();
	}
	public static void enterMobileNumber(String str)
	{
		logger1 = extent.createTest("Enter Mobile Number");
	    logger1.log(Status.INFO, "Entering Mobile Number: " + str);

	    try {
	        BunnyCartPage1Objects.enterMobileNumber().sendKeys(str);
	        logger1.log(Status.PASS, "Successfully entered Mobile Number: " + str);
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to enter Mobile Number: " + e);
	        System.out.println("MobileNumber: " + e);
	    }

	    extent.flush();
	}
	public static void clickCreateAccountButton()
	{
		
		 logger1 = extent.createTest("Click Create Account Button");
		 logger1.log(Status.INFO, "Clicking the Create Account Button");

		    try {
		        BunnyCartPage1Objects.createAccountButton().click();
		        logger1.log(Status.PASS, "Successfully clicked the Create Account Button");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to click Create Account Button: " + e);
		        System.out.println("Create Account Button: " + e);
		    }

		    extent.flush();
       
}
}
