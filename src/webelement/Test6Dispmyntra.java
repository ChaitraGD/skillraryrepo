package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6Dispmyntra {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb= driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
		
		if(searchtb.isDisplayed()) {
			System.out.println("Pass: Element is Displayed");
			searchtb.sendKeys("Phone");
		}
		else {
			System.out.println("Fail: Element is not Displayed");
		}
		
		//driver.close();
		
	}

}
