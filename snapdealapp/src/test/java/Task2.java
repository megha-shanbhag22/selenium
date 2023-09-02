import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div[1]/h2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(1000);
        
        driver.navigate().back();
        driver.navigate().back();
        
        driver.findElement(By.xpath("//*[@id=\"p_n_feature_five_browse-bin/24103944011\"]/span/a/div/label/i")).click();
      
	}

}
