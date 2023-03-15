package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CartContentPage {
    protected WebDriver driver;

    @FindBy(id = "cart_contents_container")
    private WebElement cartContent;

    @FindBy(id = "item_2_title_link")
    private WebElement item2;

    @FindBy(id = "item_4_title_link")
    private WebElement item4;

    public CartContentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
