import Base.BaseTest;
import Pages.BuyingAppleMacBookPro13inchPage;
import Pages.NoteBooksPage;
import Pages.ShoppingCartPage;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseTest {
    NoteBooksPage noteBooksPage;
    BuyingAppleMacBookPro13inchPage buy;
    ShoppingCartPage shoppingCartPage;

    @Test()
    public void buyingAppleMacBookTest() {
        noteBooksPage = homePage.selectNoteBooks
                ("computers", "notebooks");
        buy = noteBooksPage.clickOnAppleMacBookPro13Inch();
        soft.assertEquals(buy.assertProductTitle(), "Notebooks");
        buy.clickToAddToCartButton();
        shoppingCartPage = buy.clickOnShoppingCartIcon();
        String productName = shoppingCartPage.assertProductName();
        int itemNumber = shoppingCartPage.assertNumberOfItems();
        soft.assertEquals(itemNumber, 1);
        soft.assertEquals(productName, "Apple MacBook Pro 13 inch");
        shoppingCartPage.clickTermsCheckBox();

    }

}
