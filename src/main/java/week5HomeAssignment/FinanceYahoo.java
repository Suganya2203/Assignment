package week5HomeAssignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FinanceYahoo {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement hoveringOnMarkets = driver.findElement(By.xpath("(//span[@class='_yb_2tcbii'])[3]"));
				//.xpath("//span[contains(text(),'More')]"));
		Actions act=new Actions(driver);
		act.moveToElement(hoveringOnMarkets).perform();
		
		driver.findElement(By.xpath("(//div[contains(text(),'Crypto')])[2]")).click();
		
		List<WebElement> listOfCurrencies = driver.findElements(By.xpath("//div[@class=' yf-eg2gbv']"));
		
			
		
	}

}
