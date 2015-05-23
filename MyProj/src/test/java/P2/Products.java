package P2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

public class Products {
	WebDriver driver;
    public   Products(WebDriver driver)
    {
         this.driver=driver;
    }
    public void addcart() throws Exception
    {
         //code to add any 2 product to card
    	
    	Reporter.log("====Urls of products in page======");
    	for(int i =0; i< 2; i++)
    	{
    		List<WebElement> products = driver.findElements(By.xpath("//*[@class='gd-col gu3']"));
    		products.get(i).click();
    		Thread.sleep(5000);
    		Reporter.log(driver.getCurrentUrl());
    		driver.findElement(By.xpath("//*[@class='btn-buy-now btn-big  current']")).click();
    		Thread.sleep(5000);
    		driver.navigate().back();
    		Thread.sleep(5000);
    	}
    }
    public void checkcart() throws Exception
    {
          //check the same 2 products are in cart
    	driver.findElement(By.xpath("//*[@class='cart-btn-cont']")).click();
    	Reporter.log("=========Urls of Products in cart==========");
    	List<WebElement> products = driver.findElements(By.xpath("//*[@class='cell image-cell']"));
    	for(int i = 0; i < products.size(); i++)
    	{
    		products.get(i).click();
    		Thread.sleep(5000);
    		Reporter.log(driver.getCurrentUrl());
    		driver.navigate().back();
    		Thread.sleep(5000);
    	}
    }
}
