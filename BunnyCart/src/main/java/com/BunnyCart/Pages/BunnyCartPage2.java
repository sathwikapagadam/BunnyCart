package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Screenshot.Capture;
import com.BuunyCart.Locators.BunnyCartPage2Objects;
import com.aventstack.extentreports.Status;

public class BunnyCartPage2 extends Browser{
	
	static {
		init("BunnyCartPage2_Report");
	}
	
	public static void clickSignIn()
	{
		 logger1 = extent.createTest("Click Sign In");
		 logger1.log(Status.INFO, "Clicking the Sign In button");

		    try {
		        BunnyCartPage2Objects.signIn().click();
		        logger1.log(Status.PASS, "Successfully clicked the Sign In button");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to click Sign In button: " + e);
		        System.out.println("SignIn: " + e);
		    }

		    extent.flush();
	}
	public static void enterEmail(String str)
	{
		 logger1 = extent.createTest("Enter Email");
		 logger1.log(Status.INFO, "Entering Email: " + str);

		    try {
		        Thread.sleep(2000); 
		        BunnyCartPage2Objects.email().sendKeys(str);
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
		    logger1.log(Status.INFO, "Attempting to enter password");

		    try {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[4]/div/input")))
		            .sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered password");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter password: " + e);
		        System.out.println("Password: " + e);
		    }

		    extent.flush();
	}
	public static void signInButton()
	{
		try {
			BunnyCartPage2Objects.clickSignInButton().click();
		}
		catch(Exception e)
		{
			System.out.println("SignIn Button: "+e);
		}
	}
	public static void clickInto()
	{
		 logger1 = extent.createTest("Click Into");
		 logger1.log(Status.INFO, "Attempting to click on the element");

		    try {
		        BunnyCartPage2Objects.clickInto().click();
		        logger1.log(Status.PASS, "Successfully clicked on the element");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to click on the element: " + e);
		        System.out.println("ClickInto: " + e);
		    }

		    extent.flush();
	}
	public static void enterSearchProduct(String str)
	{
		 logger1 = extent.createTest("Enter Search Product");
		 logger1.log(Status.INFO, "Entering product name in search box: " + str);

		    try {
		        BunnyCartPage2Objects.searchProduct().sendKeys(str);
		        logger1.log(Status.PASS, "Successfully entered product name: " + str);
		        logger1.addScreenCaptureFromPath(Capture.screenShot("Product"));
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to enter product name: " + e);
		        System.out.println("Search Product: " + e);
		    }

		    extent.flush();
	}
	public static void selectProductSearchBar()
	{
		logger1 = extent.createTest("Select Product from Search Bar");
	    logger1.log(Status.INFO, "Attempting to select a product from the search bar");

	    try {
	        BunnyCartPage2Objects.selectProduct().click();
	        logger1.log(Status.PASS, "Successfully selected the product from the search bar");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to select the product: " + e);
	        System.out.println("SelectProduct: " + e);
	    }

	    extent.flush();
	}
	public static void clickAddToCart()
	{
		logger1 = extent.createTest("Click Add to Cart");
	    logger1.log(Status.INFO, "Attempting to click the Add to Cart button");

	    try {
	        BunnyCartPage2Objects.addToCart().click();
	        logger1.log(Status.PASS, "Successfully clicked the Add to Cart button");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click Add to Cart: " + e);
	        System.out.println("AddToCart: " + e);
	    }

	    extent.flush();
	}
	public static void clickProductType()
	{
		 logger1 = extent.createTest("Click Product Type");
		 logger1.log(Status.INFO, "Attempting to click on the Product Type");

		    try {
		        BunnyCartPage2Objects.clickType().click();
		        logger1.log(Status.PASS, "Successfully clicked on the Product Type");
		    } catch (Exception e) {
		        logger1.log(Status.FAIL, "Failed to click on Product Type: " + e);
		        System.out.println("Product Type: " + e);
		    }

		    extent.flush();
	}
}
