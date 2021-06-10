package seleniumchecking;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTechClickGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
	    System.out.println("your current url after login is : "+currentUrl2);
	    
	    //click the first link using xpath
	    WebElement txtsearchs = driver.findElement(By.xpath("//*[@id=\'rso\']/div/div[1]/div/div[1]/a"));
		txtsearchs.click();
		
		//getting current url after 1st linked is clicked 
		String currentUrl3 = driver.getCurrentUrl();
	    System.out.println("your current url after login is : "+currentUrl3);
	}

}
