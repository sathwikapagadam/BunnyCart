package com.BunnyCart.Browser;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Screenshot.Capture;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	public static ExtentReports extent;
	public static ExtentSparkReporter reporter;
	public static ExtentTest logger1;
	
	public static void init(String reportName)
	{
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter
		(System.getProperty("user.dir")+"//target//ExtentReports//"+reportName+".html");
	}
	
	public static void openBrowser(String str) throws Exception {	
		if (extent == null) { 
	        init("TestReport");
	    }
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Open Browser");
		logger1.log(Status.INFO, "Opening the Browser");

		try {
			String choice = Utility.properties("browser"); 
			if (choice.equalsIgnoreCase("Chrome"))
				driver = new ChromeDriver();
			else if (choice.equalsIgnoreCase("Edge"))
	    	driver = new EdgeDriver();
			else if (choice.equalsIgnoreCase("Firefox"))
				driver = new FirefoxDriver();
			driver.manage().window().maximize();
			logger1.log(Status.PASS, "Browser Opened Successfully");
			
		} catch (Exception e) {
		// e.printStackTrace();
			System.out.println("Error in opening the Browser");
			logger1.log(Status.FAIL, "Failed Opening Browser");
		}
		extent.flush();
		}

	public static void navigateToUrl(String url) throws Exception {
	    try {
	        driver.get(url); 
	        driver.manage().window().maximize();
	        logger1.addScreenCaptureFromPath(Capture.screenShot("Home Page"));
	    } catch (Exception e) {
	        System.out.println("Failed to open URL: " + e.getMessage());
	    }
	}
	
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		logger1 = extent.createTest("Close Browser");
		logger1.log(Status.INFO, "Closing the Browser");

		try {
			driver.quit();
			logger1.log(Status.PASS, "Browser Closed");

		} catch (Exception e) {

			System.out.println("Error in Closing the Browser");
			logger1.log(Status.FAIL, "Failed Closing the Browser");
		}	
		extent.flush();
	}

}
