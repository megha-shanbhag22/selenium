import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://rediff.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement a=driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[2]"));
		//act.moveToElement(a).click().build().perform();
		act.click(a).build().perform();
		
		//act.moveToElement(a).doubleClick().build().perform();
		//act.doubleClick(a).build().perform();
		
		//act.moveToElement(a).contextClick().build().perform();
		//act.contextClick(a).build().perform();
		
		
		
		/*WebElement e=driver.findElement(By.cssSelector("#cars"));
		Select s=new Select(e);
		
		boolean b=s.isMultiple();
		System.out.println(b);
		
		s.selectByIndex(2);
		s.selectByValue("saab");
		s.selectByVisibleText("Volvo");
		
		
		s.deselectByIndex(2);
		s.deselectByValue("saab");
		s.deselectByVisibleText("Volvo");
		//s.deselectAll();
		
		List<WebElement> opt=s.getOptions();
		System.out.println(opt.size());
		
		for(WebElement e2:opt) {
			String t=e2.getText();
			System.out.println(t);
		}
		System.out.println("First selected");
		
		s.selectByIndex(1);
		s.selectByValue("audi");
		
		WebElement d=s.getFirstSelectedOption();
		String first=d.getAttribute("value");
		System.out.println(first);
		
		List <WebElement> all=s.getAllSelectedOptions();
		System.out.println(all.size());
		
		s.deselectAll();
		
		List <WebElement> all2=s.getAllSelectedOptions();
		System.out.println(all2.size());*/
		

	}

}
