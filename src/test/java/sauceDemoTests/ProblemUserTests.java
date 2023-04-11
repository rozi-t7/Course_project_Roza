package sauceDemoTests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProblemUserProductsPage;

public class ProblemUserTests extends TestUtil {

    @Test
    public void problemUser() {
        ProblemUserProductsPage problemUserProductsPage = new ProblemUserProductsPage(driver);
        problemUserProductsPage.loginWithProblemUser("problem_user", "secret_sauce");

        problemUserProductsPage.navigateToProduct();
        Assert.assertFalse(problemUserProductsPage.isCorrectPageOpened());
        }
}
