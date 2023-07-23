package SeleniumUtilExample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.css.CSS2Properties;

public class SeleniumUtil {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public CSS2Properties prop;
	public static Actions action;

	public static WebDriver setUp(String browserName, String appUrl) {
		
	
	if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		driver =new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
	   System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
	   driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
	   System.setProperty("webdriver.ie.driver",".\\executables\\IEDriverServer.exe");
	   driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appUrl);
		wait=new WebDriverWait(driver,20);
		return driver;
		
	}
	
	
}
