package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLog {
    WebDriver driver=null;
  @Test
  public void testLog() throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      driver = new ChromeDriver();         // creating web-driver instance
      driver.get("https://www.saucedemo.com/"); 
      driver.manage().window().maximize();

      LogPageTest lp=new LogPageTest(driver);
      //lp.typeLog("problem_user","secret_sauce");

      lp.typeuser();
      lp.typepass();
      lp.clickbtn();
      HomepageTest t=new HomepageTest(driver);
      t.home();
      
      LogOutTest lo=new LogOutTest(driver);
      lo.logout();
  }
}
