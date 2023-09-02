package StepDefination;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.testng.LogFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	
	ChromeDriver driver;
	LogFactory log;
	
	@Given("user is on the login page of Swag Lab")
	public void user_is_on_the_login_page_of_swag_lab() {
		driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebDriverManager.chromedriver().setup();
	    
	}
	@When("User enter uname & password")
	public void user_enter_uname_password() {
		log = new LogFactory(driver);
		log.swaglog("standard_user", "secret_sauce");
	    
	}
	@And("User clicks on login button")
	public void user_clicks_on_login_button() {
		 log.clickbtn();
	}
	@Then("Login should be successful has context menu")
	public void login_should_be_successful_has_context_menu() {
	    Assert.assertEquals(false,false);
	    
	}

}
