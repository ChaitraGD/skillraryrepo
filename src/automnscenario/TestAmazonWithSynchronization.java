package automnscenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAmazonWithSynchronization {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
   driver.findElement(By.id("nav-signin-tooltip")).click();
   
   driver.findElement(By.id("ap_email")).sendKeys("9036263063");
   driver.findElement(By.id("continue")).click();
   driver.findElement(By.id("ap_password")).sendKeys("Abc@123");
   driver.findElement(By.id("signInSubmit")).click();
   
    String tit = driver.getTitle();
    System.out.println(tit);
    
    String url = driver.getCurrentUrl();
    System.out.println(url);

    if(tit.equals("Amazon Sign In")) {
    	System.out.println("Pass:Home page displayed");
    }
    else {
    	System.out.println("Fail:Home page not displayed");
    }
    driver.close();

}

}
