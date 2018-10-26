package com.n11.test;

import com.n11.test.pages.HomePage;
import com.n11.test.pages.LoginPage;
import com.n11.test.pages.RegisterPage;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SmokeTest extends BaseTest {

    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickToLogin();

        loginPage.login();

        assertTrue(homePage.getUserName().equals("Test Bau"));
    }

    @Test
    public void shouldRegister() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();

        assertTrue(homePage.getUserName().equals("Bau Test"));
    }

    @Test
    public void shouldNotLoginWithWrongPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickToLogin();

        loginPage.login("adskjdh");
        assertTrue(loginPage.isErrorDisplayed("password"));
    }
}
