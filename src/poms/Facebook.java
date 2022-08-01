package poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook{
	@FindBy(id="email")
	private WebElement emailaddresstab;
	
	@FindBy(id="pass")
	private WebElement passwordtab;
	
	@FindBy(xpath="//button[@value='1']")
	private WebElement loginbutton;
	
	public Facebook(WebDriver driver) {
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

