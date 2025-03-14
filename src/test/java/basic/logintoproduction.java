package basic;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class logintoproduction {
	@Then("^user validates the captcha image$")
	public void user_validates_the_captcha_image() throws Throwable {
		System.out.println("\"^user validates the captcha image$\"");
	}

}
