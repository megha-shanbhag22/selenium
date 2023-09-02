package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LogOutTest {
	WebDriver driver;
  	By menu=By.id("react-burger-menu-btn");
  	By out=By.id("logout_sidebar_link");
  	
  	
  	public LogOutTest(WebDriver driver) {
  		this.driver=driver;
  	}
    @Test
    public void logout() throws InterruptedException {
  	  driver.findElement(menu).click();
  	  Thread.sleep(1000);
  	  driver.findElement(out).click();
  	  
    }
}
