package day19.printingprice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day13.dropdownhandling.SeleniumUtil;

public class MakeMyTrip {

	public static void main(String[] args) {
		//set the browser
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.makemytrip.com/holidays-india/");
		//Press escape button from keyboard to remove login popup
driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
//click on holiday packages
driver.findElement(By.className("chNavText darkGreyText")).click();
	
		//get package name n price
		WebElement packageNameAndPrice = driver.findElement(By.xpath("//div[div[p[@class='font18 latoBlack blackText']]"));
		System.out.println("Get Package name & price="+packageNameAndPrice.getText());
				
		
		
		
		
		
		
		
		
		
		
		

	}

}

////span[@class='latoBlack font20 blackText makeFlex hrtlCenter']