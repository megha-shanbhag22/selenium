package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomepageTest {
  
  	WebDriver driver;
  	By filter=By.className("product_sort_container");
  	By sort=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");
  	By item=By.xpath("//*[@id=\"item_3_title_link\"]/div");
  	By add=By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
    By cart=By.id("shopping_cart_container");
  	
  	public HomepageTest(WebDriver driver) {
  		this.driver=driver;
  	}
    @Test
    public void home() throws InterruptedException {
  	  driver.findElement(filter).click();
  	  Thread.sleep(1000);
  	  driver.findElement(sort).click();
  	  Thread.sleep(1000);
  	  driver.findElement(item).click();
  	  Thread.sleep(1000);
  	  driver.findElement(add).click();
  	  Thread.sleep(1000);
  	  driver.findElement(cart).click();
  	  Thread.sleep(1000);
    }
    
    
    
    
  }


