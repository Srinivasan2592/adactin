package selenium.wrk.out2;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium.wrk.out2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com//");

		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		// windows maximized
		driver.manage().window().maximize();
		// windows deleting all cookies
		driver.manage().deleteAllCookies();

		WebElement serch = driver.findElement(By.id("twotabsearchtextbox"));
		serch.sendKeys("iphonesXR", Keys.ENTER);

		WebElement First_link = driver
				.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[1]/div/div/div[2]/div/a"));

		// Actions act = new Actions(driver);
		Actions act = new Actions(driver);
		act.contextClick(First_link);
		act.keyDown(Keys.CONTROL).click().perform();

		String win = driver.getWindowHandle();
		System.out.println(win);

		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);

		for (String newtab : tabs) {
			if (!(tabs.equals(newtab))) {
				driver.switchTo().window(newtab);
			}
		}

	}
}
