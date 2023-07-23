package day23.mouseops;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day13.dropdownhandling.SeleniumUtil;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
//Using setUp() launch the required browser with URL and return browser instance
			WebDriver driver=SeleniumUtil.setUp("chrome", "https://demo.automationtesting.in/Register.html");
//Create an instance of Actions class and pass browser instance to its constructor
			Actions act = new Actions(driver);
		//Get all the main menu list
	List<WebElement> menuList=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
	//to perform hover	on specific element get the element from the list like: 1st element i.e 	(HOME)
	WebElement homeLink=menuList.get(0);
	Thread.sleep(2000);
	act.moveToElement(homeLink).perform();
		
		//Perform hover on all the menu one by one
	for(int i=0; i<menuList.size(); i++) {
		act.moveToElement(menuList.get(i)).perform();//concentrate on this part carefully
		Thread.sleep(1000);
		
		
	}
		
		
		
		
		

	}

}
