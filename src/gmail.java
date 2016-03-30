import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class gmail {

	static WebDriver dr;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 dr=new FirefoxDriver();
dr.get("http://gmail.com");
dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/div[1]/div/div/input[1]")).sendKeys("shetty106");
dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[1]/div/input")).click();	
Sleeper.sleepTightInSeconds(3);
dr.findElement(By.id("Passwd")).sendKeys("01437997");

dr.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div[1]/form/div[2]/div/input[1]")).click();

Sleeper.sleepTightInSeconds(3);

dr.findElement(By.id(":3d")).click();

Sleeper.sleepTightInSeconds(3);

dr.findElement(By.className("T-Jo-auh")).click();
List<WebElement> chb=dr.findElements(By.className("T-Jo-auh"));

int l=chb.size();

System.out.println(l);

if (l==51) 
{
	//dr.findElement(by.)
	chb=dr.findElements(By.className("T-Jo-auh"));
	
}

for (int i = 1; i < chb.size(); i++)
{
	
	chb.get(i).click();
	
}




	}

}
