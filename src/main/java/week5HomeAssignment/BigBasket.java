package week5HomeAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasket {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//div[@class='grid xl:grid-flow-col lg:grid-flow-row xl:gap-x-0.7 lg:gap-x-0 text-left leading-none'])[2]")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Foodgrains, Oil & Masala')])[2]"));
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
		//hover is not happening?
		
		
		WebElement element2 = driver.findElement(By.xpath("//a[contains(text(),'Rice & Rice Products')]"));
		act.moveToElement(element2).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Boiled & Steam Rice')]")).click();
		Thread.sleep(2000);
		WebElement element4 = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		Actions act1= new Actions(driver);
		act1.scrollToElement(element4).perform();
		element4.click();
		//act.click().perform();
		Thread.sleep(2000);
		WebElement element5 = driver.findElement(By.xpath("//h3[contains(text(),'Tamil Ponni Boiled - Rice')]"));
		act.scrollToElement(element5).perform();
		element5.click();
		
		Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        
        Thread.sleep(5000);
        WebElement element6 = driver.findElement(By.xpath("(//span[contains(text(),'5 kg')])[2]"));
        element6.click();
        WebElement element3 = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']"));
		String priceOfPonniRice = element3.getText();
		System.out.println("Price of Ponni rice is : "+priceOfPonniRice);
		driver.findElement(By.xpath("//button[contains(text(),'Add to basket')]")).click();
		//how to verify the message?
        File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snap/bigBasket checkout.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");

		
		driver.close();
		driver.quit();
	}

}
