package com.BuunyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class BunnyCartPage5Objects extends Browser{
	public static By signIn = By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	public static By email = By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[3]/div/input");
	public static By enterPassword = By.xpath("/html/body/div[3]/aside[1]/div[2]/div/div/div/div/form/fieldset/div[4]/div/input");
	public static By signOut = By.xpath("/html/body/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
	public static WebElement signIn()
	{
		return driver.findElement(signIn);
	}
	 public static WebElement email()
	   {
		   return driver.findElement(email);
	   }
		public static WebElement password()
		{
			return driver.findElement(enterPassword);
		}
		public static WebElement signOut()
		{
			return driver.findElement(signOut);
		}
		

}
