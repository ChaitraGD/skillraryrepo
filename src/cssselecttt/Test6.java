package cssselecttt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("chaitragowda71@gmail.com");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(" 000");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _82go _4jy6 _517h _51sy']")).click();
		driver.findElement(By.linkText("Help")).click();

	}

}
