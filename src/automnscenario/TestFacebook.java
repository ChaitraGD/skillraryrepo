package automnscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("chaitragowda71@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("venugopalgd");
		driver.findElement(By.name("login")).click();
		
		String tit = driver.getTitle();
		System.out.println(tit);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(tit.equals("Facebook � log in or sign up")) {
			System.out.println("Pass:home page displayed");
		}
		else {
			System.out.println("Fail:home page not displayed");
		}
		
		driver.close();
		
		
		
		
		

	}

}
