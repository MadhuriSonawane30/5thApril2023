package day23.mouseops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import day21.CopyPaste.SeleniumUtil;

public class DragAndDropOps {

	public static void main(String[] args) throws InterruptedException {
//using setup() launch required browser with URL and return browser instance
		WebDriver driver=SeleniumUtil.setUp("chrome","https://www.globalsqa.com/demo-site/draganddrop/");
//frame handling
		WebElement frame= driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		
		driver.switchTo().frame(frame);
	//Create an instance of Actions class by passing required browser instance to its constructor
	Actions act=new Actions(driver);	
		//first identify source and target elements  for drag and drop
List<WebElement> sourceElements= driver.findElements(By.cssSelector("ul#gallery>li"));
		WebElement target =driver.findElement(By.id("trash"));
	//perform drag and drop operation
	
	for(int i=0; i < sourceElements.size();i++) {
	act.dragAndDrop(sourceElements.get(i),target).build().perform();
	Thread.sleep(1000);
		
		
	}
		
		
		
		
		

	}

}
