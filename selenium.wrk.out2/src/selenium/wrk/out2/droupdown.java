package selenium.wrk.out2;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;




public class droupdown
{
	private List<String> getCurrentReportingPeriodContent() {
	    // List to hold the value we will return to the caller.
	    List<String> currentOptions = new ArrayList<>();
		return currentOptions;
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form/");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);
		
		//windows maximized
		driver.manage().window().maximize();
		
		WebElement state1=driver.findElement(By.id("react-select-3-input"));
		state1.sendKeys(" ");
		List arrList = new ArrayList();
		arrList.add(state1);
		for(Object arrListItem : arrList){
			System.out.println("Value of Array List at the index "+arrList.indexOf(arrListItem)+" is "+arrListItem);
		}	
		
//	    List<WebElement> state=driver.findElements(By.id("react-select-3-input"));
//		for(WebElement eachOpt : state) {
//			   String currentOptions = eachOpt.getText();
//			  System.out.println(state1);
//		}
//		
		

	
	}}

	

