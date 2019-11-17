package com.ExtendReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		
		// initialize the HtmlReporter
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "The is a Test to validate Google Search Functionality");

        System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
        driver= new ChromeDriver();
        
        test1.log(Status.INFO, "Staring Test Case");
        driver.get("https://google.com");
        test1.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Pressed keyboard enter key");
        
        driver.close();
        driver.quit();
        test1.pass("Closed The Browser");
        
        test1.info("Test Completed");
        extent.flush();
        
        
        
       // creates a toggle for the given test, adds all log events under it    
        ExtentTest test2 = extent.createTest("Google Search Test Two", "The is a Test to validate Google Search Functionality");

        System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
        driver= new ChromeDriver();
        
        test2.log(Status.INFO, "Staring Test Case");
        driver.get("https://google.com");
        test2.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test2.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test2.fail("Pressed keyboard enter key");
        
        driver.close();
        driver.quit();
        test2.pass("Closed The Browser");
        
        test2.info("Test Completed");
        extent.flush();
        
        
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test3 = extent.createTest("Google Search Test Two", "The is a Test to validate Google Search Functionality");

        System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
        driver= new ChromeDriver();
        
        test3.log(Status.INFO, "Staring Test Case");
        driver.get("https://google.com");
        test3.pass("Navigated to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test3.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test3.pass("Pressed keyboard enter key");
        
        driver.close();
        driver.quit();
        test3.pass("Closed The Browser");
        
        test3.info("Test Completed");
        
     // calling flush writes everything to the log file
        extent.flush();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		/*
		 * http://extentreports.com/docs/versions/3/java/#basic-example
		 * What is Extent Report
		 * 
		 * HTML Reporting library ExtentReports is an open-source reporting API for Java
		 * and .NET. It creates an interactive HTML report of your test session.
		 * ExtentReports also has a commercial version (Pro)
		 * 
		 * 
		 * How to implement ExtentReports in Selenium Java
		 * 
		 * Step 1 : Add ExentReports libraries in project You can add jars or maven
		 * dependency
		 * 
		 * Step 2 : Create references of ExtentReport func
		 * 
		 * Step 3 : Use ExtentReport functions log, info, pass, fail etc
		 * 
		 * Step 4 : Run and Validate
		 */


        
        
        
	}

}
