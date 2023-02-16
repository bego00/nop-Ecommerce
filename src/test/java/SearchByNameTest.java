import Base.BaseTest;
import Pages.SearchByProductNamePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchByNameTest extends BaseTest {
    SearchByProductNamePage searchByProductName;


    @Parameters("productName")
    @Test
    public void validateHeaderItem(String productName) {
        homePage.enterKeywordInSearchBox(productName);
        searchByProductName = homePage.clickOnMacItem();
        String header = searchByProductName.assertHeader();
        soft.assertTrue(header.contains(productName), "Header don't contain Searched Keyword");
    }
    @Parameters("productName")
    @Test()
    public void validateItemAddedToWishList(String productName) {
        homePage.enterKeywordInSearchBox(productName);
        searchByProductName = homePage.clickOnMacItem();
        searchByProductName.clickWishlistIcon();
        String wishListSuccessMessage = searchByProductName.assertItemAddedToWishList();
        soft.assertEquals(wishListSuccessMessage, "The product has been added to your wishlist");

    }
    @Parameters("productName")
    @Test
    public void validateItemAddedToCart(String productName) {
        homePage.enterKeywordInSearchBox(productName);
        searchByProductName = homePage.clickOnMacItem();
        searchByProductName.clickAddToCartButton();
        String cartSuccessMessage = searchByProductName.assertItemAddedToCart();
        soft.assertEquals(cartSuccessMessage, "The product has been added to your shopping cart");

    }
}
