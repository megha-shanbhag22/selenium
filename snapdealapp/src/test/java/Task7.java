import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.findElement(By.id("alertButton")).click();
//		String text=driver.switchTo().alert().getText();
//		System.out.println(text);
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("timerAlertButton")).click();
//		String text1=driver.switchTo().alert().getText();
//		System.out.println(text1);
//		Thread.sleep(6000);
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.id("confirmButton")).click();
//		String text1=driver.switchTo().alert().getText();
//		System.out.println(text1);
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("promtButton")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("yellow");
		driver.switchTo().alert().accept();
	}

}
