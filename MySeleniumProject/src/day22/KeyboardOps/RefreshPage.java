package day22.KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class RefreshPage {

	public static void main(String[] args) throws InterruptedException {
//set the browser and write the url
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.makemytrip.com/holidays-india/");
driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		Thread.sleep(1000);
	driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"r"));	
	Thread.sleep(1000);
	//another easy way to refresh
	driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
	}
}

//Note:
/*
 Possible ways to refresh browser window
 ctrl+r ====> Keys
 F5 ====> Keys
 navigate().refresh()
 driver.get()
 //Everytime ye kaam karega aisa nahi hai..some applications mein ye work nahi krta hai
 */