package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2A {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
				
		Select s=new Select(dropdown);
//		s.selectByIndex(2);
//		s.selectByValue("search-alias=appliances");
//		s.selectByVisibleText("Car & Motorbike");
//		
		List<WebElement> alloption = s.getOptions();
		System.out.println(alloption.size());
		
		for(WebElement b:alloption) {
			System.out.println(b.getText());
		}
		driver.close();
	}

}
