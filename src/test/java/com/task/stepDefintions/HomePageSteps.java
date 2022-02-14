package com.task.stepDefintions;

import ScenarioContext.CustomerContext;
import com.task.pageObjects.HomepagePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageSteps {

    HomepagePage homepage;
    CustomerContext customerContext;

    public HomePageSteps(CustomerContext customerContext) {
        this.customerContext = customerContext;
        homepage = new HomepagePage();
    }

    @When("^I click on the link button \"([^\"]*)\"$")
    public void iClickOnTheLinkButton(String linkText) {
        homepage.clickSignInButton();
    }

    @Given("^Customer navigates to the homepage$")
    public void customerNavigatesToTheHomepage() {
        homepage.goToUrl("http://automationpractice.com/");
    }


}
