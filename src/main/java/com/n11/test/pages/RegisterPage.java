package com.n11.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    public void register(WebDriver driver) {
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
        registrationEmailTextBox.sendKeys("testbau3@mailinator.com");
        registrationPasswordTextBox.sendKeys("qwe1234");
        passwordAgainTextBox.sendKeys("qwe1234");
        genderMaleRadioBtn.click();
        acceptContractCheckbox.click();
        submitButton.click();
    }
}
