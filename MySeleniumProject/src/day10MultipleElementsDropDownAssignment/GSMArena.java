package day10MultipleElementsDropDownAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import day9MultipleElementsDropdown.Selenium;

public class GSMArena {
	static WebDriver driver;

	public static void main(String[] args) {
		// set up browser
		driver = Selenium.setUp("chrome", "https://www.gsmarena.com/");
		// identify all mobile devices
		List<WebElement> mobileList = driver.findElements(By.cssSelector("ul>li>a"));
		System.out.println("Total Samsung devices:" + mobileList.size());
		// print one by one all the mobile names
		for (int i = 0; i < mobileList.size(); i++) {
			WebElement mobile = mobileList.get(i);
			System.out.println("Samsung Device name" + i + ":" + mobile.getText());

		}

	}

}
