package selenium.wrk.out2;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium.wrk.out2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/table-data-download-demo.html");

		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		// windows maximized
		driver.manage().window().maximize();
		// windows deleting all cookies
		driver.manage().deleteAllCookies();

		List<WebElement> Header = driver.findElements(By.xpath("//*[@id=\"example\"]/thead/tr/th"));
		System.out.println("There are :" + Header.size() + " coloum available");

		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"example\"]/tbody/tr"));
		System.out.println("There are :" + rows.size() + " rows available");

		for (int i = 0; i < Header.size(); i++) {
			System.out.println("coloum names are : " + Header.get(i).getText() + ",");
			for (int j = 0; j < rows.size(); j++) {
				System.out.println("row names are : " +rows.get(i).getText() + ",");
			}
		}

//		for (WebElement rowstxt : rows) {
//			System.out.println("row names are : " + rowstxt.getText() + ",");

		}

	}


