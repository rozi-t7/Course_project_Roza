package sauceDemoTests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutInfoTest extends TestUtil {

    @Test
    public void checkoutInfo() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        productsPage.addItemToCart("backpack");
        productsPage.addItemToCart("onesie");
        productsPage.viewCartContent();

        CartContentPage cartContentPage = new CartContentPage(driver);
        cartContentPage.goToCheckoutPage();

        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage(driver);
        checkoutInformationPage.addInfo("Nina", "Zamina", String.valueOf(1000));

        Assert.assertTrue(checkoutInformationPage.isContinueButtonShown());
    }
}
