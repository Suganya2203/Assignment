package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SalesForce2 extends ProjectSpecificMethod
{
	@Test
	public static void runSalesForce2() 
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TCS");
		driver.findElement(By.xpath("//span[text()='--None--']")).click();
		driver.findElement(By.xpath(("(//span[@class='slds-media__body'])[2]"))).click();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Desccc");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
	}

}
