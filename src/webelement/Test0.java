package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.id("username"));
		WebElement element=driver.findElement(By.id("password"));
		
		Thread.sleep(3000);
		
		ele.clear();
		element.clear();
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).submit();
			
		
	}

}
