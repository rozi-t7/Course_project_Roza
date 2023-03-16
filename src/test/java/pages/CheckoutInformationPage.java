package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {
    protected WebDriver driver;

    @FindBy(id = "first-name")
    private WebElement firstNameInput;

    @FindBy(id = "last-name")
    private WebElement lastNameInput;

    @FindBy(id = "postal-code")
    private WebElement zipCodeInput;

    @FindBy(xpath = "//input[@value='Continue']")
    private WebElement continueButton;

    public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public CheckoutInformationPage addInfo(String name, String lastName, String zip) {
        firstNameInput.click();
        firstNameInput.sendKeys(name);

        lastNameInput.click();
        lastNameInput.sendKeys(lastName);

        zipCodeInput.click();
        zipCodeInput.sendKeys(zip);

        continueButton.click();

        return new CheckoutInformationPage(driver);
    }

    public boolean isContinueButtonShown() {
        return continueButton.isDisplayed();
    }
}
