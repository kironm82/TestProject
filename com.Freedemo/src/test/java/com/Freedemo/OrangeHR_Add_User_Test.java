package com.Freedemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHR_Add_User_Test {

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
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.xpath("//*[@id='btnAdd']")).click();
		Select select = new Select(driver.findElement(By.xpath("//*[@id='systemUser_userType']")));
		select.selectByVisibleText("ESS");
		
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Linda Anderson");
		driver.findElement(By.id("systemUser_userName")).sendKeys("kiron");
		Select scle = new Select(driver.findElement(By.id("systemUser_status")));
		scle.selectByVisibleText("Enable");
		
		driver.findElement(By.id("systemUser_password")).sendKeys("kiron123");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("kiron123");
		//driver.findElement(By.id("btnSave")).click();
		
		
		
		
		driver.close();
		
		
		

	}

}
