import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		
		Actions act=new Actions (driver);
		act.dragAndDrop(source, dst).perform();
		
		if(dst.getText().matches("Dropped")) {
			System.out.println("Dropped Successfully");
			//driver.close();
		}
	}

}
