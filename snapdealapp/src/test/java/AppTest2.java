import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest2 {

	public static void main(String[] args) {
		
        //driver.get("https://www.saucedemo.com/");
    //    driver.manage().window().maximize();
        //driver.manage().window().minimize();
        //driver.close();

        WebDriverManager.chromedriver().setup();

 

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        
//        driver.findElement(By.name("password")).sendKeys("secret_sauce");
//        Thread.sleep(1000);
//        
//        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.linkText("Gmail")).click();
        //driver.findElement(By.partialLinkText("Ima")).click();

	}

}
