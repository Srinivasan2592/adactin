package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLauch {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\selenium7ambatch\\Driver\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.redbus.in/");
	String title =  driver.getTitle();
	System.out.println(title);
	String CurrentUrl=driver.getCurrentUrl();
	System.out.println(CurrentUrl);
	WebElement txtsrc = driver.findElement(By.id("src"));
	txtsrc.sendKeys("Mattuthavani, Madurai");
	WebElement txtdest = driver.findElement(By.id("dest"));
	txtdest.sendKeys("Koyambedu, Chennai");
	WebElement txtcal=driver.findElement(By.id("onward_cal.db"));
	txtcal.sendKeys("18-Feb-2021");
	WebElement btnsearch_btn = driver.findElement(By.name("search_btn"));
	btnsearch_btn.click();
	
	
}
}
