package selenium.wrk.out2;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettingGoogleValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium.wrk.out2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com//");

		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		// windows maximized
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("selenium trainning in chennai",Keys.ENTER);
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total available links in google is:"+Links.size());
		
		for (int i = 0; i < Links.size(); i++) {
			System.out.println(Links.get(i).getText());
			
		}
		WebElement searchlink =driver.findElement(By.partialLinkText("Selenium Training in Chennai | Selenium Certification Courses"));
		Actions act = new Actions(driver);
		act.contextClick(searchlink);
		act.keyDown(Keys.CONTROL).click().perform();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl2);
		
		Set<String> allwindow =driver.getWindowHandles();
		System.out.println(allwindow);
		
		for (String newtab :allwindow) {
			driver.switchTo().window(newtab);	
		}
		
		
	}

}
