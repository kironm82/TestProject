package com.Freedemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class OrangeHR_Login_Element_Test {
	//WebDriver driver;
	
	public static void main(String[] args) {
		

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\driver\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String title = driver.getTitle();
		String expected = "OrangeHRM";
		Assert.assertEquals(title, expected);
		System.out.println(title);
		
		
		/*
		 * driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click()
		 * ; driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
		 * driver.navigate().refresh(); driver.navigate().back();
		 * 
		 * driver.findElement(By.xpath("//*[@id='menu_leave_viewLeaveModule']")).click()
		 * ; driver.navigate().back();
		 * driver.findElement(By.xpath("//*[@id='menu_time_viewTimeModule']")).click();
		 * driver.navigate().back(); driver.findElement(By.xpath(
		 * "//*[@id='menu_recruitment_viewRecruitmentModule']")).click();
		 * driver.navigate().refresh();
		 * 
		 * driver.findElement(By.xpath("//*[@id='menu__Performance']")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.xpath("//*[@id='menu_dashboard_index']")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.xpath("//*[@id='menu_directory_viewDirectory']")).click
		 * (); driver.navigate().refresh();
		 * 
		 * driver.findElement(By.xpath("//*[@id='menu_maintenance_purgeEmployee']")).
		 * click(); driver.navigate().back();
		 * driver.findElement(By.xpath("//*[@id='MP_link']")).click();
		 * driver.navigate().back();
		 * driver.findElement(By.xpath("//*[@id='welcome']")).click();
		 * driver.navigate().back();
		 * 
		 * driver.navigate().refresh();
		 * 
		 */
		driver.close();
		
		
		
		
		

	}

}
