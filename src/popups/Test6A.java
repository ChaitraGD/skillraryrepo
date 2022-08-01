package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6A {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Skillrary.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String Parent = driver.getWindowHandle();
		System.out.println(Parent);
		
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();

		driver.findElement(By.xpath("(//a[@class='ignorelink'])[16]")).click();
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		for(String b:child) {
			driver.switchTo().window(b);
		}
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]")).click();
		 
		
		
		//driver.quit();
		//driver.close();
		
	}

}
