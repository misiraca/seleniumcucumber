package com.task.stepDefintions;

import ScenarioContext.CustomerContext;
import com.task.pageObjects.AuthenticationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class AuthenticationSteps {

    AuthenticationPage authenticationPage;
    CustomerContext customerContext;

    public AuthenticationSteps(CustomerContext customerContext) {
        this.customerContext = customerContext;
        authenticationPage = new AuthenticationPage();
    }

    @Then("^I select Title \"([^\"]*)\"$")
    public void iSelectTitle(String title) {
        authenticationPage.selectGender(title);
    }

    @And("^I enter customers first name \"([^\"]*)\"$")
    public void iEnterCustomersFirstName(String firstName) {
        authenticationPage.enterCustomersFirstName(firstName);
    }

    @And("^I enter customers last name \"([^\"]*)\"$")
    public void iEnterCustomersLastName(String lastName) {
        authenticationPage.enterCustomersLastName(lastName);
    }

    @And("^I verify that email address is prepopulated with email choosen on Create an account page$")
    public void iVerifyThatEmailAddressIsPrepopulatedWithEmailChoosenOnCreateAnAccountPage() {
        String actualEmailAddress = authenticationPage.getActualEmailAddress();

        Assert.assertEquals("Populated email address is not the same as chosen at Create an account page", customerContext.email, actualEmailAddress);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        authenticationPage.enterPassword(password);
        customerContext.password = password;
    }

    @And("^I select date of birth \"([^\"]*)\"$")
    public void iSelectDateOfBirth(String date) {
        authenticationPage.selectDate(date);
    }

    @Then("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String firstName) {
        authenticationPage.enterFirstName(firstName);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastName) {
        authenticationPage.enterLastName(lastName);
    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address) {
        authenticationPage.enterAddress(address);
    }

    @And("^I enter City \"([^\"]*)\"$")
    public void iEnterCity(String city) {
        authenticationPage.enterCity(city);
    }

    @And("^I select State \"([^\"]*)\"$")
    public void iSelectState(String state) {
        authenticationPage.selectState(state);
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String postalCode) {
        authenticationPage.enterPostalCode(postalCode);
    }

    @And("^I select Country \"([^\"]*)\"$")
    public void iSelectCountry(String country) {
        authenticationPage.selectCountry(country);
    }

    @And("^I enter home phone number \"([^\"]*)\"$")
    public void iEnterHomePhoneNumber(String homeNumber) {
        authenticationPage.enterHomePhone(homeNumber);
    }

    @And("^I enter mobile phone number \"([^\"]*)\"$")
    public void iEnterMobilePhoneNumber(String mobilePhone) {
        authenticationPage.enterMobilePhone(mobilePhone);
    }

    @And("^I enter Assign an address alias for future reference \"([^\"]*)\"$")
    public void iEnterAssignAnAddressAliasForFutureReference(String aliasAddress) {
        authenticationPage.enterAliasAddress(aliasAddress);
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        authenticationPage.clickRegisterButton();
    }


    @Then("^I verify that user is logged in successfully$")
    public void iVerifyThatUserIsLoggedInSuccessfully() {
        Assert.assertTrue("User is not logged in", authenticationPage.signOutExists());
    }

    @Then("^I click on best sellers link$")
    public void iClickOnBestSellersLink() {
        authenticationPage.clickBestSellersLink();
    }

    @And("^I get the error that input is wrong$")
    public void iGetTheErrorThatInputIsWrong() {
        Assert.assertTrue(authenticationPage.FirstNameErrorFormExists());
    }
}
