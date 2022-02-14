package com.task.pageObjects;

import com.task.utils.Base;
import org.openqa.selenium.By;

public class MyAccountPage extends Base {

    By emailCreateText = By.id("email_create");
    By createAnAccountButton = By.id("SubmitCreate");

    public void enterEmailToCreateAccount(String emailAddress) {
        sendKeysToElement(emailCreateText, emailAddress);
    }

    public void clickCreateAnAccountButton() {
        clickOnElement(createAnAccountButton);
    }

}
