package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BurgerFactory {
    WebDriver driver;

    @FindBy(xpath="//*[@id=\"root\"]/div[1]/ul/li[3]/span") 
    WebElement login;

    @FindBy(id="mobileNumber")
    WebElement number;
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[2]/button")
    WebElement otp;
    @FindBy(xpath="//*[@id=\"root\"]/div[2]/div/div[1]/div/div/div/div[2]/div[3]/button")
    WebElement verifyotp;
    
    @FindBy(className = "location-input  undefined u_cursor_pointer")
    WebElement d;
    @FindBy(className = "search-autocomplete__search-input location-search-input")
    WebElement loc;
    
    public BurgerFactory(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public void clickbtn() {
        login.click();
    }
    
    public void mobile(String num) throws InterruptedException {
        Thread.sleep(2000);
        number.sendKeys(num);
        otp.click();
        Thread.sleep(18000);
        verifyotp.click();
        Thread.sleep(2000);
        }

    public void location() {
		d.click();
		loc.sendKeys("rabale");
	}
 

}