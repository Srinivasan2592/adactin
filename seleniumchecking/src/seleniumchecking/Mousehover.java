package seleniumchecking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		
		String title = driver.getTitle();
		System.out.println("And Your page title is :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :"+currentUrl);
		
		//windows maximized
		driver.manage().window().maximize();
		
		//All Departments hover
		WebElement Mouse_hover1 =driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]/div[1]/div[4]/div/ul/li[1]/a"));
		String Mouse_hovertxt_11 = Mouse_hover1.getText();
		System.out.println(Mouse_hovertxt_11);
		
		// object creation for mouse hover
		Actions ho =new Actions(driver);	
		ho.moveToElement(Mouse_hover1).perform();

		Thread.sleep(2000);
		
		//Paint
     	WebElement Mouse_hover2 =driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[1]/div/ul/li[17]/a"));
		String Mouse_hovertxt_21 = Mouse_hover2.getText();
		System.out.println(Mouse_hovertxt_21);
		ho.moveToElement(Mouse_hover2).perform();

		Thread.sleep(2000);
		 //mousehover Interior Paint
		WebElement Mouse_hover3 =driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[2]/div/ul/li[1]/a"));
		String Mouse_hovertxt_31 = Mouse_hover3.getText();
		System.out.println(Mouse_hovertxt_31);
		ho.moveToElement(Mouse_hover3).perform();
		
		Thread.sleep(2000);
		//Cabinet Paint
		WebElement Mouse_hover4 =driver.findElement(By.xpath("//*[@id=\"allDepartmentsFlyout\"]/section[3]/div/ul/li[9]/a"));
		String Mouse_hovertxt_41 = Mouse_hover4.getText();
		System.out.println(Mouse_hovertxt_41);
		Mouse_hover4.click();
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("your navigate to url :"+currentUrl2);
		
}
	}