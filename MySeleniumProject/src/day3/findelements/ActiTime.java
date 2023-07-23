package day3.findelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {

	public static void main(String[] args) {
		// open browser
		WebDriver driver = setUp("chrome");
		// implicit wait ,once implicit wait if declared will be default wait for driver
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// enter required application URL
		driver.get("https://demo.actitime.com/login.do");
		// enter user name as admin
		driver.findElement(By.id("username")).sendKeys("admin");

		// enter password as manager
		driver.findElement(By.name("pwd")).sendKeys("manager");

		// Perform click operation
		driver.findElement(By.id("loginButton")).click();

		// validate title
		String expectedTitle = "actiTIME - Enter Time-Track";

		// explicit wait-WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// WebDriver will wait till the page title gets match within given time
		wait.until(ExpectedConditions.titleIs(expectedTitle));

		String actualTitle = driver.getTitle();
		System.out.println("Page title after login:" + actualTitle);
		System.out.println("Home page validation status:" + expectedTitle.equals(actualTitle));

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
