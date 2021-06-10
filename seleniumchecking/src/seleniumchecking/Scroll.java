package seleniumchecking;
import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {
	
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);

	WebElement scrollDown1 = driver.findElement(By.xpath("//h3[text()='Core Python training Course Syllabus']"));
	// WebElement scrullUp =
	// driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDown1);

	/*
	* Thread.sleep(4000); js.executeScript("arguments[0].scrollIntoView(false)",
	* scrullUp);
	*/

	WebElement seleniumTestPapers = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
	Thread.sleep(4000);
	seleniumTestPapers.click();

	WebElement scrollDown2 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
	js.executeScript("arguments[0].scrollIntoView(true)", scrollDown2);

	WebElement seleniumDay10Task = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
	Thread.sleep(4000);
	seleniumDay10Task.click();

	WebElement windowsHandlingBtn = driver.findElement(By.xpath("//button[text()='Windows Handling']"));
	Thread.sleep(5000);
	windowsHandlingBtn.click();
	String parentWindow = driver.getWindowHandle();
	Set<String> childWindow = driver.getWindowHandles();
	System.out.println(parentWindow);
	System.out.println(childWindow);

	for (String win : childWindow) {

	if (!(parentWindow.equals(win))) {
	driver.switchTo().window(win);
	}
	}

	WebElement entireText = driver.findElement(By.xpath("//pre[contains(text(), '1.What is the purpose')]"));
	String text = entireText.getText();
	System.out.println(text);
	String substring = text.substring(95, 137);
	System.out.println("**");
	System.out.println(substring);
	}
	}


