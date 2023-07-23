package day9MultipleElementsDropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSuggestions {
   static WebDriver driver;
	public static void main(String[] args) {
		driver=Selenium.setUp("chrome","https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Testing interview questions");
		List<WebElement> sugg=driver.findElements(By.cssSelector("ul[class='G43f7e']>li>div>*:nth-child(2)>*:first-child>*:first-child>span"));
	 System.out.println("Suggestion count:"+sugg.size());
	 
	for(int i=0; i< sugg.size();i++) {
		WebElement element=sugg.get(i);
		String suggestions= element.getText();
		System.out.println("Suggestion found:"+suggestions);
		System.out.println("Suggestion contains searched text?"+suggestions.contains("testing interview questions"));
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
