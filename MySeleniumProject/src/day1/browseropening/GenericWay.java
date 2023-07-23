package day1.browseropening;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
//create required browser driver class and upcast it to Webdriver interface
	WebDriver driver=new ChromeDriver();
	}

}
