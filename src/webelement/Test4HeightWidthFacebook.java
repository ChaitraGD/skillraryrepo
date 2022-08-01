package webelement;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4HeightWidthFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb= driver.findElement(By.name("login"));
		org.openqa.selenium.Dimension s= searchtb.getSize();
		int h =(int) s.getHeight();
		System.out.println("Height of the element  "+ h);
		
		int w =(int) s.getWidth();
		System.out.println("Height of the element  "+ w);
		
		driver.close();
		
		
	}

}
