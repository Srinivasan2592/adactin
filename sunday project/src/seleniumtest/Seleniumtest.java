package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\selenium8ambatch\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.leafground.com/pages/Edit.html");

//to maximized window
driver.manage().window().maximize();

 WebElement txtclickedit = driver.findElement(By.id("email"));
 txtclickedit.sendKeys("ala@gmail.com");
 System.out.println("txtclickedit"); 
 
 driver

	}

}
