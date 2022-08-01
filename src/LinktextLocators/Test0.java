package LinktextLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Forgotten password?"));
		//driver.findElement(By.id("identify_email")).sendKeys("123456787");
		driver.findElement(By.name("email")).sendKeys("chaitragowda71@gmail.com");
		driver.findElement(By.name("did_submit")).click();

	}

}
