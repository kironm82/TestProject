package com.OrangeHR_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeHR_LoginTestNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		//WebDriver driver;
	System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();

}	
	@Test
	public void titleVerify() {
		String actual_Title = driver.getTitle();
		String expected_Title = "OrangeHR";
		
		if(actual_Title==expected_Title) {
			System.out.println("The Title is Passed:");
		}
		else {
			System.out.println("The Title is Failed");
		}
	}
		@AfterMethod
		public void tearDown() {
		driver.close();	
		
		
		
		
	}
}