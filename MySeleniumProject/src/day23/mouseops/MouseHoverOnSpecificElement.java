package day23.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day13.dropdownhandling.SeleniumUtil;

public class MouseHoverOnSpecificElement {

	public static void main(String[] args) throws InterruptedException {
		//Using setUp() launch the required browser with URL and return browser instance
				WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
	//Create an instance of Actions class and pass browser instance to its constructor
				Actions act = new Actions(driver);
			//Get all the main menu list
		List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));

		//To perform hover on specific element Get the element from the list like 3rd (Web Table)
		WebElement webTableLink = menuList.get(2);
		Thread.sleep(1000);
		act.moveToElement(webTableLink, 100,0).perform();//By using Co-ordinates
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
