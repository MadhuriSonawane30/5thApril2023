package day18.PropertyFileCalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class MakeMyTripCalender {

	public static void main(String[] args) {
	WebDriver driver=SeleniumUtil.setUp("chrome","https://www.makemytrip.com/");
	
		//identify departure and click on it
	driver.findElement(By.cssSelector("label[for='departure']")).click();
	//select date from next month
	driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(4)>div>p")).click();
		
		
}
}