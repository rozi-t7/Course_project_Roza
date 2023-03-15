package sauceDemoTests;

import base.TestUtil;
import org.testng.annotations.Test;
import pages.CartContentPage;
import pages.LoginPage;

public class CartContentTest extends TestUtil {

    @Test
    public void cartContent() {
        CartContentPage cartContentPage = new CartContentPage(driver);

    }
}
