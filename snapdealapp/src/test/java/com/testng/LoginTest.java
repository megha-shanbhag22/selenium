package com.testng;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	  WebDriver driver;

	  @BeforeTest
	  public void initializeBrowser() {

	        driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        WebDriverManager.chromedriver().setup();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  }
	  @Test (expectedExceptions= {NoSuchElementException.class})
//	  @Parameters({"username", "password"})
//	  public void test1(@Optional("problem_user")String username, @Optional("secret_sauce")String password){
	  public void test1() throws InterruptedException{
		  //Thread.sleep(1000);
	      driver.findElement(By.id("username")).sendKeys("problem_user");
	      driver.findElement(By.id("password")).sendKeys("secret_sauce");
	      driver.findElement(By.id("login-button")).click();


	  }
	  @AfterTest
	  public void teardown() {
	      driver.close();
	  }
}
