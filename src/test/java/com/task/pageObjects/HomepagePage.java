package com.task.pageObjects;

import com.task.utils.Base;
import org.openqa.selenium.By;

public class HomepagePage extends Base {
    By signInButton = By.xpath("//a[@class='login']");
    By searchText = By.id("search_query_top");

    private String productName;

    public void clickSignInButton() {
        clickOnElement(signInButton);
    }

    public void goToUrl(String url) {
        driver.navigate().to(url);
    }

}

