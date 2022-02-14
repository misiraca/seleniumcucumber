package com.task.utils;

import org.openqa.selenium.WebDriver;

public  class Driver {

    public static WebDriver driver;

    public static void closeDriver()
    {
        driver.quit();
    }

}
