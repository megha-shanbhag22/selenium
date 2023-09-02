import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        
        JavascriptExecutor js=(JavascriptExecutor)driver;
        Thread.sleep(1000);
        
        js.executeScript("location.reload()");
        Thread.sleep(1000);
        
        WebElement a=driver.findElement(By.xpath(null));
        js.executeScript("//*[@id=\"main_navbar\"]/ul/li[3]/a");
        js.executeScript("arguments[0].click();", a);

        js.executeScript("window.scrollBy(200,600)");
	}

}
