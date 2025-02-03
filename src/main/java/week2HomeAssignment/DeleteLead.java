package week2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.partialLinkText("Leads")).click();
			driver.findElement(By.partialLinkText("Find Leads")).click();
			driver.findElement(By.linkText("Phone")).click();
			driver.findElement(By.name("phoneCountryCode")).clear();
			driver.findElement(By.name("phoneCountryCode")).sendKeys("");
			driver.findElement(By.name("phoneAreaCode")).sendKeys("");
			driver.findElement(By.name("phoneNumber")).sendKeys("99");
			driver.findElement(By.partialLinkText("Find Leads")).click();
			
			System.out.println("Clicked on find leads");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement gettingTitle = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			String text1 = gettingTitle.getText();
			
			System.out.println("First lead is "+text1);
			gettingTitle.click();
			
			driver.findElement(By.partialLinkText("Delete")).click();
			System.out.println("Deleted First lead");
			
			driver.findElement(By.partialLinkText("Find Leads")).click();
			
			driver.findElement(By.xpath("(//div[@class='x-form-element']/input)[13]")).sendKeys(text1);
			driver.findElement(By.partialLinkText("Find Leads")).click();
			
			WebElement gettingTitle2 = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			String text2=gettingTitle2.getText();
			
			if(text1.equals(text2))
			{
				System.out.println("Lead is not deleted");
			}
			else
			{
				System.out.println(text1+ "Lead is deleted");
			}
			
			
	}

}
