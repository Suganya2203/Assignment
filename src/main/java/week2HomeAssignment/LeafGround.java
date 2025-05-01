package selfLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://leafground.com/button.xhtml");
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(3000);
		String expectedTitle="Dashboard";
		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		if(title.equals(expectedTitle))
		{
			System.out.println("Title matched");
		}
		else
		{
			System.out.println("Title did not match");
		}
		driver.navigate().back();
		Thread.sleep(3000);
		WebElement checkIfDisabled = driver.findElement(By.xpath("//span[text()='Disabled']"));
		
		if(checkIfDisabled.isSelected())
		{
			System.out.println("The checkbox is enabled");
		}
		else
		{
			System.out.println("Checkbox is disabled");
		}
		
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
		
		System.out.println("Location of the Submit button is: "+location);
		
		String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("button");
		
		System.out.println("Color of the button is: "+cssValue);
		
		Dimension size = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		
		System.out.println("Size of the button is: "+size);
		
		driver.close();
		}

}
