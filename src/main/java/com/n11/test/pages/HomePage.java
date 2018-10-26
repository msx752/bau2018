package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    public void clickToLogin(WebDriver driver) {
        WebElement signInButton = driver.findElement(By.cssSelector(".btnSignIn"));
        signInButton.click();
    }

    public String getUserName(WebDriver driver) {
        return driver
                .findElement(By.className("user"))
                .getText();
    }
}
