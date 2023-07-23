package day9MultipleElementsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoBlaze {
	 static WebDriver driver;
	public static void main(String[] args) {
	
 
 driver=Selenium.setUp("chrome","https://demoblaze.com/");
 //maximize the browser
 driver.manage().window().maximize();
 //identify all mobile devices
 List<WebElement>mobileList=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h4>a"));
 System.out.println("Total mobile found:"+mobileList.size());
  
//print one by one all the suggestions in the console
for(int i=0; i< mobileList.size();i++ ) {
	 WebElement mobile=mobileList.get(i);
	 
//print mobile price
	 List<WebElement>mobilePrice=driver.findElements(By.cssSelector("#tbodyid>div>div>.card-block>h5"));
		 WebElement mobilerate =mobilePrice.get(i);	
	 
	 System.out.println("Mobile name "+i+":"+mobile.getText());
	 System.out.println("Mobile Price:"+mobilerate.getText());
	 
	 
	 
	 
}
}
	}

	


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



