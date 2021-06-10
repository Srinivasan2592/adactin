package loginfacebook;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumberwithpom.Baseclass;

public class Logindetails extends Baseclass {
	public Logindetails() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement username;
	@FindBy(id = "pass")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginbtn;

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createbtn;

	@FindBy(id = "month")
	private WebElement select;

	public WebElement getCreatebtn() {
		return createbtn;
	}

	public WebElement getSelect() {
		return select;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
