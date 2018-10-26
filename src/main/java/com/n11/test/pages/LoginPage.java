package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public void login(WebDriver driver) {
        WebElement emailTextBox = driver.findElement(By.id("email"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        emailTextBox.sendKeys("testbau@mailinator.com");
        passwordTextBox.sendKeys("123qwe");
        loginButton.click();
    }
}
