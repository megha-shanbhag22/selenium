import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
        
		WebElement fname=driver.findElement(By.id("firstName"));
        js.executeScript("arguments[0].setAttribute('value','Megha');",fname);
        
        Object obj=js.executeScript("return arguments[0].getAttribute('value')",fname);
        String s=(String)obj;
        System.out.println(s);
        
        WebElement lname=driver.findElement(By.id("lastName"));
        js.executeScript("arguments[0].setAttribute('value','Shanbhag');",lname);
        
        Object object=js.executeScript("return arguments[0].getAttribute('value')",lname);
        String str=(String)object;
        System.out.println(str);
        

	}

}
