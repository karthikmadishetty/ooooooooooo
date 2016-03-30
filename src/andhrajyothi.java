import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Selenium;


public class andhrajyothi {
FirefoxDriver driver;
	@BeforeTest
	public void setup()
	{	
	 driver=new FirefoxDriver();
	 
		driver.get("http://epaper.andhrajyothy.com/news?cat=telangana&day=20160324");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	@Test
	public void ww()
	{
		//Actions act=new Actions(driver);
		driver.findElement(By.xpath(".//*[@id='mid1']/area[3]")).click();
	
//List<WebElement>frames=driver.findElements(By.tagName("iframe"));
//System.out.println(frames.size());
/*for (int i = 0; i < frames.size(); i++) {
	driver.switchTo().frame(i);
	System.out.println(frames.get(i).getText());*/
		driver.switchTo().frame(4);
	try {
		driver.findElement(By.xpath("html/body/div[1]/div/div[22]/div[2]/div[1]/button")).click();
		
		
	}
	catch (Exception e) {
		
	driver.switchTo().defaultContent();
	}
}
		
	}





/*executewindow(".//*[@id='player_uid_488899088_1']/div[22]/div[2]/div[1]/button");
}

public static void executewindow(String x) {
Set<String>wd=driver.getWindowHandles();
Iterator<String>w=wd.iterator();
while(w.hasNext())
{
	driver.switchTo().window(w.next());
	try {
		driver.findElement(By.xpath(x));
		break;
	} catch (Exception e) {
		// TODO: handle exception
	}*/
//}
