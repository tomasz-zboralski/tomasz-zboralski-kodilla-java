package com.kodilla.testing2.ebay;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EBayTestingApp {
    public static final String NAMEFIELD = "_nkw";

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        webDriver.get("https://www.ebay.com");

        WebElement searchField = webDriver.findElement(By.name(NAMEFIELD));
        searchField.sendKeys("Laptop");
        searchField.submit();

    }
}
