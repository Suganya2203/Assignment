package week4HomeAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioListInterface {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		
		WebElement enteringVal = driver.findElement(By.name("searchVal"));
		enteringVal.sendKeys("Bags");
		enteringVal.sendKeys(Keys.RETURN);
		
		driver.findElement(By.className("rilrtl-list-item")).click();
		
		
		
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//input[@id='Men - Fashion Bags']"));
		
		WebElement element2 = driver.findElement(By.id("Men - Fashion Bags"));
		driver.executeScript("arguments[0].click()",element2,element);
		
//		WebElement gettingPrice= driver.findElement(By.xpath("//div[@class='brand']//child::strong"));
//		String price=gettingPrice.getText();
//		System.out.println("List of Prices: "+price);
		
		List<WebElement> gettingPrice = driver.findElements(By.xpath("//div[@class='brand']//child::strong"));
		//how to get all the brand names//
		//String price= gettingPrice.
		//WebElement.class.
		
//		for(int i=0;i<gettingPrice.size();i++)
//		{
//			System.out.println(gettingPrice.get(i).getText());
//		}
//		
		for(WebElement text: gettingPrice)
		{
		
		System.out.println(text.getText());
		}
		//driver.findElements(By.className("price  \"));
		
	}

}
