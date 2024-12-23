package ajioTest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import AjioBasePkg.BaseCls;

public class TitlevarificationTest extends BaseCls{
	
	public void titlevarification() {
		

	String actual=driver.getTitle();
	String expect="Online shopping site for women,men,kid fashion Lifestyle and More";
	Assert.assertEquals(actual, expect);
	
}
	
}
