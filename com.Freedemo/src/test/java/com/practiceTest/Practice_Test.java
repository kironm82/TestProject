package com.practiceTest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice_Test {

	WebDriver driver;
	public static void main(String[] args) {
		
		//WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		
		boolean adminButton= driver.findElement(By.xpath("//*[@id ='menu_admin_viewAdminModule']")).isDisplayed();
		System.out.println("Verification Successful - The correct Element Button is displayed on the web page: "+adminButton);
		
		String title = driver.getTitle();
		String expected = "OrangeHRM";
		
		Assert.assertEquals(title, expected);
		System.out.println("Verification Successful - The correct title is displayed on the web page: "+title);
		driver.quit();
	}

}
