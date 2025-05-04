package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProjectSpecificMethod 
{
	public ChromeDriver driver;
	@Test
	@BeforeMethod
	public static void preCondition() throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("vidyar@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sales@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
		//driver.findElement(By.className("slds-icon-waffle")).click();
		WebElement button = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']/parent::button"));
		button.click();
		driver.findElement(By.xpath("(//div[@class='DESKTOP uiContainerManager']//button)[2]")).click();
		//driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		//driver.findElement(By.xpath("//p[text()='Legal Entities']")).click();
		Thread.sleep(5000);

	}
	@AfterMethod
	void postCondition()
	{
		driver.close();
	}
}
