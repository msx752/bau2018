package com.n11.test;

import com.n11.test.pages.HomePage;
import com.n11.test.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class SmokeTest extends BaseTest {

    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage();
        homePage.clickToLogin(driver);

        LoginPage loginPage = new LoginPage();
        loginPage.login(driver);

        assertTrue(homePage.getUserName(driver).equals("Test Bau"));
    }

    @Test
    public void shouldRegister() {
        System.setProperty("webdriver.chrome.driver", "/Users/taylan.derinbay/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

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
        assertTrue(userElement.getText().equals("Bau Test"));
        driver.quit();
    }
}
