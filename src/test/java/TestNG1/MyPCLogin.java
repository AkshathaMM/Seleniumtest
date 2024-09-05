package TestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
/*
 1.Launch the app
 2.login to cire
 3.login to MyPC
 4.make a booking
 5.logout
 */




public class MyPCLogin 
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
	void loginCire()
	{
		driver.findElement(By.id("username")).sendKeys("administrator");
		driver.findElement(By.id("password")).sendKeys("Netm0an1");
		driver.findElement(By.id("signInButton")).click();
	}
	
	@Test (priority=3)
	void loginMyPC()
	{
		driver.findElement(By.xpath("//div/div[1]/a[3]")).click();
	}
	
	@Test(priority=4)
	void booking() throws InterruptedException
	{
		driver.findElement(By.xpath("//td/div[1]/div[2]/div[15]")).click();
		driver.findElement(By.id("bookedFor")).sendKeys("user19");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	void logout()
	{
		driver.findElement(By.xpath("//div/div[1]/a[5]")).click();
	}
}
