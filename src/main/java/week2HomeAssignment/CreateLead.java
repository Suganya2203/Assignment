package week2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
			
			driver.findElement(By.partialLinkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("testfirst0011");
			driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("testlast002");
			
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Selenium Automation Company.");
			driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Company Title");
			driver.findElement(By.className("smallSubmit")).click();
			
			String title=driver.getTitle();
			System.out.println(title);
			
			String title1="Create Lead | opentaps CRM";
			
			System.out.println(title1.equals(title));
			driver.close();

	}

}
