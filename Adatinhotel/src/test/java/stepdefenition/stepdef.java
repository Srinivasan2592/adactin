package stepdefenition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import Baseclass.Baseclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import packages.Loginpage;

public class stepdef extends Baseclass {
	Loginpage login;

	@Given("user is in login page validating url")
	public void user_is_in_login_page_validating_url() {
		getdriver();
		launchurl("https://adactinhotelapp.com/index.php");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	}

	@When("User checking logo,banner,app image")
	public void user_checking_logo_banner_app_image() {
		boolean displayed = login.getLogo().isDisplayed();
		Assert.assertTrue(displayed);

	}

	@Given("user entering username {string} and password {string}")
	public void user_entering_username_and_password(String string, String string2) {
		login = new Loginpage();
		entertext(login.getUsername(), string);
		entertext(login.getPassword(), string2);

	}

	@Given("user clicking login button")
	public void user_clicking_login_button() {
		buttonclick(login.getLoginbtn());

	}

	@Then("Verfiy user enter login into Adatn Hotel Page")
	public void verfiy_user_enter_login_into_Adatn_Hotel_Page() {

	}

}
