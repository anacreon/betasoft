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
    public void selectProduct()
    {
               //go to electronics
    	new Actions(driver).moveToElement(driver.findElement(By.xpath("//*[@class='menu-10']")));
               //select HP product
    	driver.findElement(By.linkText("HP")).click();
    }
}
