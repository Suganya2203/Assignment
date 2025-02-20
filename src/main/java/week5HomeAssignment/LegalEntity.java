package testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LegalEntity {
@Test
	public void entityone() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vidyar@testleaf.com");	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Sales@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//div[@class='slds-size_medium']//ancestor::button")).click();
		
//		String windowHandle = driver.getWindowHandle();
//		Set<String> windowHandles = driver.getWindowHandles();
//		List<String> gettingList=new ArrayList<String>(windowHandles);
//		String string = gettingList.get(0);
		
		Object[] windowHandles=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[0]);

		
		//Thread.sleep(7000);
        		String title = driver.getTitle();
        		System.out.println("Title of screen" +title);
		WebElement element2 = driver.findElement(By.xpath("//input[@class='slds-input']"));
		element2.sendKeys("Legal Entities");
		
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		WebElement clickingOnNew = driver.findElement(By.xpath("//a[@title='New']"));
		clickingOnNew.click();
		
		Thread.sleep(2000);
	
		Object[] windowHandles1=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles1[0]);
        
        WebElement element = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']"));
        element.sendKeys("Salesforce Automation by Suganya");
        
        driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();
        	
		
	}

}
