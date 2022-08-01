package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
WebElement dropdown1 = driver.findElement(By.id("cars"));
Select s=new Select(dropdown1);
Thread.sleep(1000);
s.selectByIndex(0);
s.selectByIndex(2);
s.selectByIndex(3);
s.selectByIndex(5);
s.selectByValue("99");

s.deselectByIndex(0);
s.deselectByIndex(2);
s.deselectByIndex(3);
s.deselectByIndex(5);
s.deselectByValue("99");


				
	}

}
