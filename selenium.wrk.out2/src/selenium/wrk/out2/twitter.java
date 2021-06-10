package selenium.wrk.out2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitter {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium.wrk.out2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		WebElement username = driver.findElement(By.name("session[username_or_email]"));
		username.sendKeys("8870993866");

		WebElement userpsw = driver.findElement(By.name("session[password]"));
		userpsw.sendKeys("8870993866");
		
		WebElement loginbtn=driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[2]/form/div/div[3]/div/div/span/span"));
		loginbtn.click();
		
		driver.quit();
	}

}
