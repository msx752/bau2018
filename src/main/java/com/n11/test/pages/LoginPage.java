package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    By emailBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginButton");

    public void login(WebDriver driver) {
        login(driver, "123qwe");
    }

    public void login(WebDriver driver, String password) {
        driver.findElement(emailBy).sendKeys("testbau@mailinator.com");
        driver.findElement(passwordBy).sendKeys(password);
        driver.findElement(loginButtonBy).click();
    }

    public boolean isErrorDisplayed(WebDriver driver, String warning) {
        return driver.findElement(By.cssSelector("[data-errormessagefor=" + warning + "]")).isDisplayed();
    }
}
