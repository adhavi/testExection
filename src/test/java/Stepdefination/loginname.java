package Stepdefination;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginname {
	@Given("login to dispatcher profile")
	public void login_to_dispatcher_profile() {
		System.out.println("hi");
	}

	@When("dispatcher profile having username and password")
	public void dispatcher_profile_having_username_and_password() {
		System.out.println("hi1");
	}


	@Then("Navigating through the login page")
	public void navigating_through_the_login_page() {
		System.out.println("hi2");

	}


	@When("dispatcher profile having user1 and pass1")
	public void dispatcher_profile_having_user1_and_pass1() {
		System.out.println("hi3");

	}

	@When("dispatcher profile having user2 and pass2")
	public void dispatcher_profile_having_user2_and_pass2() {
		System.out.println("hi4");
	}

}
