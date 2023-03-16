package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProblemUserProductsPage {
    protected WebDriver driver;
    private static final String PROBLEM_ADD_TO_CART_LOCATOR = "//button[@id='add-to-cart-sauce-labs-%s']";

    public ProblemUserProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void loginWithProblemUser (String userName1, String passWord1){
            WebElement username = driver.findElement(By.id("user-name"));
            username.click();
            username.sendKeys(userName1);

            WebElement password = driver.findElement(By.id("password"));
            password.click();
            password.sendKeys(passWord1);

            WebElement loginButton = driver.findElement(By.cssSelector("[value=Login]"));
            loginButton.click();
    }
    public void addProductToCart(String productName1){
        String addItem = String.format(PROBLEM_ADD_TO_CART_LOCATOR, productName1);
        WebElement addToCartButton = driver.findElement(By.xpath(addItem));
        addToCartButton.click();
    }
    public boolean isItemAddedInTheCart() {
        return false;
    }
}
