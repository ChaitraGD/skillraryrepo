package autosuggesion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4B {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("course"));
	
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);

		WebElement ele1=driver.findElement(By.xpath("//a[contains(text(),'munit testing')]"));
		ele1.click();
		
		WebElement ele2 = driver.findElement(By.id("add"));
		a.doubleClick(ele2).perform();
		
		
//		
//		dr
//		

	
//		a.doubleClick(ele).perform();
//	
	}
}
