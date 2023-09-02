

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {

	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("Webdriver.chrome.driver", "‪C:\\drivers\\chromedriver.exe");
		  
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://www.saucedemo.com");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
	        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
	        driver.findElement(By.xpath("//input[@value='Login']")).click();
	        
	      /*  //WebElement a=driver.findElement(By.id("user-name"));
	        //a.sendKeys("standard_user");
	        driver.findElement(By.id("user-name")).sendKeys("standard_user");
	        Thread.sleep(1000);
	        
	       // WebElement b=driver.findElement(By.id("password"));
	       // b.sendKeys("secret_sauce");
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        Thread.sleep(1000);
	        
	        //WebElement c=driver.findElement(By.id("login-button"));
	        //c.click();
	        driver.findElement(By.id("login-button")).click();
	        //driver.close();*/
	}

}
