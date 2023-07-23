package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
//set property for drive executable using system.setproperty(key,value)
		//System.setProperty("webdriver.chrome.driver","C:\\ACCELERATION\\AUTOMATION\\Softwares\\Workspace\\MySeleniumProject\\executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		
String filePath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";		
	System.setProperty("webdriver.chrome.driver", filePath);		
//create an instance of required browser class
ChromeDriver cdriver=new ChromeDriver();	
	}

} 