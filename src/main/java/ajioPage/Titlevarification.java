package ajioPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titlevarification {
	
	
    	  
WebDriver driver;

	
	@Test
	
	public void titleVerify()	
	{
		String actualTitle =driver.getTitle();
		System.out.println("Title="+actualTitle);
		
		String exp ="Ajio";
		if (exp .equals(actualTitle)) {
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Not same");
		}	}

}
