package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchByProductNamePage extends BasePage {
    public SearchByProductNamePage(WebDriver driver) {
        super(driver);
    }


    private By producTitle = By.xpath("//div[@class=\"product-name\"]/h1");
    private By wishlistIcon = By.xpath("//button[@id='add-to-wishlist-button-4']");

    private By successAddToWishList = By.xpath("//div[@id='bar-notification']//p");
    private By close = By.xpath("//div[@id=\"bar-notification\"]//child::span");
    private By successAddToCart = By.xpath("//div[@id=\"bar-notification\"]//child::p");

    public String assertHeader() {
        WaitUntilVisibleElement(producTitle);
        return driver.findElement(producTitle).getText();
    }

    public void clickWishlistIcon() {
        WaitUntilVisibleElement(wishlistIcon);
        scrollTillVisible(wishlistIcon);
        clickElement(wishlistIcon);
    }

    public String assertItemAddedToWishList() {
        WaitUntilVisibleElement(successAddToWishList);
        String wishListSuccessMessage = driver.findElement(successAddToWishList).getText();
        clickCloseNotification();
        return wishListSuccessMessage;
    }

    public void clickAddToCartButton() {
       clickAddToCartButtonMethod();
    }

    public String assertItemAddedToCart() {
        WaitUntilVisibleElement(successAddToCart);
        String cartSuccessMessage = driver.findElement(successAddToCart).getText();
        clickCloseNotification();
        return cartSuccessMessage;
    }

}
