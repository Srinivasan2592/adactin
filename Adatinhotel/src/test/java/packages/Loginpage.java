package packages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class Loginpage extends Baseclass {
	public Loginpage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement loginbtn;
	@FindBy(xpath = "//input[@id='username_show']")
	private WebElement textcheck;
	@FindBy(xpath = "//img[@alt='Adactin Group: Hotel Reservation System']")
	private WebElement hotelimage;
	@FindBy(xpath = "//img[@alt='Hotel Image 3']")
	private WebElement banner;
	@FindBy(xpath = "//a[@href='https://play.google.com/store/apps/details?id=com.adactin.education.hotelbooking']")
	private WebElement googleplay;
	@FindBy(xpath = "//a[@href='https://testflight.apple.com/join/Ai3nVPMD']")
	private WebElement apple;
	@FindBy(xpath = "//img[@alt='AdactIn Group']")
	private WebElement logo;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getTextcheck() {
		return textcheck;
	}

	public WebElement getHotelimage() {
		return hotelimage;
	}

	public WebElement getBanner() {
		return banner;
	}

	public WebElement getGoogleplay() {
		return googleplay;
	}

	public WebElement getApple() {
		return apple;

	}

	public WebElement getLogo() {
		return logo;
	}

}
