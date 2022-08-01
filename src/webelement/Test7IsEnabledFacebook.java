package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7IsEnabledFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement loginele= driver.findElement(By.name("login"));
		
		if(loginele.isEnabled()) {
			System.out.println("Pass: Element is Enabled");
			loginele.click();
		}
		else {
			System.out.println("Pass: Element is not Enabled");
			}
		
		driver.close();

	}
	

}
