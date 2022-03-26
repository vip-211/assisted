package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class FacebookTest {
	WebDriver driver;
	SoftAssert soft;

	@BeforeMethod
	public void beforeMethod() {
		soft = new SoftAssert();
	}

	@AfterMethod
	public void afterMethod() {
		soft = null;
	}

	@Test
	public void launchAma() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement nav = driver.findElement(By.id("nav-link-accountList"));
		nav.click();

		WebElement sub = driver.findElement(By.id("createAccountSubmit"));
		sub.click();

		WebElement name = driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("vipin");

		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("vip@gmail.com");

		WebElement pass = driver.findElement(By.id("ap_password"));
		pass.sendKeys("12345678");
		
	}


	@Test(dependsOnMethods = { "launchAma" })
	public void testTitle() {
//        soft.assertEquals("Facebook – log in or sign up", driver.getTitle());
		soft.assertAll();
//        driver.close();
	}
	@Test(priority = 2)
	  public void login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	      
	      driver.findElement(By.id("nav-link-accountList")).click();
	      driver.findElement(By.id("ap_email")).sendKeys("vip@gmail.com");
		  driver.findElement(By.id("continue")).click();
	   //   driver.findElement(By.id("ap_password")).sendKeys("12345678");


	  }
	  @Test(priority = 3)
	  public void addToCart() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
		      
		    System.out.println(driver.getTitle());
		    System.out.println(driver.getCurrentUrl());
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone 13");
		    Thread.sleep(5000);
		    driver.findElement(By.id("nav-search-submit-button")).submit();
//		    driver.findElement(By.linkText("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_1_sspa?crid=3DU44GXYA2NPD&keywords=apple+iphone+13&qid=1648269518&sprefix=apple+iphone+13%2Caps%2C666&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyVDAzQUwxTDJKUzZJJmVuY3J5cHRlZElkPUEwNDM4NzYzM01KSU9XU0NDUTZDVCZlbmNyeXB0ZWRBZElkPUEwODcyNzYwMUhEVFBCM1JUVkk5MSZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=")).click();
		    driver.findElement(By.className("s-image")).click();
//		    Thread.sleep(5000);
		   	        driver.findElement(By.className("a-button-text")).submit();
	  }

}
