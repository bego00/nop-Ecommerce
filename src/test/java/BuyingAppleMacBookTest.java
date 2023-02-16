import Base.BaseTest;
import Pages.BuyingAppleMacBookPro13inch;
import Pages.Login;
import Pages.NoteBooksPage;
import Pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuyingAppleMacBookTest extends BaseTest {
    NoteBooksPage noteBooksPage;
    BuyingAppleMacBookPro13inch buyingAppleMacBookPro13inch;
    ShoppingCartPage shoppingCartPage;
    Login login;

    @Test()
    public void buyingAppleMacBookTest() {
        noteBooksPage = homePage.selectNoteBooks
                ("computers", "notebooks");
        buyingAppleMacBookPro13inch = noteBooksPage.clickOnAppleMacBookPro13Inch();
        buyingAppleMacBookPro13inch.setScrollDownToAddToCartButton();
        buyingAppleMacBookPro13inch.clickToAddToCartButton();
        buyingAppleMacBookPro13inch.setScrollUpToShoppingCart();
        shoppingCartPage = buyingAppleMacBookPro13inch.clickOnShoppingCartIcon();

        String productName = shoppingCartPage.assertProductName();
        int NumberOfItemsOnShoppingCart = shoppingCartPage.assertNumberOfItems();
        Assert.assertEquals(productName, "Apple MacBook Pro 13-inch");
        Assert.assertEquals(NumberOfItemsOnShoppingCart, 1);
        shoppingCartPage.clickTermsCheckBox();
        shoppingCartPage.clickCheckOutButton();
//        login = homePage.clickLoginIcon();
//        login.enterAccountData("test11@gmail.com", "test123");
    }

}
