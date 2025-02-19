package week5HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablesExample {

	public static void main(String[] args) 
	{
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://finance.yahoo.com/?guccounter=1");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			Actions act=new Actions(driver);
			
			WebElement hover = driver.findElement(By.xpath("//span[@class='_yb_71gmmg']"));
			act.moveToElement(hover).perform();
	}

}
