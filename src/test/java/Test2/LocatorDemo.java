package Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		Thread.sleep(5000);
		driver.findElement(By.name("submit_search")).click();
	    //driver.findElement(By.linkText("Printed Chiffon Dress")).click(); \\title
		driver.findElement(By.partialLinkText("Chiffon")).click();
		// TODO Auto-generated method stub

	}

}
