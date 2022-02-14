package com.task.pageObjects;

import com.task.utils.Base;
import com.task.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class ProductsPage extends Base {

    By products = By.xpath("//div[@class='product-container']//a[@class='product-name']");
    By searchText = By.id("search_query_top");
    By searchBtn = By.name("submit_search");
    By getBestSellersProduct = By.xpath("//div[@class='product-image-container']");

    public void enterSearchText(String text) {
        sendKeysToElement(searchText, text);
        clickOnElement(searchBtn);
    }

    public void saveProductToFile() throws IOException {
        List<WebElement> webElementList = driver.findElements(products);
        String filePath = "src/main/printedDressesFiles/products" + Helper.generateRandomNumber() + ".txt";
        String productName;
        for (WebElement product : webElementList) {
            productName = product.getText().trim();
            Helper.WriteToFile(productName, filePath);
        }
    }

    public int getTotalBestSellersProduct() {
        waitUntilElementIsVisible(getBestSellersProduct);
        List<WebElement> webElementList = driver.findElements(getBestSellersProduct);
        return webElementList.size();
    }
}

