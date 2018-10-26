package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public LoginPage clickToLogin(WebDriver driver) {
        driver.findElement(By.cssSelector(".btnSignIn")).click();
        return new LoginPage();
    }

    public String getUserName(WebDriver driver) {
        return driver
                .findElement(By.className("user"))
                .getText();
    }

    public void clickRegisterButton(WebDriver driver) {
        driver.findElement(By.cssSelector(".btnSignUp")).click();
    }
}
