package day26.switching;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ExampleForScreenshots {

	public static void main(String[] args) throws IOException  {
//set the browser and launch the url
		WebDriver driver=SeleniumUtil.setUp("chrome", "https://www.google.com/");
TakesScreenshot ts = (TakesScreenshot)driver;
	File file=	ts.getScreenshotAs(OutputType.FILE);
FileHandler.copy(file, new File(".\\google.jpg"));
		
		
		
		
		
		 
		
		
		
		
		
		

	}

}

//      .\\screenshots\\google.jpg