



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;


public class WaitDemo {

	@Test
	public  void mainee() 
	{
	 
 		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
		
		//driver.findElement(By.xpath("html/body/form/div[4]/div/div[1]/div[2]/div[2]/div[2]/map/area[2]")).click();
		
		List<WebElement> fr=driver.findElements(By.tagName("frame"));
	  
		for (int i = 0; i <fr.size() ; i++) 
		{ 
			driver.switchTo().frame(i);
			
			
			try 
			{
				
			driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();	
				
				
			}
			catch (Exception e) 
			
			{
				
				e.getStackTrace();
			}
			
			driver.switchTo().defaultContent();
			
			
			
		}
			
			
			
		
		 
		 
		
			
		
		
	}

}
