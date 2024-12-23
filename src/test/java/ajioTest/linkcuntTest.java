package ajioTest;

import org.testng.annotations.Test;

import AjioBasePkg.BaseCls;
import ajioPage.Ajiolinkcount;


public class linkcuntTest extends  BaseCls{

   @Test
   public void Linkcount() {
	 Ajiolinkcount al= new Ajiolinkcount();
	 al.LinkResponse1();
       
   }
   
}
