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

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("catText")).click();
		
		WebElement mens = driver.findElement(By.className("catText"));
		Actions hover=new Actions(driver);
		hover.moveToElement(mens).perform();
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		driver.findElement(By.partialLinkText("Training Shoes")).click();
		driver.findElement(By.xpath("//div[@class='sorting-sec animBounce']")).click();
		
		 driver.findElement(By.xpath("(//li[@class='search-li'])")).click();
		
		
		WebElement rangeStart = driver.findElement(By.xpath("//input[@class='input-filter']"));
		rangeStart.clear();
		rangeStart.sendKeys("500");
		
		WebElement rangeEnd = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		rangeEnd.clear();
		rangeEnd.sendKeys("3700");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='sdCheckbox filters-list '])[2]")).click();
		
		
		//WebElement hoverOnColor = driver.findElement(By.xpath("//a[contains(text(),'White & Blue')]"));
		//Actions act=new Actions(driver);
		//act.moveToElement(hoverOnColor).click().perform();
		
		Thread.sleep(2000);
		WebElement hoveringOnQuickView = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		Actions act=new Actions(driver);
		act.moveToElement(hoveringOnQuickView).click().perform();
		
		Thread.sleep(3000);
		WebElement gettingPrice = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
		String priceOfShoe = gettingPrice.getText();
		System.out.println("Price of the shoe is: "+priceOfShoe);
		
		WebElement gettingPercent = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
		String percentageOff = gettingPercent.getText();
		System.out.println("Percentage offer for the shoe: "+percentageOff);
		
		Thread.sleep(2000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snap/imageOfShoe.png");
		FileUtils.copyFile(source, destination);
		
		
		
		driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	}

}
