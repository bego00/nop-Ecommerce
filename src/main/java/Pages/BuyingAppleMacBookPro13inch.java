package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyingAppleMacBookPro13inch extends BasePage {


    public BuyingAppleMacBookPro13inch(WebDriver driver) {
        super(driver);
    }

    By shoppingElement = By.xpath("//span[text()='Shopping cart']");
    By anchorElement = By.xpath("//div[@class=\"product-name\"]//h1");
    By titleElement = By.xpath("//h1[text()='Notebooks']");
    public String assertProductTitle() {
       return getText(titleElement);
    }

    public void clickToAddToCartButton() {
        scrollTillVisible(anchorElement);
        clickAddToCartButtonMethod();
        clickCloseNotification();
    }

    public ShoppingCartPage clickOnShoppingCartIcon() {
        scrollToTopPage();
        WaitTillVisibleAndClick(shoppingElement);
        return new ShoppingCartPage(driver);
    }

}

