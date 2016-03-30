import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionTest {

	
	public static void main(String[] args) {
		Set<String> window;
		WebElement link,link1;
		WebDriver driver=new FirefoxDriver();
		/*driver.get("http://www.ap7am.com/telugu-flash-news.html");
		Actions act=new Actions(driver);
		link=driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/a/span"));
		act.moveToElement(link);
		act.sendKeys(Keys.CONTROL).click();
		act.build().perform();*/
		String winhandle;
		
		 driver.get("https://www.google.co.in/?gws_rd=ssl");  
		 System.out.println(driver.getWindowHandle());
		 driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);
		 driver.switchTo().defaultContent();
		 System.out.println(driver.getWindowHandle());
		 
		 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t"); 
		 driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}














/*window=driver.getWindowHandles();
System.out.println(window.size());
Iterator<String> it=window.iterator();
while (it.hasNext()) {
	String winid = (String) it.next();
	System.out.println(driver.switchTo().window(winid).getCurrentUrl());
	
}*/