package com.task.stepDefintions;

import ScenarioContext.CustomerContext;
import com.task.pageObjects.MyAccountPage;
import com.task.utils.Helper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class MyAccountSteps {

    MyAccountPage myAccount;
    CustomerContext customerContext;

    public MyAccountSteps(CustomerContext customerContext)
    {
        this.customerContext=customerContext;
        myAccount=new MyAccountPage();
    }

    @And("^I enter email address to Create an account box$")
    public void iEnterEmailAddressToCreateAnAccount()
    {
        String email="dragutin91+"+ Helper.generateRandomNumber() +"@gmail.com";
        myAccount.enterEmailToCreateAccount(email);
        customerContext.email=email;
    }


    @Then("^I click on \"Create an account\" button$")
    public void iClickOnButton()  {
       myAccount.clickCreateAnAccountButton();
    }
}
