package testpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Browserlaunch.Baseclass;
import loginpackage.loginpage;

public class Testcase extends loginpage {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		Baseclass baseclass = new Baseclass();
		baseclass.getDriver();
		loginpage login = new loginpage();
		WebElement txtusername = login.getTxtusername();
		txtusername.sendKeys("balanece92@gmail.com");
		WebElement txtpass = login.getTxtpass();
		txtpass.sendKeys("8870993866");
		WebElement loginbtn = login.getLoginbtn();
		loginbtn.click();
	}

}

