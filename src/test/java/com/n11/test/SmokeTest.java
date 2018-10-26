package com.n11.test;

import com.n11.test.pages.HomePage;
import com.n11.test.pages.LoginPage;
import com.n11.test.pages.RegisterPage;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;
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
        LoginPage loginPage = homePage.clickToLogin(driver);

        loginPage.login(driver);

        assertTrue(homePage.getUserName(driver).equals("Test Bau"));
    }

    @Test
    public void shouldRegister() {
        HomePage homePage = new HomePage();
        homePage.clickRegisterButton(driver);

        RegisterPage registerPage = new RegisterPage();
        registerPage.register(driver);

        assertTrue(homePage.getUserName(driver).equals("Bau Test"));
    }

    @Test
    public void shouldNotLoginWithWrongPassword() {
        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.clickToLogin(driver);

        loginPage.login(driver, "adskjdh");
        assertTrue(loginPage.isErrorDisplayed(driver, "password"));
    }
}
