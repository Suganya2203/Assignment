package selfLearn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Suganya");
		driver.findElement(By.name("lastname")).sendKeys("Thabasumuthu");
		driver.findElement(By.name("reg_email__")).sendKeys("0099887766");
		driver.findElement(By.id("password_step_input")).sendKeys("99999999");
		
		Select sel =new Select(driver.findElement(By.name("birthday_day")));
		
		sel.selectByIndex(21);
		
		Select sel1=new Select (driver.findElement(By.name("birthday_month")));
		
		sel1.selectByVisibleText("Mar");
		
		Select sel2= new Select(driver.findElement(By.name("birthday_year")));
		sel2.selectByValue("1996");
		
		driver.findElement(By.name("sex")).click();
		
		driver.close();
	}

}
