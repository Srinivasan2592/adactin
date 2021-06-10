package seleniumchecking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshort {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("http://greenstech.in/selenium-course-content.html");
	
	String title = driver.getTitle();
	System.out.println("And Your page title is :"+title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("your current url is :"+currentUrl);
	
	//windows maximized
	driver.manage().window().maximize();
	
	TakesScreenshot tsc = ((TakesScreenshot)driver);
	File ScreenshotAs=tsc.getScreenshotAs(OutputType.FILE);
	
	System.out.println(ScreenshotAs);
	File file =new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\google.jpg");
	FileUtils.copyFile(ScreenshotAs, file);
	
	
}
}
