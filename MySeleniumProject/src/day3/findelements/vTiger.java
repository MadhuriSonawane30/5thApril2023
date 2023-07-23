package day3.findelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class vTiger {

	public static void main(String[] args) {
		// open browser
		WebDriver driver = setUp("chrome");
		// enter required application url
		driver.get("https://demo.vtiger.com/vtigercrm/");
		// enter user name as admin
		/** identify username input field */
		driver.findElement(By.id("username"));
		WebElement userNameInputField = driver.findElement(By.id("username"));
		/** type username in the userNameInputField */
		userNameInputField.clear();
		userNameInputField.sendKeys("admin");
		// enter password as password
		driver.findElement(By.name("password"));
		WebElement passwordInputField = driver.findElement(By.name("password"));
		/** typepassword in the passwordInputField */
		passwordInputField.clear();
		passwordInputField.sendKeys("Test@123");
		// click on login button
		driver.findElement(By.className("button"));
		WebElement loginButton = driver.findElement(By.className("button"));
		// Perform click operation on login button
		loginButton.click();
		// validate login done successfully or not
		String expectedUrl = ("vtigercrm");
		String actualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL:" + actualUrl);
		System.out.println("Login validation status:" + actualUrl.contains(expectedUrl));
      driver.close();
	}

	

	static WebDriver setUp(String browsername) {
		WebDriver driver;
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
//create required browser driver class and upcast it to webdriver interface
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
