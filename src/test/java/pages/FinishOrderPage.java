package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishOrderPage {
    protected WebDriver driver;
    @FindBy (className = "complete-header")
    private WebElement title;

    @FindBy(id = "back-to-products")
    private WebElement backToHomeButton;

    public FinishOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public ProductsPage backToProducts() {
        backToHomeButton.click();
        return new ProductsPage(driver);
}
    public boolean isHomeButtonShown() {
        return backToHomeButton.isDisplayed();
    }
}