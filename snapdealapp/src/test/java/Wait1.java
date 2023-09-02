import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class Wait1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		WebDriverManager.chromedriver().setup();
        driver.get("https://www.magicbricks.com/");
        driver.manage().window().maximize();
       
        //exp
//        WebElement e=driver.findElement(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/a"));
//        Actions act=new Actions(driver);
//        act.moveToElement(e).perform();
//        
//        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2));
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[3]/div/div/div[1]/ul/li[2]/a"))).click();
            
        
        //imp
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
//
//        WebElement e=driver.findElement(By.xpath("//*[@id=\"rentheading\"]"));
//        Actions act=new Actions(driver);
//        act.moveToElement(e).perform();
//
//        driver.findElement(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")).click();
        
        //fluent
        FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(8));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.withMessage("fluent wait");
        wait.ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"propTypesRent1\"]/ul/li[1]/a")));


	}

}
