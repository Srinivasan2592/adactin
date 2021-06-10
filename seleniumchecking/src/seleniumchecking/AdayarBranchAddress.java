package seleniumchecking;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdayarBranchAddress {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	
	String title = driver.getTitle();
	System.out.println("And Your page title is :"+title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println("your current url is :"+currentUrl);
	
	//windows maximized
	driver.manage().window().maximize();
	
	//find the adyar address inparticular page
	WebElement txtaddress =driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/h1"));
	String searchvalue = txtaddress.getText();
	
	//highlighting output
	System.out.println("*******************");
	System.out.println("*******************");
	
	//print the particular address
	System.out.println(searchvalue);
	
	//highlighting output
	System.out.println("*******************");
	System.out.println("*******************");
  }
}
