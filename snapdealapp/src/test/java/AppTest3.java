import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.saucedemo.com/");
		/*WebElement a=driver.findElement(By.id("user-name"));
		System.out.println(a.getTagName());
		System.out.println(a.getCssValue("font-family"));
		System.out.println(a.getCssValue("width"));
		
		String text=driver.findElement(By.xpath("//div[@class='login_password']/h4")).getText();
		System.out.println(text);*/
		
		List<WebElement> list= driver.findElements(By.tagName("input"));
		System.out.println(list.size());
		
		
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
//		driver.manage().window().maximize();
//		driver.findElement(By.linkText("Gmail")).click();
//		Thread.sleep(1000);
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
	}

}
