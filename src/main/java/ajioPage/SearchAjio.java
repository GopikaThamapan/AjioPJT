package ajioPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAjio {
  
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/form/div/div/input")
	WebElement SearchArea;
  
	
	public  SearchAjio (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
		public void Searchpgm() {		
    SearchArea.sendKeys("Kurta sets for women");
		                                                        
	}
}