package week2HomeAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountCS {

	public static void main(String[] args) throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.partialLinkText("Accounts")).click();
	driver.findElement(By.partialLinkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Test123");
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
	Select selectOption=new Select(driver.findElement(By.name("industryEnumId")));
	selectOption.selectByIndex(3);
	driver.findElement(By.xpath("//select[@id='dataSourceId']/option[5]")).click();
	
	WebElement ownership= driver.findElement(By.name("ownershipEnumId"));
	Select os=new Select(ownership);
	os.selectByVisibleText("S-Corporation");
	
	WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
	Select mk=new Select(marketing);
	mk.selectByIndex(5);
	
	WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
	Select st=new Select(state);
	st.selectByValue("TX");
	
	driver.findElement(By.className("smallSubmit")).click();
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println("Title of the page is " +title);
	
	String title1="Create Account | opentaps CRM";
	System.out.println(title1.equals(title));
	driver.close();

	}

}
