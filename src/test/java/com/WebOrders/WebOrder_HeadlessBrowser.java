package com.WebOrders;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebOrder_HeadlessBrowser {
	
	WebDriver driver;
	@Test
	public void login_to_app() {
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']")).sendKeys("test");
		driver.findElement(By.cssSelector("input[name='ctl00$MainContent$login_button']")).click();
		driver.findElement(By.linkText("Logout")).isDisplayed();
		driver.findElement(By.xpath("//h2[normalize-space()='List of All Orders']")).isDisplayed();

	}
	@BeforeTest
	public void pre_condition() {
		
		//EdgeOptions options = new EdgeOptions();
		//FirefoxOptions options = new FirefoxOptions();
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.setHeadless(true);
		// options.setHeadless(true);
		options.addArguments("incognito");
		//driver = new EdgeDriver(options);
		//driver = new FirefoxDriver(options);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");
	}
	@AfterTest
	public void post_condition() {
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
