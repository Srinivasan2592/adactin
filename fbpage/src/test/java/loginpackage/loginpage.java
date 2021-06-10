package loginpackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Browserlaunch.Baseclass;

public class loginpage extends Baseclass {

	public loginpage() {
		PageFactory.initElements(driver,this);
	}
	/*find locators for email */
	@FindBy(id="email")
	private WebElement txtusername;
	
	/*find locators for password */
	@FindBy(id = "pass")
	private WebElement txtpass;
	
	/*find locators for loginbtn */
	@FindBy(id="u_0_d_J4")
	private WebElement loginbtn;
	
	/* @return the txtusername*/
	public WebElement getTxtusername() {
		return txtusername;
	}
	/* @return the txtpass*/
	public WebElement getTxtpass() {
		return txtpass;
	}
	/* @return the login*/
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
