package sauceDemoTests;

import base.TestUtil;
import com.opencsv.exceptions.CsvException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import utils.CsvHelper;
import java.io.IOException;

public class LoginTests extends TestUtil {
    @DataProvider(name = "csvUserNames")
    public static Object[][] readUserFromCsv() throws IOException, CsvException {
        return CsvHelper.readCsvFile("src/test/resources/users.csv");
    }
    @Test(dataProvider = "csvUserNames")
    public void SuccessfulLoginTest(String userName, String passWord) {
            LoginPage loginPage = new LoginPage(driver);
            ProductsPage productsPage = loginPage.login(userName, passWord);
                }
    @Test
    public void UnsuccessfulLoginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.tryToLogin("standard_user123", "secret_sauce");

        Assert.assertTrue(loginPage.isErrorMessageShown());
    }
}
