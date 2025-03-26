package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BuunyCart.Locators.BunnyCartPage2Objects;
import com.BuunyCart.Locators.BunnyCartPage5Objects;
import com.aventstack.extentreports.Status;

public class BunnyCartPage5 extends Browser{
	static {
		init("BunnyCartPage5_Report");
	}
	public static void clickSignIn()
	{
		logger1 = extent.createTest("Click Sign In");
	    logger1.log(Status.INFO, "Attempting to click on Sign In button");

	    try {
	        BunnyCartPage5Objects.signIn().click();
	        logger1.log(Status.PASS, "Successfully clicked on Sign In button");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click on Sign In button: " + e);
	        System.out.println("SignIn: " + e);
	    }

	    extent.flush();
	}
	public static void enterEmail(String str)
	{
		 logger1 = extent.createTest("Enter Email");
		 logger1.log(Status.INFO, "Entering email: " + str);

		    try {
		        Thread.sleep(2000);
		        BunnyCartPage5Objects.email().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered email: " + str);
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter email: " + e);
		        System.out.println("Email: " + e);
		    }

		    extent.flush();
	}
	public static void enterPassword(String str)
	{
		 logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering password");

		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[4]/div/input")))
		            .sendKeys(str);
		        
		        logger1.log(Status.PASS, "Password entered successfully");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter password: " + e);
		        System.out.println("Password: " + e);
		    }

		    extent.flush();
	}
	public static void clickSignOut()
	{
		logger1 = extent.createTest("Click Sign Out");
	    logger1.log(Status.INFO, "Attempting to click Sign Out");

	    try {
	        BunnyCartPage5Objects.signOut().click();
	        logger1.log(Status.PASS, "Sign Out clicked successfully");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click Sign Out: " + e);
	        System.out.println("SignOut: " + e);
	    }

	    extent.flush();	}

}
