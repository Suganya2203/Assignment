package week2HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) 
	
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.partialLinkText("Accounts")).click();
			
			driver.findElement(By.partialLinkText("Create Account")).click();
			driver.findElement(By.id("accountName")).sendKeys("Suganya3567");
			
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
			driver.findElement(By.id("numberEmployees")).sendKeys("10");
			driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
			driver.findElement(By.className("smallSubmit")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String title=driver.getTitle();
			System.out.println(title);
			String title1="Account Details | opentaps CRM";
			
			System.out.println(title1.equals(title));
			driver.close();
					

	}

}
