package com.task.pageObjects;

import com.task.utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class AuthenticationPage extends Base {

    By mrRBT = By.id("id_gender1");
    By mrsRBT = By.id("id_gender2");

    By firstNameCustomerTxt = By.id("customer_firstname");
    By lastNameCustomerTxt = By.id("customer_lastname");
    By emailTxt = By.id("email");
    By passwordTxt = By.id("passwd");
    By daysSelect = By.id("days");
    By monthsSelect = By.id("months");
    By years = By.id("years");
    By firstNameTxt = By.id("firstname");
    By lastnameTxt = By.id("lastname");
    By addressTxt = By.id("address1");
    By address2Txt = By.id("address2");
    By cityTxt = By.id("city");
    By stateSelect = By.id("id_state");
    By postcodeTxt = By.id("postcode");
    By countrySelect = By.id("id_country");
    By homePhoneTxt = By.id("phone");
    By mobilePhoneTxt = By.id("phone_mobile");
    By aliasAddressTxt = By.id("alias");
    By registerBtn = By.id("submitAccount");
    By signOutBtn = By.xpath("//a[@class='logout']");
    By bestSellers = By.xpath("//a[contains(text(),'Best sellers')]");

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("mr."))
            elementClick(mrRBT);
        else if (gender.equalsIgnoreCase("mrs."))
            elementClick(mrsRBT);


    }

    public void enterCustomersFirstName(String firstName) {
        sendKeysToElement(firstNameCustomerTxt, firstName);
    }

    public void enterCustomersLastName(String lastName) {
        sendKeysToElement(lastNameCustomerTxt, lastName);
    }

    public void enterEmail(String emailAddress) {
        sendKeysToElement(emailTxt, emailAddress);
    }

    public void enterPassword(String password) {
        sendKeysToElement(passwordTxt, password);
    }

    public void selectDate(String date) {
        String[] dateArray = date.split("\\.");
        String day = dateArray[0];
        String month = dateArray[1];
        String year = dateArray[2];

        selectByValue(daysSelect, day);
        selectByValue(monthsSelect, month);
        selectByValue(years, year);
    }

    public void enterFirstName(String firstName) {
        sendKeysToElement(firstNameTxt, firstName);
    }

    public void enterLastName(String lastName) {
        sendKeysToElement(lastnameTxt, lastName);
    }

    public void enterAddress(String address) {
        sendKeysToElement(addressTxt, address);
    }

    public void enterCity(String city) {
        sendKeysToElement(cityTxt, city);
    }

    public void selectState(String state) {
        selectByVisibleText(stateSelect, state);
    }

    public void enterPostalCode(String postalCode) {
        sendKeysToElement(postcodeTxt, postalCode);
    }

    public void selectCountry(String country) {
        selectByIndex(countrySelect, 1);
    }

    public void enterHomePhone(String homePhone) {
        sendKeysToElement(homePhoneTxt, homePhone);
    }

    public void enterMobilePhone(String mobilePhone) {
        sendKeysToElement(mobilePhoneTxt, mobilePhone);
    }

    public void enterAliasAddress(String aliasAddress) {
        sendKeysToElement(aliasAddressTxt, aliasAddress);
    }

    public void clickRegisterButton() {
        clickOnElement(registerBtn);
    }

    public String getActualEmailAddress() {
        WebElement webElement = driver.findElement(emailTxt);
        return webElement.getAttribute("value");
    }

    public boolean signOutExists() {
        WebElement webElement = waitUntilElementIsVisible(signOutBtn);
        return true;
    }

    public void clickBestSellersLink() {
        clickOnElement(bestSellers);
    }

    public boolean FirstNameErrorFormExists() {
        sendKeysToElement(firstNameCustomerTxt, Keys.TAB);
        WebElement element = driver.findElement(By.xpath("//input[@id='customer_firstname']//parent::div[contains(@class,'form-error')]"));
        return element != null;
    }

}
