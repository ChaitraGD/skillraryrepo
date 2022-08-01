package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		WebElement block1 = driver.findElement(By.id("gh-cat"));
		
		Select s = new Select (block1);
		Thread.sleep(4000);
		s.selectByIndex(1);
		Thread.sleep(4000);
		s.selectByValue("12576");
		Thread.sleep(4000);
		s.selectByVisibleText("Baby");

	}

}
