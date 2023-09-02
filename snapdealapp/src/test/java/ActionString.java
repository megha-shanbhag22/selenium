import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionString {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();

        driver.get("https://www.magicbricks.com/"); 
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        Actions act= new Actions(driver);
        
        String parenthandle=driver.getWindowHandle();
        System.out.println("Parent Window "+parenthandle);
        
        WebElement a=driver.findElement(By.xpath("//*[@id=\"buyheading\"]"));
        act.moveToElement(a).build().perform();
        driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/flats-in-mumbai-for-sale-pppfs']")).click();
        Thread.sleep(2000);
        // getWindow handles

 

        Set<String> handles = driver.getWindowHandles();

 

        for (String h : handles) {
            System.out.println(h);
        }
        
	}

}
