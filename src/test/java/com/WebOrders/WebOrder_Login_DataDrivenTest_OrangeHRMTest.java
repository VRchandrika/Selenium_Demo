package com.WebOrders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebOrder_Login_DataDrivenTest_OrangeHRMTest extends WebOrder_TestData{

WebDriver driver;
	
	@Test(dataProvider="OrangeHRM_LoginAll_TCs",priority=1)
	public void login_to_app1(String uname, String pass,String Exp_Result) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		Thread.sleep(3000);
		if(Exp_Result.equalsIgnoreCase("Dashboard"))
		{
		String Act_Msg = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
		Assert.assertEquals(Act_Msg, Exp_Result);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).isDisplayed();
		driver.findElement(By.xpath("//ul[@role='menu']/li[4]")).click();
		Thread.sleep(2000);
		}
		else if(Exp_Result.equalsIgnoreCase("Invalid credentials")) {
			String Act_Msg_Error =driver.findElement(By.xpath("//p[text()='Invalid credentials']")).getText();
			Assert.assertEquals(Act_Msg_Error, Exp_Result);
			
		}
		else
		{
			String Act_Error_Msg = driver.findElement(By.xpath("//span[text()='Required']")).getText();
			Assert.assertEquals(Act_Error_Msg, Exp_Result);
			Thread.sleep(2000);
		}
	
	}
	@BeforeTest
	public void pre_condition() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}
	@AfterTest
	public void post_condition() {
		
		driver.close();
	}

				
}
