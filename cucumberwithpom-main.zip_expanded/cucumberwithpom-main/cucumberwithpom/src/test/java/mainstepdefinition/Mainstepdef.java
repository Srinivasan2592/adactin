package mainstepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberwithpom.Baseclass;
import loginfacebook.Logindetails;

public class Mainstepdef extends Baseclass {
	Logindetails login;

	@Given("User is in login page")
	public void user_is_in_login_page() {
		getdriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		launchurl("https://www.facebook.com/");

	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		login = new Logindetails();
	
		entertext(login.getUsername(), "raja");
		entertext(login.getPassword(), "123456789");

	}

	@When("Now User should click the login button")
	public void now_User_should_click_the_login_button() {

	}

	@Then("User suceessfully entered in facebook login page")
	public void user_suceessfully_entered_in_facebook_login_page() {
		System.out.println("success");
	}

	@Then("user click the creat new button")
	public void user_click_the_creat_new_button() {
		buttonclick(login.getCreatebtn());
	}

	@When("user select month")
	public void user_select_month() {

//   selectById(login.getSelect(), 2);
		getOptions(login.getSelect());
	}
}