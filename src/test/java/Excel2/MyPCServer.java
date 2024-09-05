package Excel2;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	public class MyPCServer {

		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://192.168.14.30/cire/login.aspx");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.id("username")).sendKeys("administrator");
			driver.findElement(By.id("password")).sendKeys("Netm0an1");
			driver.findElement(By.id("signInButton")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div/div[1]/a[3]")).click();
			
			Thread.sleep(5000);
			
			//driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/table/tbody/tr/td[2]/div/div/table/tbody/tr[7]/td/div[1]/div[2]/div[3]")).click();
			driver.findElement(By.xpath("//div/div[2]/div[8]")).click();	
			
			Thread.sleep(5000);
			driver.findElement(By.id("bookedFor")).sendKeys("user18");
			
			Thread.sleep(5000);
			//WebElement sitedropdown=driver.findElement(By.xpath("//select[@id='siteId']"));
			//Select site=new Select(sitedropdown);
			
			//select option from the dropdown
			
			//site.selectByIndex(1); //index start from zero
		//	site.selectByVisibleText("Universe");
			
			//checkbox
			driver.findElement(By.id("recurringBooking")).click();

			Thread.sleep(5000);
			//radio button
			driver.findElement(By.xpath("//div/span/input[2]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.id("recurrenceEndDate")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[6]/table/tbody/tr[5]/td[7]/a")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("submitButton")).click();
			
		}

	}

