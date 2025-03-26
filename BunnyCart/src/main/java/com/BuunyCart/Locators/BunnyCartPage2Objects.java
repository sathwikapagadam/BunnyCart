package com.BuunyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class BunnyCartPage2Objects extends Browser{
	public static By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	public static By email = By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[3]/div/input");
//	public static By enterPassword = By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[4]/div/input");
	public static By clickSignIn = By.xpath("//html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[5]/div[1]/button/span");
	public static By into = By.xpath("/html/body/div[3]/aside[1]/div[2]/header/button");
	public static By searchProduct = By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/input");
	public static By selectProduct = By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/div[5]/div[1]/a/div[2]/div[1]");
	public static By addCart = By.xpath("//*[@id=\"product-addtocart-button\"]");
	public static By type = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[3]/div[5]/form/div[1]/div/div/div/div/div[1]");
	
	public static WebElement signIn()
	{
		return driver.findElement(signIn);
	}
   public static WebElement email()
   {
	   return driver.findElement(email);
   }
//	public static WebElement password()
//	{
//		return driver.findElement(enterPassword);
//	}
	public static WebElement clickSignInButton()
	{
		return driver.findElement(clickSignIn);
	}
	public static WebElement clickInto()
	{
		return driver.findElement(into);
	}
	public static WebElement searchProduct()
	{
		return driver.findElement(searchProduct);
	}
	public static WebElement selectProduct()
	{
		return driver.findElement(selectProduct);	
	}
	public static WebElement clickType()
	{
		return driver.findElement(type);
	}
	public static WebElement addToCart()
	{
		return driver.findElement(addCart);
	}
}
