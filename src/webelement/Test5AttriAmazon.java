package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5AttriAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchtb= driver.findElement(By.id("twotabsearchtextbox"));
		System.out.println(searchtb.getAttribute("name"));
		System.out.println(searchtb.getAttribute("id"));
		System.out.println(searchtb.getAttribute("type"));
		System.out.println(searchtb.getAttribute("dir"));
		
		driver.close();
	}

}
