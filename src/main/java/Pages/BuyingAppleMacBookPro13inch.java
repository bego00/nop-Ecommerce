package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyingAppleMacBookPro13inch extends BasePage {


    public BuyingAppleMacBookPro13inch(WebDriver driver) {
        super(driver);
    }

    WebElement scroll = driver.findElement(By.cssSelector("body"));
    By shoppingElement = By.xpath("//span[text()='Shopping cart']");

    public void setScrollDownToAddToCartButton() {
        scroll.sendKeys(Keys.ARROW_DOWN);
        scroll.sendKeys(Keys.ARROW_DOWN);
    }
    public void clickToAddToCartButton() {
        clickAddToCartButtonMethod();
        clickCloseNotification();
    }
    public void setScrollUpToShoppingCart() {
        scroll.sendKeys(Keys.ARROW_UP);
        scroll.sendKeys(Keys.ARROW_UP);
    }

    public ShoppingCartPage clickOnShoppingCartIcon() {
        clickElement(shoppingElement);
        return new ShoppingCartPage(driver);
    }

}

