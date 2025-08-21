package com.WebOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HDFC_NetBanking {
	//Global Variable 
			WebDriver driver;
			
			@AfterTest
			public void CloseBrowser()
			{
				driver.close();
			}
			
			
			@Test
			public void login_to_app() throws InterruptedException {
				Thread.sleep(5000);
				driver.switchTo().frame("login_page");
		
				driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1000");
				driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
				driver.switchTo().defaultContent();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//label[text()='Password/IPIN']")).isDisplayed();
				
				//driver.findElement(By.linkText("Password/IPIN")).isDisplayed();
				//driver.findElement(By.linkText("Logout")).click();
				
			}
		
		
		@BeforeTest
		public void LaunchBrowser() {
			// Define browser driver reference
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			// WebDriverManager.chromedriver().setup();
			// WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://netbanking.hdfcbank.com/netbanking/");
		}
		
		/*
		 * 	EdgeDriver driver;
	// WebDriver driver;

	@Test(priority=2)
	public void EnterCustomerID() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("login_page");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("1000");
		//driver.findElementByXPath("//img[@alt='continue']").click();
		//driver.findElement(By.xpath(""));
		driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Password/IPIN']")).isDisplayed();
		//driver.switchTo().frame(1);
		//driver.findElement(By.xpath("Terms and Conditions")).click();
		
	}
		 */
}
