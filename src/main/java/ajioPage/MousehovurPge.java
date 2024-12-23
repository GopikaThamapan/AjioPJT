package ajioPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MousehovurPge {

	ChromeDriver driver;
	
	
	@Test
	public void mousehr() {
		
		WebDriverWait wait =new WebDriverWait (driver ,Duration.ofSeconds(30));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actions act=new Actions(driver);
		WebElement women = driver.findElement(By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[1]/ul/li[2]/a/span"));
		act.moveToElement( women).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"third\"]/div[2]/span[1]/a")));
	     driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/div[3]/div/img")).click();
	    
	
	}
}
