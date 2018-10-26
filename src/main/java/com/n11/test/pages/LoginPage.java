package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By emailBy = By.id("email");
    By passwordBy = By.id("password");
    By loginButtonBy = By.id("loginButton");

    public void login() {
        login("123qwe");
    }

    public void login(String password) {
        write(emailBy, "testbau@mailinator.com");
        write(passwordBy, password);
        clickTo(loginButtonBy);
    }

    public boolean isErrorDisplayed(String warning) {
        return driver.findElement(By.cssSelector("[data-errormessagefor=" + warning + "]")).isDisplayed();
    }
}
