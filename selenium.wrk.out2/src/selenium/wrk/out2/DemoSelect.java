package selenium.wrk.out2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium.wrk.out2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);
		
		
		WebElement select1=driver.findElement(By.id("oldSelectMenu"));
		Select se = new Select(select1);
		se.selectByValue("1");
		
		WebElement select2 = driver.findElement(By.id("cars"));
		Select sel = new Select(select2);
//		List<WebElement> options2 = sel.getOptions();
//		for (WebElement optionsvalue : options2) {
//			System.out.println(optionsvalue);
//		}
		sel.selectByVisibleText("Audi");
		WebElement firstSelectedOption = sel.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		WebElement colors = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
		Select sel1 = new Select(colors);
		Thread.sleep(2000);
		List<WebElement> options = sel1.getOptions();
		for (int i = 0; i < options.size(); i++) {
			WebElement webElement = options.get(i);
			String attribute = webElement.getAttribute("Blue");
			System.out.println(attribute);
		}
		boolean multiple = sel1.isMultiple();
		System.out.println("This is Multiple Select " + multiple);
	
		

		//driver.quit();
	}

}
