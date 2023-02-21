import Base.BaseTest;
import Pages.BuyingAppleMacBookPro13inch;
import Pages.NoteBooksPage;
import org.testng.annotations.Test;

public class BuyingAppleMacBookTest extends BaseTest {
    NoteBooksPage noteBooksPage;
    BuyingAppleMacBookPro13inch buy;


    @Test()
    public void buyingAppleMacBookTest() {
        noteBooksPage = homePage.selectNoteBooks
                ("computers", "notebooks");
        buy = noteBooksPage.clickOnAppleMacBookPro13Inch();
        soft.assertEquals(buy.assertProductTitle(),"Notebooks");
        buy.clickToAddToCartButton();
    }

}
