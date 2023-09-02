package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogFactory {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	

	@FindBy(id="password")
	WebElement pass;
	
	
	@FindBy(id="login-button")
	WebElement logbtn;
	
	public LogFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	

  public void swaglog(String uname, String pwd)
	    {
      username.sendKeys(uname);
      pass.sendKeys(pwd);
  }
	    
	    public void clickbtn() {
	        logbtn.click();
	    }
	}

