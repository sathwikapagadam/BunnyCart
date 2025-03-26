package com.BunnyCart.Pages;


import com.BunnyCart.Browser.Browser;
import com.BuunyCart.Locators.BunnyCartPage3Objects;
import com.aventstack.extentreports.Status;

public class BunnyCartPage3 extends Browser{
	static {
		init("BunnyCartPage3_Report");
	}
	public static void enterEmail(String str)
	{
		logger1 = extent.createTest("Enter Email");
	    logger1.log(Status.INFO, "Entering Email: " + str);

	    try {
	        Thread.sleep(2000);
	        BunnyCartPage3Objects.email().sendKeys(str);
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
	        BunnyCartPage3Objects.password().sendKeys(str);
	        logger1.log(Status.PASS, "Successfully entered Password");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to enter Password: " + e);
	        System.out.println("Password: " + e);
	    }

	    extent.flush();
	}
	public static void clickSignIn()
	{
		logger1 = extent.createTest("Click Sign In");
	    logger1.log(Status.INFO, "Attempting to click Sign In button");

	    try {
	        BunnyCartPage3Objects.signIn().click();
	        logger1.log(Status.PASS, "Successfully clicked Sign In button");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click Sign In button: " + e);
	        System.out.println("SignIn: " + e);
	    }

	    extent.flush();	
	    }

}

