package webelement;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2Facebookcordi {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb= driver.findElement(By.id("email"));
		org.openqa.selenium.Point loc=searchtb.getLocation();
		int x=loc.getX();
		System.out.println("x cordi: "  + x);
		int y=loc.getY();
		System.out.println("y cordi: "  + y);
		
		driver.close();
		
		
		
	}

}
