package week2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			//Logging in
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM")).click();
			driver.findElement(By.partialLinkText("Leads")).click();
			
			//Creating lead
			driver.findElement(By.partialLinkText("Create Lead")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("AGY");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Suganya");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("testlast002");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Testlocal");
			driver.findElement(By.name("departmentName")).sendKeys("QA");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Sample description123");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Testign@gmaul.com");
			
			WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
			Select st=new Select(state);
			st.selectByVisibleText("New York");
			
			//Saving
			driver.findElement(By.className("smallSubmit")).click();
			
			
			//editing
			driver.findElement( By.xpath("//a[@class='subMenuButton'][3]")).click();
			
			
			
			driver.findElement(By.id("updateLeadForm_description")).clear();
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("testing new add");
			
			//saving update
			driver.findElement(By.className("smallSubmit")).click();
			
			System.out.println(driver.getTitle());
			
			driver.close();
			String title=driver.getTitle();
			System.out.println(title);
			driver.close();

	}

}
