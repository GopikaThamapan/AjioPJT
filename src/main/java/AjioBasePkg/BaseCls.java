package AjioBasePkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseCls {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		 driver.manage().window().maximize();	
		 
	}
	

}
