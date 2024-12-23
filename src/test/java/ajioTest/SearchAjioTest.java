package ajioTest;

import org.testng.annotations.Test;

import AjioBasePkg.BaseCls;
import ajioPage.SearchAjio;

public class SearchAjioTest extends BaseCls {

	@Test
	
	public void searchpgm1() {
	SearchAjio ob=new SearchAjio(driver);
	ob.Searchpgm();
	
	}
}
