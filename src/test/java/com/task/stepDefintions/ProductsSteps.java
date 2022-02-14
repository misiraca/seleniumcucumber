package com.task.stepDefintions;

import ScenarioContext.CustomerContext;
import com.task.pageObjects.ProductsPage;
import cucumber.api.java.en.And;
import org.junit.Assert;

import java.io.IOException;

public class ProductsSteps {

    ProductsPage productsPage;
    CustomerContext customerContext;

    public ProductsSteps(CustomerContext customerContext) {
        this.customerContext = customerContext;
        productsPage = new ProductsPage();
    }

    @And("^I verify that best sellers category has 7 products$")
    public void iVerifyThatBestSellersCategoryHasProducts() {
        int productsSum = productsPage.getTotalBestSellersProduct();
        Assert.assertEquals(7, productsSum);
    }

    @And("^I enter \"([^\"]*)\" into the search field$")
    public void iEnterIntoTheSearchField(String text) {
        productsPage.enterSearchText(text);
    }

    @And("^I save results to txt file$")
    public void iSaveResultsToTxtFile() throws IOException {
        productsPage.saveProductToFile();
    }


}
