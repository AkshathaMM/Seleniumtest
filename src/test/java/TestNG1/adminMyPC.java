package TestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class adminMyPC
{
	WebDriver driver;
	@Test(priority=1)
	void openapp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://server12/cire/signin.aspx");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2)
	void login()

		{
			driver.findElement(By.id("username")).sendKeys("administrator");
			driver.findElement(By.id("password")).sendKeys("Netm0an1");
			driver.findElement(By.id("signInButton")).click();
		}
		
		@Test(priority=3)
		
		void LoginMyPC()
		{
			driver.findElement(By.xpath("//div/div[1]/a[3]")).click();
		}
	
	
	@Test(priority=4)
	void admin()
	{
		driver.findElement(By.id("menuItemAdmin")).click();
		
	}
	
	@Test(priority=5)
	
	void site()
	{
		driver.findElement(By.id("dSITES")).click();
		driver.findElement(By.id("d")).click();
		driver.findElement(By.id("siteName")).sendKeys("Ak");
		driver.findElement(By.id("submitButton")).click();
		
	}
}


