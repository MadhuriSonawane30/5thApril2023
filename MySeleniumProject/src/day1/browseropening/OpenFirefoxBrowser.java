package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {
	public static void main(String[] args) {
	//set property for drive executable using system.setproperty(key,value)
			//System.setProperty("webdriver.gecko.driver","C:\\ACCELERATION\\AUTOMATION\\Softwares\\Workspace\\MySeleniumProject\\executables\\geckodriver.exe");
			//System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		String filePath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";		
		System.setProperty("webdriver.gecko.driver", filePath);		
	//create an instance of required browser class
	FirefoxDriver cdriver=new FirefoxDriver();	
	
		}

	
	}

