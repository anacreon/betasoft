package P2;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_prog {
	   @Test
	    public void testing() throws Exception
	    {
	       FirefoxDriver driver=new FirefoxDriver();
	       
	       HomePage  hp=new HomePage(driver);
	       hp.openUrl();
	       hp.selectProduct();

	       Products prod=new Products(driver);
	       prod.addcart();
	       prod.checkcart();
	    }
}
