package Test1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Logintest 
{
	public static void main(String[] args) throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup(); //in the latest version the webDriver manager feature is implemented as part of Selenium java so now no need to add manually
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver(); //always prefer to use interface name
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();//this will maximize the page
		
		Thread.sleep(5000);
		//WebElement username=driver.findElement(By.name("username"));//(it is returning the webElement, so datatype will be WebElement)
		//username.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		if(act_title.equals(exp_title))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		
		//driver.close();
		//driver.quit();
		
	}
}