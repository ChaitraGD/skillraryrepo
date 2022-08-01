package LinktextLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		
		driver.findElement(By.partialLinkText("Forgot ")).click();
		driver.findElement(By.name("forgetPasswordEmailOrUsername")).sendKeys("chaitra@gmail.com");
		driver.findElement(By.name("forgetPasswordButton")).click();

	}

}
