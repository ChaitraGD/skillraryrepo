package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void calls() {
		Reporter.log("calls",true);
	}
		
	@Test
	public void settins() {
		Reporter.log("settins",true);
	}
		
	@Test
	public void chats() {
		Reporter.log("chats",true);
	}
		
	@Test
	public void ademo() {
		Reporter.log("demo",true);
	} 
}
