package sauceDemoTests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartContentPage;
import pages.LoginPage;
import pages.ProductsPage;

public class CartContentTest extends TestUtil {

    @Test
    public void cartContent() {
        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");


        productsPage.addItemToCart("backpack");
        productsPage.addItemToCart("onesie");
        productsPage.viewCartContent();

        CartContentPage cartContentPage = new CartContentPage(driver);

        Assert.assertTrue(cartContentPage.isItemBackpackShown());
        Assert.assertTrue(cartContentPage.isItemOnesieShown());


    }
}
