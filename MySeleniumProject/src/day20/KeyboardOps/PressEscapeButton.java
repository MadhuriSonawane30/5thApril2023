package day20.KeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import day13.dropdownhandling.SeleniumUtil;

public class PressEscapeButton {

	public static void main(String[] args) {
//set the browser
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.flipkart.com/");
		//press escape button from keyboard to remove login popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		

	}

}
