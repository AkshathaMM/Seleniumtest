package Excel2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingDataFromExcel
{
	public static void main(String[] args) throws IOException
    {
    	WebDriver driver=new ChromeDriver();
		
		driver.get("http://192.168.14.30/cire/login.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://192.168.14.30/cire/login.aspx");
		driver.manage().window().maximize();
		
		//capture the location of the excel and capture the data from the excel
		String filepath=System.getProperty("user.dir") + "\\Testdata\\MyPC.xlsx";
		
		//this returns the no of rows in excel
		int rows=Utility.getRowCount(filepath,"Sheet1");
		
		for(int i=0;i<rows;i++)

		{
			//read data from excel
			String username=Utility.getCellData(filepath, "Sheet1", i,1);
			String password=Utility.getCellData(filepath, "Sheet1", i+1,1);
			
			//pass above data into the application
			
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.id("signInButton")).click();
			//validation
			
		}
		
		
    }
}
