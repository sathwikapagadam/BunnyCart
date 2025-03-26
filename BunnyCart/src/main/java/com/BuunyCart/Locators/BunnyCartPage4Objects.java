package com.BuunyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class BunnyCartPage4Objects extends Browser{

	public static By product1 = By.xpath("//*[@id=\"search\"]");
	public static By selectProduct1 = By.xpath("/html/body/div[2]/header/div[2]/div[2]/div[2]/form/div[1]/div/div[5]/div[1]/a/div[2]");
	public static By productType1 = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[3]/div[5]/form/div[1]/div/div/div/div/div[1]");
	public static By addToCart1 = By.xpath("//*[@id=\"product-addtocart-button\"]");
	public static By product2= By.xpath("//*[@id=\"search\"]");
	public static By productType2 = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[3]/div[6]/form/div[1]/div/div/div/div/div[1]");
	public static By addToCart2 = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[3]/div[6]/form/div[2]/div/div/div[2]/button");
	public static By cartIcon = By.xpath("/html/body/div[2]/header/div[3]/div/div/div[4]/a");
	public static WebElement product1()
	{
		return driver.findElement(product1);
	}
	public static WebElement selectProduct1()
	{
		return driver.findElement(selectProduct1);
	}
	public static WebElement type1()
	{
		return driver.findElement(productType1);
	}
	public static WebElement addToCart1() {
		return driver.findElement(addToCart1);
	}
	public static WebElement product2()
	{
		return driver.findElement(product2);
	}
	public static WebElement type2()
	{
		return driver.findElement(productType2);
	}
   public static WebElement addToCart2()
   {
	   return driver.findElement(addToCart2);
   }
  public static WebElement cartIcon()
  {
	  return driver.findElement(cartIcon);
  }
	
}
