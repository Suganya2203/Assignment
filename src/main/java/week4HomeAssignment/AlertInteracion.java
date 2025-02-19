package week4HomeAssignment;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInteracion {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//p[@id='demo']/preceding-sibling::button")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Suganya");
		alert.accept();
		
//		if()
		
	}

}
