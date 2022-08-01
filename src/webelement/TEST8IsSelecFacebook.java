package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST8IsSelecFacebook {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		 
		WebElement radsele=driver.findElement(By.name("sex"));
		 
		if(radsele.isSelected()) {
			System.out.println("Pass: Element is Selected");
			radsele.click();
		}
		else {
			System.out.println("Fail: Element is not Selected");
			}
		
		//driver.close();
	}

}
