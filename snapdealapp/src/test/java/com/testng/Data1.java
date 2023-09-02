package com.testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data1 {
	
	 
	  @Test(dataProvider = "loginData")

	  public void testlog(String user, String pwd) throws InterruptedException{
		  
		  ChromeDriver driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        WebDriverManager.chromedriver().setup();
	        
	        System.out.println("thread Id: "+Thread.currentThread().getId());
	      driver.findElement(By.id("user-name")).sendKeys(user);
	      driver.findElement(By.id("password")).sendKeys(pwd);
	      driver.findElement(By.id("login-button")).click();
	      Thread.sleep(2000);
	      WebElement a=driver.findElement(By.className("app_logo"));
	      Assert.assertEquals(true,a.isDisplayed());
	      

	  }
	  
	  @DataProvider(parallel = true)
	  public Object[][] loginData(){
		  Object[][] data=new Object[3][2];
		  
		  data[0][0]="standard_user";
		  data[0][1]="secret_sauce";
		  
		  data[1][0]="problem_user";
		  data[1][1]="secret_sauce";
		  
		  data[2][0]="performance_glitch_user";
		  data[2][1]="secret_sauce";
		  
		  return data;
	  }

}

