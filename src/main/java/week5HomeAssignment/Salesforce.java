package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Salesforce extends ProjectSpecificMethod
{
	@Test
	public static void runSalesForce() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Salesforce Automation by Suganya");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}

}
