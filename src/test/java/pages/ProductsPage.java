package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    protected WebDriver driver;
    private static final String ADD_TO_CART_LOCATOR = "//button[@id='add-to-cart-sauce-labs-%s']";

    @FindBy(id = "shopping_cart_container")
    private WebElement shoppingCartButton;

    @FindBy(className = "shopping_cart_badge")
    private WebElement shoppingCartImage;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void addItemToCart(String productName) {
        String ItemToBeAddedByXpath = String.format(ADD_TO_CART_LOCATOR, productName);
        WebElement addToCartButton = driver.findElement(By.xpath(ItemToBeAddedByXpath));
        addToCartButton.click();
    }
    public int ProductsNumberInTheCart() {
        return Integer.parseInt(shoppingCartImage.getText());
    }

    public CartContentPage viewCartContent() {
        shoppingCartButton.click();
        return new CartContentPage(driver);
    }
}

