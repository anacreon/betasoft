package P2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Products {
	WebDriver driver;
    public   Products(WebDriver driver)
    {
         this.driver=driver;
    }
    public void addcart()
    {
         //code to add any 2 product to card
    	List<WebElement> products = driver.findElements(By.partialLinkText("HP"));
    }
    public void checkcart()
    {
          //check the same 2 products are in cart
    }
}
