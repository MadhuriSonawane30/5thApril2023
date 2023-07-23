package day24.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class FlipkartAssignment {

	public static void main(String[] args) throws InterruptedException {
	//set the browser and url
WebDriver driver=SeleniumUtil.setUp("chrome","https://www.flipkart.com/");		
//Create an instance of Actions class and pass browser instance to its constructor	
	Actions act=new Actions(driver);	
		//maximize the browser
	driver.manage().window().maximize();
	//press escape button from keyboard to remove login popup
			driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	//Get the top  menu list count
	List<WebElement> menuList= driver.findElements(By.cssSelector("._3sdu8W.emupdz>a>div>.YBLJE4>span>span"));
		System.out.println("Menu List:"+menuList.size());
		//perform mouse hover operations
		for(int i=0; i<menuList.size(); i++) {
			act.moveToElement(menuList.get(i)).perform();//concentrate on this part carefully
			Thread.sleep(1000);
			//print menu list
			WebElement menu = menuList.get(i);
		System.out.println("Menu"+ i +":"+menu.getText());
		
	
		}
	}
}





//one by one print top menu names and also perform mouse hover operations
//for(int i=0; i< menuList.size(); i++) {
//WebElement menu = menuList.get(i);		
//System.out.println("Menu"+i+":"+menu.getText());



	//act.moveToElement(menuList.get(i)).perform();		
	//	Thread.sleep(1000);	

		




	
		
		
		
		
		




