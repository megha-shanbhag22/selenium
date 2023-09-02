import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.navigate().to("https://www.zomato.com/");
		driver.manage().window().maximize();
		WebElement l= driver.findElement(By.id("login-button"));
        System.out.println(l.isDisplayed());
        System.out.println(l.isSelected());
        System.out.println(l.isEnabled());
        
        
       // WebElement k= driver.findElement(By.cssSelector("login-button"));
        //System.out.println(k);
	}

}
