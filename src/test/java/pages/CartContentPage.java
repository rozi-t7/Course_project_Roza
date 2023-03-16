package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartContentPage {
    protected WebDriver driver;

    @FindBy (id = "item_4_title_link")
    private WebElement item4;

    @FindBy (id = "item_2_title_link")
    private WebElement item2;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartContentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
       public CheckoutInformationPage goToCheckoutPage() {
        checkoutButton.click();
        return new CheckoutInformationPage(driver);
    }
    public boolean isItemBackpackShown(){
        return item2.isDisplayed();
    }
    public boolean isItemOnesieShown(){
        return item4.isDisplayed();
    }
}
