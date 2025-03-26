package com.BunnyCart.Pages;

import com.BunnyCart.Browser.Browser;
import com.BuunyCart.Locators.BunnyCartPage4Objects;
import com.aventstack.extentreports.Status;

public class BunnyCartPage4 extends Browser{
	static {
		init("BunnyCartPage4_Report");
	}
	public static void searchProduct1(String str)
	{
		logger1 = extent.createTest("Search Product");
	    logger1.log(Status.INFO, "Attempting to search for product: " + str);

	    try {
	        BunnyCartPage4Objects.product1().sendKeys(str);
	        logger1.log(Status.PASS, "Successfully entered product name: " + str);
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to search product: " + e);
	        System.out.println("Search Product: " + e);
	    }

	    extent.flush();
	}
	public static void selectProduct1()
	{
		logger1 = extent.createTest("Select Product");
	    logger1.log(Status.INFO, "Attempting to select the product");

	    try {
	        BunnyCartPage4Objects.selectProduct1().click();
	        logger1.log(Status.PASS, "Successfully selected the product");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to select product: " + e);
	        System.out.println("Select Product1: " + e);
	    }

	    extent.flush();
	}
	public static void clickProductType1()
	{
		logger1 = extent.createTest("Click Product Type 1");
	    logger1.log(Status.INFO, "Attempting to click on product type");

	    try {
	        BunnyCartPage4Objects.type1().click();
	        logger1.log(Status.PASS, "Successfully clicked on product type");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click on product type: " + e);
	        System.out.println("Click Product Type1: " + e);
	    }

	    extent.flush();
	}
	public static void clickAddToCart1()
	{
		logger1 = extent.createTest("Click Add to Cart 1");
	    logger1.log(Status.INFO, "Attempting to click Add to Cart");

	    try {
	        BunnyCartPage4Objects.addToCart1().click();
	        logger1.log(Status.PASS, "Successfully clicked Add to Cart");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click Add to Cart: " + e);
	        System.out.println("Click AddToCart: " + e);
	    }

	    extent.flush();
	}
	public static void searchProduct2(String str)
	{
		logger1 = extent.createTest("Search Product 2");
	    logger1.log(Status.INFO, "Attempting to search for product: " + str);

	    try {
	        BunnyCartPage4Objects.product2().sendKeys(str);
	        logger1.log(Status.PASS, "Successfully searched for product: " + str);
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to search for product: " + e);
	        System.out.println("Search Product2: " + e);
	    }

	    extent.flush();
	}
	public static void clickProductType2()
	{
		logger1 = extent.createTest("Click Product Type 2");
	    logger1.log(Status.INFO, "Attempting to click on Product Type 2");

	    try {
	        BunnyCartPage4Objects.type2().click();
	        logger1.log(Status.PASS, "Successfully clicked on Product Type 2");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click on Product Type 2: " + e);
	        System.out.println("Click Product Type2: " + e);
	    }

	    extent.flush();
	}
	public static void clickAddToCart2()
	{
		logger1 = extent.createTest("Click Add to Cart 2");
	    logger1.log(Status.INFO, "Attempting to click on Add to Cart button for Product 2");

	    try {
	        BunnyCartPage4Objects.addToCart2().click();
	        logger1.log(Status.PASS, "Successfully clicked on Add to Cart button for Product 2");
	    } catch (Exception e) {
	        logger1.log(Status.FAIL, "Failed to click on Add to Cart button for Product 2: " + e);
	        System.out.println("Click AddToCart2: " + e);
	    }

	    extent.flush();
	}
  
	

}
