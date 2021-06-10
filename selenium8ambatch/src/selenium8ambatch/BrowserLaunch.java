package selenium8ambatch;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium8ambatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		
		TakesScreenshot tsc = ((TakesScreenshot)driver);
		
		
		Scanner scr = new Scanner(System.in);
		//System.out.println("Please enter flipkart mail id/ ph.no:");
		//String user = scr.nextLine();
		//System.out.println("Please enter your Flipkart password");
		//String pass = scr.nextLine();

		WebElement txtusername = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		txtusername.sendKeys("9043895560");

		WebElement txtpass = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		txtpass.sendKeys("9043895560");

		WebElement login = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		login.click();
		File Screenshot=tsc.getScreenshotAs(OutputType.FILE);
		System.out.println(Screenshot);
		File file= new File ("C:\\Users\\admin\\Pictures\\Saved Pictures\\flipkart_login.jpg");
		System.out.println(file);
		FileUtils.copyFile(Screenshot, file);
		Thread.sleep(1000);
		
		WebElement home = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[6]/a/div[2]/div/div"));

		Actions ac = new Actions(driver);
		ac.moveToElement(home).build().perform();
		Thread.sleep(1000);
		WebElement livi = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[2]"));
		ac.moveToElement(livi).build().perform();
		WebElement chair = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div/div/div[6]/a/div[2]/div[2]/div[2]/div/div/div[2]/a[13]"));
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", chair);
		Thread.sleep(2000);

		System.out.println("Please enter your rating");
		String rate = scr.nextLine();

		if (rate.equals("4_above")) {
			WebElement rating4 = driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div/div/section[6]/div[2]/div/div[1]/div/div/label/div[2]"));
			rating4.click();

		} else if (rate.equals("3_above")) {
			WebElement rating3 = driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[6]/div[2]/div/div[3]/div/div/label/div[1]"));
			rating3.click();

		} else if (rate.equals("2_above"))

		{
			WebElement rating2 = driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[6]/div[2]/div/div[4]/div/div/label/div[1]"));
			rating2.click();

		} else if (rate.equals("1_above")) {
			WebElement rating1 = driver.findElement(By.xpath(
					"//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[6]/div[2]/div/div[5]/div/div/label/div[1]"));
			rating1.click();

		} else  
		{

			System.err.println("Please enter correct rating");
			System.out.println("----------------------------");
			System.out.println("Please enter your rating");
			System.out.println("----------------------------");
			
		
		}

		

	}
}
