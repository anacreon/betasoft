package P1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class Compose 
{
	
  WebDriver driver;
  public Compose(WebDriver driver)
  {
	  this.driver=driver;
  }
  public void sendmail() throws Exception
  {
	  Thread.sleep(6000);
	  Reporter.log("==========Compose mail========");
	  driver.findElement(By.xpath("//*[@class='btn btn-compose']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.id("to-field")).sendKeys("abcd@gmail.com");
	  driver.findElement(By.id("subject-field")).sendKeys("test mail");
	  driver.findElement(By.id("rtetext")).sendKeys("this is test mail sample");
	  Thread.sleep(5000);  
  }
  public void signout()
  {
	  driver.findElement(By.linkText("Sign Out")).click();
	  driver.close();
  }
  
}