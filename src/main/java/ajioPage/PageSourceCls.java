package ajioPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PageSourceCls {
	
	WebDriver driver;
	
	@Test	
	
	public void pageSourcePgm() {
		
		String s = driver.getPageSource();
		String actualString ="G mail";
		if(s.contains(actualString)) {
			System.out.println("The page contains G mail");
		}
		else {System.out.println("The page not contains G mail");
		}
		
	}
}
