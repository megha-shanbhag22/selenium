import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robots {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();

        driver.get("https://www.saucedemo.com/"); 
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        Robot robo=new Robot();
        robo.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(1000);
        
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_A);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_A);
        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_C);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_C);
        
        robo.keyPress(KeyEvent.VK_TAB);
        
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);
        
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyPress(KeyEvent.VK_ENTER);

        WebElement a=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        System.out.println(a.getText());
        
        
//        robo.keyPress(KeyEvent.VK_TAB);  //username
//        Thread.sleep(1000);
//        robo.keyPress(KeyEvent.VK_TAB);  //pwd
//        Thread.sleep(1000);
//        robo.keyPress(KeyEvent.VK_TAB);  //login       
//        
//        robo.keyPress(KeyEvent.VK_ENTER);
//        robo.keyPress(KeyEvent.VK_ENTER);
//        
//        WebElement a=driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
//        System.out.println(a.getText());
        
	}

}
