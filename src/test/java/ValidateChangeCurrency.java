import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ValidateChangeCurrency extends BaseTest {
    @Parameters({"Currency","logo"})
    @Test
    public void checkValidCurr(String Currency,String logo){
        homePage.changeCurrency(Currency);
        String curr = homePage.checkCurrency();
        Assert.assertTrue(curr.contains(logo));
    }
}
