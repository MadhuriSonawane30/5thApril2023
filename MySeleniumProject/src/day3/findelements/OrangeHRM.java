package day3.findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRM {

	public static void main(String[] args) {
		// open browser
		WebDriver driver = setUp("chrome");
		// implicit wait,once implicit wait if declare will be declare will be default
		// wait for driver
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// enter required application url
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		// enter user name as Admin
		/** identify username input field */
		//driver.findElement(By.name("username"));
	
		/** type username in the userNameInputField */
		//userNameInputField.sendKeys("Admin");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
	}
		

	static WebDriver setUp(String browsername) {
		WebDriver driver;
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
			// create required browser driver class and upcast it to webdriver interface
			driver = new ChromeDriver();
			return driver;
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
			// create required browser driver class and upcast it to webdriver interface
			driver = new FirefoxDriver();
			return driver;
		}
		return null;
	}

}
