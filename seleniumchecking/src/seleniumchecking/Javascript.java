package seleniumchecking;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\seleniumchecking\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		// windows maximized
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		Scanner scr = new Scanner(System.in);
//		System.out.println("Please enter flipkart mail id/ ph.no:");
//		String user = scr.nextLine();
//		System.out.println("Please enter your Flipkart password");
//		String pass = scr.nextLine();

		WebElement txtusername = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		// txtusername.sendKeys("9043895560");

		String user = "9043895560";
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='" + user + "';", txtusername);

		WebElement txtpass = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
	
		String pass = "9043895560";
		jse.executeScript("arguments[0].value='" + pass + "';", txtpass);

		// jse.executeScript("alert('Welcome to Guru99');");
		// txtpass.sendKeys("9043895560");

		WebElement login = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		// login.click();
		jse.executeScript("arguments[0].click();", login);
	}

}
