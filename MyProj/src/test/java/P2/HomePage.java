package P2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    public   HomePage(WebDriver driver)
    {
         this.driver=driver;
    }
    public void openUrl()
    {
              //to open the url of flipkart
    	driver.get("http://www.flipkart.com/");
    }
    public void selectProduct() throws Exception
    {
               //go to electronics
   
    	Actions move = new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@class='menu-text fk-inline-block']")));
    	move.perform();
    	Thread.sleep(5000);
               //select HP product
    	driver.findElement(By.linkText("HP")).click();
    	Thread.sleep(5000);
    }
}
