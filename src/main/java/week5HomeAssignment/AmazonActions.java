package week5HomeAssignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-text")).click();
		WebElement gettingPrice = driver.findElement(By.className("a-price-whole"));
		String text = gettingPrice.getText();
		System.out.println("Price of first mobile is: "+text);
		
		WebElement gettingNumberOfRatings = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		String text2 = gettingNumberOfRatings.getText();
		
		
		System.out.println("Number of Ratings: "+text2);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']")).click();
        Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);
        File source = driver.getScreenshotAs(OutputType.FILE);
		File destination= new File("./snap/homepage.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot taken");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//form[@id='attach-view-cart-button-form']")).click();
		
		WebElement gettingSubtotal = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		
		String text3 = gettingSubtotal.getText();
		System.out.println("Subtotal : "+text3);
		
			System.out.println(text.equals(text3));
			//how to compare the decimal and rupees symbol
			//System.out.println("Price of mobile is matched with subtotal");
		
		driver.quit();
		 
		

	}

}
