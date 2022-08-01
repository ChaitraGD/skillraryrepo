package poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeDemo {
	@FindBy(id="username")
	private WebElement emailaddresstab;
	
	@FindBy(name="pwd")
	private WebElement passwordtab;
	
	@FindBy(xpath="//div[text()='Login '] ")
	private WebElement loginbutton;
	
	public  ActiTimeDemo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
	public void emailAdd(String usn) {
		emailaddresstab.sendKeys(usn);
	}
	
	public void password(String pas) {
		passwordtab.sendKeys(pas);
	}
	
	public void login() {
		loginbutton.click();
	}
}

