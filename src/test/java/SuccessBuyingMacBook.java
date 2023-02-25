import Base.BaseTest;
import Pages.CheckOutPage;
import Pages.ShoppingCartPage;
import org.testng.annotations.Test;

public class SuccessBuyingMacBook extends BaseTest {
    CheckOutPage checkOutPage;
    ShoppingCartPage shoppingCartPage;

    @Test
    public void successBuyingMacBook() {
        checkOutPage = shoppingCartPage.clickCheckOutButton();
        String successMessage = checkOutPage.checkOut();
        soft.assertEquals(successMessage, "Your order has been successfully processed!");
    }
}
