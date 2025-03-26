package com.BuunyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class BunnyCartPage3Objects extends Browser{
	public static By email = By.xpath("//*[@id=\"email-login\"]");
	public static By password = By.xpath("//*[@id=\"pass-login\"]");
	public static By clickSignIn = By.xpath("//*[@id=\"send2-login\"]");
	public static WebElement password()
	{
		return driver.findElement(password);
	}
	public static WebElement signIn()
	{
		return driver.findElement(clickSignIn);
	}
	public static WebElement email()
	{
		return driver.findElement(email);
	}

}
