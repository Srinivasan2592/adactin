package seleniumchecking;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

// this is wrk with action class there is robot class to we can use it
public class KeyboardFunction {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);
		
		//windows maximized
		driver.manage().window().maximize();
		
		WebElement Txtemail =driver.findElement(By.id("email"));
		Txtemail.sendKeys("alan@gmail.com");
		String passvalue= Txtemail.getAttribute("value");
		System.out.println("your pass value is email :"+passvalue);
		
		//object create//
		Actions actions =new Actions(driver);	
		
		actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        
      // Copy the Current Address using CTRL + C
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("x");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        
        //Press the TAB Key to Switch Focus to Permanent Address
        actions.sendKeys(Keys.TAB);
         actions.build().perform();
        
        //Paste the Address in the Permanent Address field using CTRL + V
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("v");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
       
        //Paste the Address in the Permanent Address field using CTRL + V
        WebElement Txtpass =driver.findElement(By.id("pass"));
        assertEquals(Txtemail.getAttribute("value"),Txtpass.getAttribute("value"));
        String getvalue =Txtpass.getAttribute("value");
		System.out.println("your copy value is :"+getvalue);

	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}
	
	}


