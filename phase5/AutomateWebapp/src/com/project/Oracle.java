package com.project;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {
	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		 
		
		
		
		
	    try
	      {
	        System.out.println("Start of delay: "+ new Date());
	        // Delay for 7 seonds
	        Thread.sleep(7000);   
	        System.out.println("End of delay: "+ new Date());
	      }
	      catch(InterruptedException ex)
	      {
	          ex.printStackTrace();
	      }
		
		WebElement email= driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("vipinchaurasiya1052@gmail.com");
		
		
		
	
		
		WebElement pass = driver.findElement(By.id("sView1:r1:0:password::content"));
		pass.sendKeys("Vipin@1223");
		
		WebElement rpass = driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		rpass.sendKeys("Vipin@1223");
		
		WebElement name = driver.findElement(By.id("sView1:r1:0:firstName::content"));
		name.sendKeys("Vipin");
	
		WebElement lname = driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lname.sendKeys("chaurasiya");
		
		WebElement job = driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		job.sendKeys("engg");
		
		WebElement comp = driver.findElement(By.id("sView1:r1:0:companyName::content"));
		comp.sendKeys("qt");
		
		WebElement phone = driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		phone.sendKeys("7039164773");
		
		WebElement add = driver.findElement(By.id("sView1:r1:0:address1::content"));
		add.sendKeys("1st carpenter street");
		
		WebElement city = driver.findElement(By.id("sView1:r1:0:city::content"));
		city.sendKeys("Mumbai");
		
		WebElement state = driver.findElement(By.id("sView1:r1:0:state::content"));
		state.sendKeys("maharashtra");
		
		WebElement zip = driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		zip.sendKeys("400004");
		
		
		
		
		
		
		WebElement button= driver.findElement(By.id("sView1:r1"));
		button.submit();
	//	driver.close();
	}

}
