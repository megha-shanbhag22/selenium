package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BurgerPF {
    WebDriver driver;
    BurgerFactory bf;
  @Test
public void verifyBurger() throws InterruptedException {

      WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.burgerking.in/");
        driver.manage().window().maximize();

        bf=new BurgerFactory(driver);


 

        bf.clickbtn();
        bf.mobile("8308030555");
        bf.location();

 

}}
