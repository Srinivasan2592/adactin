package seleniumchecking;

import java.awt.Desktop.Action;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Select {

	public Select(WebElement w) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver = new FirefoxDriver();
		driver.get("http://ironspider.ca/forms/dropdowns.htm");
		WebElement w = driver.findElement(By.name("coffee"));
		Select s=new Select(w);
		//s.selectByValue("regular");
		s.selectByVisibleText("With cream & sugar");

		}

	private void selectByVisibleText(String string) {
		// TODO Auto-generated method stub
		
	}

	    private void selectByValue(String string) {
		// TODO Auto-generated method stub
		
	}

	
		}

