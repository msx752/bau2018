package com.n11.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTest {

    @Test
    public void openWebSite() {
        System.setProperty("webdriver.chrome.driver", "/Users/taylan.derinbay/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.n11.com");

        /*WebElement signInButton = driver.findElement(By.cssSelector(".btnSignIn"));
        signInButton.click();

        WebElement emailTextBox = driver.findElement(By.id("email"));
        WebElement passwordTextBox = driver.findElement(By.id("password"));
//        WebElement passwordTextBox = driver.findElement(By.cssSelector("#password"));
//        WebElement passwordTextBox = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        emailTextBox.sendKeys("testbau@mailinator.com");
        passwordTextBox.sendKeys("123qwe");
        loginButton.click();

        WebElement userElement = driver.findElement(By.className("user"));

        Assert.assertEquals("Test Bau", userElement.getText());
        Assert.assertTrue(userElement.getText().equals("Test Bau"));*/
        WebElement registerBtn = driver.findElement(By.cssSelector(".btnSignUp"));
        registerBtn.click();
        WebElement nameTextBox = driver.findElement(By.id("firstName"));
        WebElement surnameTextBox = driver.findElement(By.id("lastName"));
        WebElement registrationEmailTextBox = driver.findElement(By.id("registrationEmail"));
        WebElement registrationPasswordTextBox = driver.findElement(By.id("registrationPassword"));
        WebElement passwordAgainTextBox = driver.findElement(By.id("passwordAgain"));
        WebElement genderMaleRadioBtn = driver.findElement(By.id("genderMale"));
        WebElement acceptContractCheckbox = driver.findElement(By.id("acceptContract"));
        WebElement submitButton = driver.findElement(By.id("submitButton"));

        nameTextBox.sendKeys("Bau");
        surnameTextBox.sendKeys("Test");
        registrationEmailTextBox.sendKeys("testbau2@mailinator.com");
        registrationPasswordTextBox.sendKeys("qwe1234");
        passwordAgainTextBox.sendKeys("qwe1234");
        genderMaleRadioBtn.click();
        acceptContractCheckbox.click();
        submitButton.click();
        WebElement userElement = driver.findElement(By.className("user"));
        Assert.assertTrue(userElement.getText().equals("Bau Test"));
    }
}
