package week4HomeAssignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionAutomation {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Merge Contacts")).click();		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        
		// how to switch to window
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> gettingList=new ArrayList<String>(windowHandles);
		String string = gettingList.get(1);
		System.out.println("String value "+string);
		driver.switchTo().window(string);
		//0FA9A4544343898CB82D535438CE1411
		driver.findElement(By.className("linktext")).click();
		driver.switchTo().window(gettingList.get(0));
		
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following-sibling::a")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> gettingNewList=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(gettingNewList.get(1));
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		driver.switchTo().window(gettingNewList.get(0));

		
		driver.findElement(By.className("buttonDangerous")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		String titleOfThePage = driver.getTitle();
		System.out.println("Title of the page is : "+titleOfThePage);
		
		
		//(By.xpath("//div[@id='ext-gen276']")).click();
	}

}
