package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWay1 {

	public static void main(String[] args) {
		setUp("chrome");
	}

    static WebDriver setUp(String browsername) {
    	WebDriver driver;
    	if(browsername.equalsIgnoreCase("chrome")) {
    		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
    		//create required browser driver class and upcast it to Webdriver interface
    			driver=new ChromeDriver();
    			return driver;
    	}else if(browsername.equalsIgnoreCase("firefox")) {
    		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
    		//create required browser driver class and upcast it to Webdriver interface
    			 driver=new FirefoxDriver();
    			 return driver;	
    	} 
    	return null;
    }
}  



