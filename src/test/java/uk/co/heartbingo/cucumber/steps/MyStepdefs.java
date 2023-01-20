package uk.co.heartbingo.cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.heartbingo.pages.LoginPage;

public class MyStepdefs {
    @Given("^user is on homepage$")
    public void userIsOnHomepage() {
    }

    @When("^I click on login link$")
    public void iClickOnLoginLink() {
        new LoginPage().clickOnAcceptCookies();
        new LoginPage().clickOnLoginLink();
    }


    @Then("^User should login page successfully$")
    public void userShouldLoginPageSuccessfully() {
        String expectedMessage = "Log In";
        String actualMessage = new LoginPage().getLoginText();
        Assert.assertEquals("Login page not displayed", expectedMessage, actualMessage);

    }
}
