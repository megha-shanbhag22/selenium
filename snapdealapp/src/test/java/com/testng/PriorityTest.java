package com.testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

  @Test(priority = 0, invocationCount = 8,threadPoolSize = 2)//(groups="sanity")//
  public void log() {
    System.out.println("Log Method");
    System.out.println("Thread Id: "+Thread.currentThread().getId());
  }
  
  @Test(priority = 2, retryAnalyzer = com.testing.RetryFailed.class)//( dependsOnMethods = "addtocart")//(groups="regression")
  public void search() {
    System.out.println("Search Method");
    Assert.assertEquals(false,true);
  }
  
  @Test(priority = 2)//(groups={"sanity","regression"})(priority = 1, dependsOnMethods = {"log","checkout"})
  public void addtocart() {
    System.out.println("Add to cart method");
  }
  
  @Test(priority = 2)//(groups="regression")//(priority = 2)// enabled = false) skip
  public void checkout() {
    System.out.println("Checkout Method");
  }
}
