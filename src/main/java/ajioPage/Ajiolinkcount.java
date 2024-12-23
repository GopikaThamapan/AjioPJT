package ajioPage;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ajiolinkcount {
	WebDriver  driver;
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]")
	WebElement linkcount;
	
 @Test 
  public void LinkResponse1() 
 {
		List<WebElement>linkdetails =driver.findElements(By.tagName("a"));
		System.out.println("Total no of links="+linkdetails.size());
		
		for (WebElement elements:linkdetails) {
			
			String link =elements .getAttribute("href");
			verify(link);
		}
 }
private void verify(String link) {
	
	//Response code method
	
	try {
		URL u=new URL(link);
		HttpURLConnection code=(HttpURLConnection)u.openConnection();
		
		if(code.getResponseCode()==200) {
			
			System.out.println("Response code is 200---------------"+link);
		}
		else if (code.getResponseCode()==404) {
			System.out.println("Response code is 404---------"+link);
		}
		else {
			System.out.println("Other response code");
		}
	}
	 catch (Exception e) {
		 System.out.println(e.getMessage());
	 }
}
      
}


