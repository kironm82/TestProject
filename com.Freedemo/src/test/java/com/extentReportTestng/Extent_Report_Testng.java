package com.extentReportTestng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_Report_Testng {
	
	WebDriver driver;
	ExtentReports extent;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
        driver= new ChromeDriver();
        
        //test1.log(Status.INFO, "Staring Test Case");
        driver.get("https://google.com");
       // test1.pass("Navigated to google.com");
		
	}
	@Test
	public void Search() throws IOException {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
      // search.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        
        search.addScreenCaptureFromPath("C:\\Users\\kiron\\Desktop\\pic.png");
   	    extent.flush();
	}
        
	
	@Test
	public void Search1() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest One");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
       // test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        extent.flush();
	}
	
	@Test
	public void Search2() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest Two");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
       // test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        extent.flush();
	}
	
	@Test
	public void Search3() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest Three");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
       // test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        extent.flush();
	}
	
	@Test
	public void Search4() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest Four");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
       // test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        extent.flush();
	}
	
	@Test
	public void Search5() {
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\QA\\com.Freedemo\\Reports.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest search = extent.createTest("SearchTest Five");
		
		driver.findElement(By.name("q")).sendKeys("Automation");
		search.log(Status.INFO, "Search in google");
       // test1.pass("Entered text in Searchbox");
        
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        search.log(Status.PASS, " Search button functionality");
        //test1.pass("Pressed keyboard enter key");
        extent.flush();
	}
        @AfterMethod
        public void tearDown() {
        	//extent.flush();
        	driver.close();
        	driver.quit();
		
        }
		
}
        
        
        


        
		/*
		 * search.log(Status.INFO, "Search in google"); search.log(Status.PASS,
		 * "Title Verify"); extent.flush();
		 * 
		 * ExtentTest searchone = extent.createTest("SearchTestOff");
		 * searchone.log(Status.FAIL, "Title Verify"); extent.flush();
		 */
		

	
	
	
	
	
	
	
	
	
	
	

	/*
	 * ExtentHtmlReporter htmlReporter; ExtentReports extent; WebDriver driver;
	 * 
	 * 
	 * 
	 * @BeforeTest public void setUp() {
	 * 
	 * htmlReporter = new ExtentHtmlReporter("extent.html"); ExtentReports extent =
	 * new ExtentReports(); extent.attachReporter(htmlReporter);
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * ".\\driver\\Chrome\\chromedriver.exe"); driver= new ChromeDriver();
	 * ExtentTest test1 = extent.createTest("Google Search Test One",
	 * "The is a Test to validate Google Search Functionality");
	 * test1.log(Status.INFO, "Staring Test Case");
	 * driver.get("https://google.com"); }
	 * 
	 * @Test public void search(){
	 * 
	 * //ExtentTest test = extent.createTest("MyFirstTest", "Sample description");
	 * 
	 * driver.findElement(By.name("q")).sendKeys("Automation");
	 * //test.pass("Entered text in Searchbox");
	 * 
	 * driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN); //
	 * test.pass("Pressed keyboard enter key");
	 * 
	 * //driver.quit(); //test.pass("Closed The Browser");
	 * 
	 * test.log(Status.INFO, "This step shows usage of log(status, details)");
	 * 
	 * test.info("This step shows usage of info(details)"); test.pass("details",
	 * MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	 * test.addScreenCaptureFromPath("screenshot.png"); // extent.flush(); }
	 * 
	 * @AfterTest public void tearDown() { driver.quit(); //
	 * test.pass("Closed The Browser"); //extent.flush(); driver.quit(); }
	 * 
	 */

