package testcases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LegalEntity2 {
@Test
	public void entitysecond() throws InterruptedException 
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
		
		Thread.sleep(1000);
        		
		WebElement element2 = driver.findElement(By.xpath("//input[@class='slds-input']"));
		element2.sendKeys("Legal Entities");	
		
		
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		WebElement clickingOnNew = driver.findElement(By.xpath("//a[@title='New']"));
		clickingOnNew.click();
				
		Thread.sleep(4000);
		
		Object[] windowHandles1=driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles1[0]);
        
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//div[@class='slds-form-element__control slds-grow']"));
        element.sendKeys("Salesforce Automation by Suganya001");
        
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
        element1.sendKeys("TestLeaf");
        
        Thread.sleep(2000);
        WebElement element21 = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]"));
        element21.sendKeys("Salesforces");
        
        
        //-------------------//not executing after this//-----------------//
        Thread.sleep(2000);
        WebElement element3 = driver.findElement(By.xpath("(//button[@id='combobox-button-503'])"));
        Actions act=new Actions(driver);
        act.scrollToElement(element3);
        element3.click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Active')]")).click();
           
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[contains(text(),'Save')])[2]")).click();

	}

}
