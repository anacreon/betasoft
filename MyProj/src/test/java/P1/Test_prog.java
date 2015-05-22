package P1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_prog 
{
	   
    WebDriver driver;
	@Test
	public void run_method() throws Exception
	{
		
		driver=new FirefoxDriver();
				
		Home hm=new Home(driver);
		hm.validate_HomeLinks();
		hm.signup();
		hm.login();
		
		Compose cmp=new Compose(driver);
		cmp.sendmail();
		cmp.signout();
		
	}
}
