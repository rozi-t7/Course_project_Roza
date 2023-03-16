package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProblemUserProductsPage {
    protected WebDriver driver;

    @FindBy(xpath = "//*[text()='Sauce Labs Onesie']")
    private WebElement onesie;

    public ProblemUserProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginWithProblemUser(String userName1, String passWord1) {
        WebElement username = driver.findElement(By.id("user-name"));
        username.click();
        username.sendKeys(userName1);

        WebElement password = driver.findElement(By.id("password"));
        password.click();
        password.sendKeys(passWord1);

        WebElement loginButton = driver.findElement(By.cssSelector("[value=Login]"));
        loginButton.click();
    }

    public void navigateToProduct() {
        WebElement link = driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']"));
        link.click();
    }
        public boolean isCorrectPageOpened () {
            return Boolean.parseBoolean(onesie.getText());
        }
    }