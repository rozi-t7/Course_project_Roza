package sauceDemoTests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProblemUserProductsPage;

public class ProblemUserTest extends TestUtil {

    @Test
    public void problemUser() {
        LoginPage loginPage = new LoginPage(driver);
        ProblemUserProductsPage problemUserProductsPage = new ProblemUserProductsPage(driver);
        problemUserProductsPage.loginWithProblemUser("problem_user", "secret_sauce");

        problemUserProductsPage.addProductToCart("bolt-t-shirt");

        Assert.assertFalse(problemUserProductsPage.isItemAddedInTheCart());
    }
}
