package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test4 {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--Disable-Notifications");
		
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--Disable-Notifications");
		
		WebDriver driver1= new FirefoxDriver(option);
		
//		WebDriver driver= new ChromeDriver(options);
//		driver.manage().window().maximize();
//		driver.get("https://www.olx.in/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver1.get("https://www.olx.in/");
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.id("username")).sendKeys("admin");
	}

}
