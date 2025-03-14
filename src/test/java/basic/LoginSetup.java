package basic;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSetup {
	@Given("^user navigates to facebook website$")
	public void user_navigates_to_facebook_website() throws Throwable {
	    System.out.println("@Given -user navigates to facebook website$");

	} 

	@When("^user validates the homepage title$")
	public void user_validates_the_homepage_title() throws Throwable {
	    System.out.println("@When -user validates the homepage title$");

	}

	@Then("^user entered ([a-zA-Z]{1,}) username$")
	public void user_entered_valid_username(String username) throws Throwable {
	    System.out.println("@Then user entered "+username+" username$  ");

	}

	@Then("^user entered ([a-zA-Z]{1,}) password$")
	public void user_entered_valid_password(String password) throws Throwable {
	    System.out.println("@Then user entered "+password+" password$ ");

	}

	@Then("^user ([a-zA-Z]{1,}) succesfully logged in$")
	public void user_shouldbe_succesfully_logged_in(String validatelogin) throws Throwable {
	    System.out.println("@Then -user "+validatelogin+" succesfully logged in$");

	}

}
