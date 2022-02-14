package com.task.hooks;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import com.task.utils.Driver;

public class Hooks {

    @Before()
    public void beforeScenario() {
        WebDriverManager.chromedriver().setup();
        Driver.driver = new ChromeDriver();
        Driver.driver.manage().window().maximize();
    }

    @After
    public void afterScenario() {
        Driver.closeDriver();
    }


}
