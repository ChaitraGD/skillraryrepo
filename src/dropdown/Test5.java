package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		 
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s = new Select(ele);
		 Thread.sleep(2000);
		 s.selectByIndex(0);
		 Thread.sleep(2000);
		 s.selectByValue("4");
		 Thread.sleep(2000);
		 s.selectByVisibleText("Feb");
		 
		 List<WebElement> allopt = s.getOptions();
		 System.out.println(allopt.size());
		 
		 for (WebElement b:allopt) {
			 System.out.println(b.getText());
		 }
		 System.out.println(s.isMultiple());
		 
		 if(s.isMultiple()) {
			 System.out.println("Element is a Multi-Select "); 
		 }
			 else {
				System.out.println("Element is a Single Select");	
		 }		 
		 driver.close();
	}
}
