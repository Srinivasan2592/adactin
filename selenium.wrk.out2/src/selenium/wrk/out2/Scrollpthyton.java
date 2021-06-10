package selenium.wrk.out2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollpthyton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);
		driver.manage().window().maximize();
	WebElement scrollDown1 = driver.findElement(By.xpath("//*[@id=\"311110\"]"));
	Actions action = new Actions(driver);
	action.moveToElement(scrollDown1);
	action.build().perform();

	WebElement seleniumTestPapers = driver.findElement(By.xpath("//*[@id=\\'Python-Solutions-Architect-Training\\']"));
	Thread.sleep(4000);
	seleniumTestPapers.click();

//	WebElement scrollDown2 = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
//	js.executeScript("arguments[0].scrollIntoView(true)", scrollDown2);
//
//	WebElement seleniumDay10Task = driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']"));
//	Thread.sleep(4000);
//	seleniumDay10Task.click();

	}

}
