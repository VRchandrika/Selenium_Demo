package com.WebOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebOrder_Login_DataDrivenTest_OrangeHRM extends WebOrder_TestData{

WebDriver driver;
	
	@Test(dataProvider="LoginOrangeHRM",priority=1)
	public void login_to_app1(String uname, String pass) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed();
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).isDisplayed();
		driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).click();
		Thread.sleep(2000);

	}
	@BeforeTest
	public void pre_condition() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	@AfterTest
	public void post_condition() {
		
		driver.close();
	}
}
