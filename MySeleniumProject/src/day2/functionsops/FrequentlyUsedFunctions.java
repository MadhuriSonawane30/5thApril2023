package day2.functionsops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrequentlyUsedFunctions {
	public static void main(String[] args) {  
         //open required browser
           WebDriver driver =setUp("chrome");
           //enter application url
           driver.get("https://www.google.com");
           //get title page
          String appTitle= driver.getTitle();
         System.out.println("Current page title is:"+driver.getTitle());  
         System.out.println("Current page title char count:"+appTitle.length());
         //Validate google search page opened or not
         String expectedTitle ="Google";
         if(appTitle.equals(expectedTitle)) {
        System.out.println("Google search page validate is passed"); 
	}else{
		System.out.println("Google search page not opened or its title got changed");
	  //get page current URL
         System.out.println("Current page URL:"+driver.getCurrentUrl());
         System.out.println("Current page URL:"+driver.getCurrentUrl().length());
          //get current page source code
      driver.getPageSource();
      String pageSource=driver.getPageSource();
     // System.out.println("Current pagesource:"+driver.getPageSource());
      System.out.println("Current pagesource char count:"+pageSource.length());
      //close current browser instance
     
	}       
	}          
    static WebDriver setUp(String browsername) {
	    WebDriver driver;
	 if(browsername.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe"); 
	//create required browser driver class and upcast it to webdriver interface
	driver =new ChromeDriver();
	return driver;
	 }else if(browsername.equalsIgnoreCase("firefox")) {
	System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");	 
		//create required browser driver class and upcast it to webdriver interface 
		 driver=new FirefoxDriver();
		 return driver;
	 }
	 return null;
 }
    
}