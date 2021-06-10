package seleniumchecking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("alan@gmail.com");
		
		WebElement txtadd = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		txtadd.sendKeys("new value add");
		
		WebElement getvalue =driver.findElement(By.name("username"));
		String value = getvalue.getAttribute("value");
		System.out.println(value);
		
		WebElement valueclear =driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
        valueclear.clear(); 
		
		WebElement btndisable = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = btndisable.isEnabled();
		System.out.println(enabled);
		
	}

}
