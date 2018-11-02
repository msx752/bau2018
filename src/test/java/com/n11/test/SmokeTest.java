package com.n11.test;

import com.n11.test.pages.*;
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

    @Test
    public void shouldSearch() {
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickToLogin();

        loginPage.login();
        SearchResultPage resultPage = homePage.search("samsung");
        assertThat("When a buyer searchs a keyword", resultPage.getResultText(), is(equalTo("Samsung")));
    }

    @Test
    public void shouldAddToCart() {
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = homePage.getFirstProduct();
        String productName = productPage.getProductName();
        productPage.addToCart();

        MyCartPage myCartPage = productPage.goToCart();
        assertThat("When a buyer adds a product to cart, ", myCartPage.getProductName(), is(equalTo(productName)));
    }
}
