package com.WebOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebOrder_Login {
  @Test
  public void login() {
	//Define browser driver reference
			//WebDriverManager.edgedriver().setup();
			//FirefoxDriver driver = new FirefoxDriver();
			//EdgeDriver driver = new EdgeDriver();
//			WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx");

			driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
			driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
			driver.findElement(By.name("ctl00$MainContent$login_button")).click();
			driver.findElement(By.linkText("Logout")).isDisplayed();
     		driver.findElement(By.linkText("Logout")).click();
			driver.findElement(By.name("ctl00$MainContent$login_button")).isDisplayed();
			driver.quit();
		}
  }

