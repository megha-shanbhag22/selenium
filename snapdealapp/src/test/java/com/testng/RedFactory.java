package com.testng;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RedFactory {

	   WebDriver driver;
	    List<RedFactory> rediffs = new ArrayList<>();

	    @FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")WebElement fullName;
	    @FindBy(xpath="//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")WebElement mailid;
	    @FindBy(id="newpasswd")WebElement pwd;
	    @FindBy(id="newpasswd1")WebElement re_password;
	    @FindBy(xpath="//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")WebElement alternateId;
	    @FindBy(xpath="//input[@id='mobno']")WebElement mobNo;
	    @FindBy(xpath="//*[@id=\"Register\"]")WebElement createBtn;


	    public RedFactory(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }

	    public void swags(String fullname ,String mailId ,String password,String repass ,String alternateMailId) {
	        fullName.sendKeys(fullname);
	        mailid.sendKeys(mailId);
	        pwd.sendKeys(password);
	        re_password.sendKeys(repass);
	        alternateId.sendKeys(alternateMailId);
	        //mobNo.sendKeys(mobileNo);        
	    }

	    public void clickbtn() {
	        createBtn.click();
	    }
}
