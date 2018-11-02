package com.n11.test;

import com.n11.test.pages.HomePage;
import com.n11.test.pages.LoginPage;
import com.n11.test.pages.RegisterPage;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SmokeTest extends BaseTest {

    @Test
    public void shouldLogin() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickToLogin();

        loginPage.login();

        assertThat("When a buyer login, ", homePage.getUserName(), equalTo("Test Bau"));
    }

    @Test
    public void shouldRegister() {
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterButton();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.register();

        assertThat("When a buyer register, ", homePage.getUserName(), is(equalTo("Bau Test")));
    }

    @Test
    public void shouldNotLoginWithWrongPassword() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickToLogin();

        loginPage.login("adskjdh");
        assertThat("When a buyer tries to login with invalid password, ", loginPage.isErrorDisplayed("password"));
    }
}
