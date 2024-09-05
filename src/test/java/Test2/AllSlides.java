package Test2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllSlides
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.automationpractice.pl/index.php");
		//to find number of slider in home page
		List<WebElement> sliders=driver.findElements(By.className("homeslider-container"));
		// findElement return the list of webElement, why webElement?in the list collection whatever we capture all are webElement  
		System.out.println("Number of sliders:"+sliders.size());
		//find total no of images in home page
		List<WebElement>images=driver.findElements(By.tagName("img"));
		//there will no same attribute for every webElement but tag name is same
		System.out.println("Total no of images:"+images.size());
		//find total no of links
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.print("Total no of links:"+Links.size());
		
	}

}
