package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority=1, invocationCount=5, enabled=false)
	public void calls() {
		Reporter.log("calls",true);
	}
		
	@Test(priority=-1,enabled=false)
	public void settins() {
		Reporter.log("settins",true);
	}
		
	@Test(priority=-1, invocationCount=2)
	public void chats() {
		Reporter.log("chats",true);
	}
}
