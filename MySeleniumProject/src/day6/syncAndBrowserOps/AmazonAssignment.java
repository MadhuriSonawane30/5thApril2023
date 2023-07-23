package day6.syncAndBrowserOps;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAssignment {
	public static void main(String[] args) throws InterruptedException {
		// set required browser driver executable path using
		// System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// create instance of required browser class
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Enter the required URL
		driver.get("https://www.amazon.in/");
		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(1500);
		// minimize browser window
		driver.manage().window().setSize(new Dimension(700, 500));
		Thread.sleep(1500);
		// maximize browser window
		driver.manage().window().maximize();
		// get page title and print it
		String appTitle = driver.getTitle();
		System.out.println("Current page title is:" + appTitle);
		System.out.println("Current page title is:" + driver.getTitle());
		// click on Amazon fashion link from menu bar
		WebElement amazonFashionLinkField = driver.findElement(By.className("nav-left"));
		amazonFashionLinkField.click();

		// Validate the title
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		// Explicit Wait WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// WebDriver will wait till the page title matches with in given time
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		String actualTitle = driver.getTitle();
		System.out.println("Page title :" + driver.getTitle());
		System.out.println("Home page validation status:" + expectedTitle.equals(actualTitle));
		
		// navigate back to previous page
		driver.navigate().back();
		Thread.sleep(1500);
		// get page title and print it
		String appTitle2 = driver.getTitle();
		System.out.println("Current page title is:" + appTitle);
		System.out.println("Current page title is:" + driver.getTitle());
		//close the browser
		driver.close();
		

		
		
		
		
	}

}