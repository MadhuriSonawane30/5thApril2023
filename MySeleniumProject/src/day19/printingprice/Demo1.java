package day19.printingprice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day13.dropdownhandling.SeleniumUtil;

public class Demo1 {

	public static void main(String[] args) {
		//set the browser
WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.demoblaze.com/");
//get mobile name and price
WebElement mobileNameandPrice = driver.findElement(By.xpath("//div[h4[a[text()='Samsung galaxy s6']]]"));
System.out.println("Get Mobile Name & Price="+mobileNameandPrice.getText());
		


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
