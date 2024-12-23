package ajioPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Brokenlinkpage {
	
	WebDriver driver;

	  @Test
	  public void Brknpgm() 
	  {
		  List<WebElement>linkdetails =driver.findElements(By.tagName("a"));
          for(WebElement links:linkdetails)
			
			for (WebElement elements:linkdetails) 
			{
				String link =elements .getAttribute("href");
				verify(link);

			}
	  }	  
	  private void verify(String link) {
					
		  
			try {
				@SuppressWarnings("deprecation")
				URL u=new URL(link);
				
				HttpURLConnection httpURL=(HttpURLConnection)u.openConnection();
				
				int code=httpURL.getResponseCode();
					
			if (code==404)
			{
				System.out.println("Break links "+link);
			}
			}
			catch(Exception e) {
						 
		}
	  }
}
