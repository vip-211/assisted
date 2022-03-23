package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class oracleLogin {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\selenium\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://login.oracle.com/mysso/signon.jsp?request_id=007");


WebElement username=driver.findElement(By.id("sso_username"));
username.sendKeys("vipinchaurasiya1052@gmail.com");

WebElement pass =driver.findElement(By.id("ssopassword"));
pass.sendKeys("Vipin@1223");

WebElement button= driver.findElement(By.id("signin_button"));
button.submit();

}

}
