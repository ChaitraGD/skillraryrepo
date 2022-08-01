package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2AmazonCord {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
		WebElement searchtab = driver.findElement(By.id("twotabsearchtextbox"));
		
		Point loc = searchtab.getLocation();
		int x=loc.getX();
		System.out.println("X Coordinates: " +x);
		int y=loc.getY();
		System.out.println("X Coordinates: " +y);
		
		driver.close();
		
	
	}

}
