package automnscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
        driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9036263063");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Venu@1234");
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
        //driver.findElement(By.xpath("//button[@type='submit'][2]")).click();
        
        String tit = driver.getTitle();
        System.out.println(tit);
        
        String url = driver.getCurrentUrl();
        System.out.println(url);
    
        if(tit.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!")) {
        	System.out.println("Pass:Home page displayed");
        }
        else {
        	System.out.println("Fail:Home page not displayed");
        }
        
       
        
        driver.close();

	}

}
