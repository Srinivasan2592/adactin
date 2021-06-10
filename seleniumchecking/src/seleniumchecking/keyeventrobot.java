package seleniumchecking;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class keyeventrobot {

	public static void main(String[] args) throws AWTException {
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
		Robot presstype =new Robot();	
		
		presstype.keyPress(KeyEvent.VK_CONTROL);
        presstype.keyPress(KeyEvent.VK_A);
        
        presstype.keyRelease(KeyEvent.VK_CONTROL);
        presstype.keyRelease(KeyEvent.VK_A);
      // Copy the Current Address using CTRL + C
       
        presstype.keyPress(KeyEvent.VK_CONTROL);
        presstype.keyPress(KeyEvent.VK_X);
        
        presstype.keyRelease(KeyEvent.VK_CONTROL);
        presstype.keyRelease(KeyEvent.VK_X);
        
        //Press the TAB Key to Switch Focus to Permanent Address
        presstype.keyPress(KeyEvent.VK_TAB);
        presstype.keyRelease(KeyEvent.VK_TAB);   
        
       //Paste the Address in the Permanent Address field using CTRL + V
        presstype.keyPress(KeyEvent.VK_CONTROL);
        presstype.keyPress(KeyEvent.VK_V);
        
        presstype.keyRelease(KeyEvent.VK_CONTROL);
        presstype.keyRelease(KeyEvent.VK_V);
       
        //Paste the Address in the Permanent Address field using CTRL + V
        WebElement Txtpass =driver.findElement(By.id("pass"));
        assertEquals(Txtemail.getAttribute("value"),Txtpass.getAttribute("value"));
        String getvalue =Txtpass.getAttribute("value");
		System.out.println("your copy value is :"+getvalue);

	}

	private static void assertEquals(String attribute, String attribute2) {
		// TODO Auto-generated method stub
		
	}
	
	

		// TODO Auto-generated method stub

	}


