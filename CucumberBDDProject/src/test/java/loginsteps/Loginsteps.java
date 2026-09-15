package loginsteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class Loginsteps {

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page");
    }

    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("User enters valid username and password");
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("User should be logged in successfully");
    }
}