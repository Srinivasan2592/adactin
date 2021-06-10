package seleniumchecking;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brower Name:");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if(browser.equals("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		if(browser.equals("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else
		{
		System.out.println("Invalid browser");
		}
	
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);
		
		//windows maximized
		driver.manage().window().maximize();
		
		// Enter value in search box and getting value from it
        //WebElement txtsearch = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input"));	
		WebElement txtsearch = driver.findElement(By.name("q"));	
		txtsearch.sendKeys("greens velmurugan");
		String searchvalue = txtsearch.getAttribute("value");
		System.out.println("Your search value is :"+searchvalue);
		txtsearch.sendKeys(Keys.ENTER);
		
		//getting current url after search		
		String currentUrl2 = driver.getCurrentUrl();
	    System.out.println("your current url in after click is : "+currentUrl2);
	    
	    //click the first link using xpath
	    WebElement txtsearchs = driver.findElement(By.xpath("//*[@id=\'rso\']/div/div[1]/div/div[1]/a"));
		txtsearchs.click();
		
		//getting current url after 1st linked is clicked 
		String currentUrl3 = driver.getCurrentUrl();
	    System.out.println("Last Webpage is : "+currentUrl3);
		
		
//		Thread.sleep(2000);
//		driver.close();
	
	
	}

}
	