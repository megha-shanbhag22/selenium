import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();

        driver.get("https://www.magicbricks.com/"); 
        driver.manage().window().maximize();

        driver.findElement(By.id("buyheading")).click();
        driver.findElement(By.xpath("//a[@href='https://www.magicbricks.com/flats-in-mumbai-for-sale-pppfs']")).click();
		
		
	}

}
