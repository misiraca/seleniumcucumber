package com.task.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    public static WebDriver driver;
    public static int defaultTimeout = 30;

    public Base() {
        driver = Driver.driver;
    }


    public WebElement waitUntilElementIsVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, defaultTimeout);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void elementClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element);
    }

    public void elementClick(By by) {
        WebElement element = waitUntilElementIsVisible(by);
        ((JavascriptExecutor) driver).executeScript("return arguments[0].click();", element);
    }

    public void clickElementByPartialLinkText(String partialLinkText) {
        WebElement element = waitUntilElementIsVisible(By.partialLinkText(partialLinkText));
    }

    public void clickOnElement(By by) {
        WebElement element = waitUntilElementToBeClickable(by);
        element.click();
    }

    public void sendKeysToElement(By by, String text) {
        WebElement webElement = waitUntilElementIsVisible(by);
        webElement.clear();
        webElement.sendKeys(text);
    }

    public void sendKeysToElement(By by, Keys key) {
        WebElement webElement = waitUntilElementIsVisible(by);
        webElement.clear();
        webElement.sendKeys(key);
    }

    public void selectByValue(By by, String value) {
        WebElement webElement = waitUntilElementIsVisible(by);
        Select select = new Select(webElement);
        select.selectByValue(value);
    }

    public void selectByVisibleText(By by, String text) {
        WebElement webElement = waitUntilElementIsVisible(by);
        webElement.click();
        Select select = new Select(webElement);
        select.selectByVisibleText(text);
    }

    public void selectByIndex(By by, int index) {
        WebElement webElement = waitUntilElementIsVisible(by);
        Select select = new Select(webElement);
        select.selectByIndex(index);
    }
}
