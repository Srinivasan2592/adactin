package selenium.wrk.out2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {

	public static void main(String[] args) throws AWTException, InterruptedException {
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
		// windows deleting all cookies
		// driver.manage().deleteAllCookies();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

		String win = driver.getWindowHandle();
		System.out.println(win);
		Set<String> win1 =driver.getWindowHandles();
		System.out.println(win1);
		
		for (String newtab: win1) {
			if (!(win1.equals(newtab))) {
	    		driver.switchTo().window(newtab);
	    		driver.get("https://www.bing.com/");
		}

	}
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Launch URL in the new tab
		

	}

}
