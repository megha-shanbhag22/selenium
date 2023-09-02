package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogPageTest {
	WebDriver driver;
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By logbtn=By.cssSelector("#login-button");
	
	public LogPageTest(WebDriver driver) {
		this.driver=driver;
	}
  @Test
  public void typelog(String uid, String pass) {
	  driver.findElement(uname).sendKeys(uid);
	  driver.findElement(pwd).sendKeys(pass);
	  driver.findElement(logbtn).click();
  }
  
  public void typeuser() {
	  driver.findElement(uname).sendKeys("standard_user");
  }
  
  public void typepass() throws InterruptedException {
	  driver.findElement(pwd).sendKeys("secret_sauce");
	  Thread.sleep(1000);
  }
  
  public void clickbtn() {
	  driver.findElement(logbtn).click();
  }
  
  
}
