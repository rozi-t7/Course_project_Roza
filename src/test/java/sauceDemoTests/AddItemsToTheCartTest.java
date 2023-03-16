package sauceDemoTests;

import base.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;
import java.time.Duration;
import java.util.Collections;
import java.util.NoSuchElementException;

public class AddItemsToTheCartTest extends TestUtil {
    @Test
        public void addItemToTheCart (){
            LoginPage loginPage = new LoginPage(driver);
            ProductsPage productsPage = loginPage.login("standard_user", "secret_sauce");

        FluentWait fluentwait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoreAll(Collections.singleton(NoSuchElementException.class));
        WebElement sortingDropDown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
        fluentwait.until(ExpectedConditions.elementToBeClickable(sortingDropDown));
        sortingDropDown.click();

        FluentWait fluentWait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoreAll(Collections.singleton(NoSuchElementException.class));
        WebElement lowToHighOption = driver.findElement(By.cssSelector("[value=lohi]"));
        fluentwait.until(ExpectedConditions.elementToBeClickable(lowToHighOption));
        lowToHighOption.click();

        productsPage.addItemToCart("backpack");
        productsPage.addItemToCart("onesie");

        Assert.assertEquals(productsPage.ProductsNumberInTheCart(),2,"We add two items in the cart");

         }
    }
