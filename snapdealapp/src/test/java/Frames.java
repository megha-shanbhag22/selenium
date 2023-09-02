import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_attributes_link");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.tagName("a")).click();
		
		//driver.findElement(By.id("runbtn")).click();
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("iframeResult");
		
		WebElement frame123=driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame123);
		
		driver.findElement(By.tagName("a")).click();
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("runbtn")).click();
		
	}

}
