package ajioTest;

import org.testng.annotations.Test;

import AjioBasePkg.BaseCls;
import ajioPage.PageSourceCls;
import ajioPage.SearchAjio;

public class PageSourceTest extends BaseCls{
	@Test
	
	public void pagesource() {
	PageSourceCls ob=new PageSourceCls();
	ob.pageSourcePgm();
	}	
	
}
