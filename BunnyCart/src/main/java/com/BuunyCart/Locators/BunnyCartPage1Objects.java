package com.BuunyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class BunnyCartPage1Objects extends Browser{
	public static By createAccount = By.xpath(" //a[@class='customer-register-link']\r\n");
	public static By enterFirstName = By.xpath("//input[@id='firstname']\r\n");
	public static By enterLastName = By.xpath("//input[@id='lastname']\r\n");
	public static By enterEmail = By.xpath("//input[@id='popup-email_address']\r\n");
	public static By password = By.xpath("//input[@id='popupPassword']\r\n");
	public static By invalidConfirmPassword = By.xpath("//input[@id='password-confirmation']\r\n");
	public static By validConfirmPassword = By.xpath("//input[@id='password-confirmation']\r\n");
	public static By mobileNumber = By.xpath("//input[@id='mobilenumber']\r\n");
	public static By createAccountButton = By.xpath("//*[@id=\"customer-popup-form-register\"]/div[2]/div[1]/button");
	public static WebElement createAccount()
	{
		return driver.findElement(createAccount);
	}
	public static WebElement firstName()
	{
		return driver.findElement(enterFirstName);
	}
	
	public static WebElement lastName()
	{
		return driver.findElement(enterLastName);
	}
	public static WebElement email()
	{
		return driver.findElement(enterEmail);
	}
	public static WebElement password()
	{
		return driver.findElement(password);
	}
	public static WebElement invalidConfirmPassword()
	{
		return driver.findElement(invalidConfirmPassword);
	}
	public static WebElement validConfirmPassword()
	{
		return driver.findElement(validConfirmPassword);
	}
	public static WebElement enterMobileNumber()
	{
		return driver.findElement(mobileNumber);
	}
	public static WebElement createAccountButton()
	{
		return driver.findElement(createAccountButton);
	}

}
