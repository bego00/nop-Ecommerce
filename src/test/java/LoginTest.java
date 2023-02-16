import Base.BaseTest;
import DataProvider.DataProviderLogin;
import Pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Login login;

    @Test(dataProviderClass = DataProviderLogin.class, dataProvider = "loginData")
    public void loginTest(String email, String password) {
        login = homePage.clickLoginIcon();
        login.enterAccountData(email, password);
        String Actual = login.assertUrl();
        String Expected = "https://demo.nopcommerce.com/";
        soft.assertEquals(Actual, Expected);
        login.logOut();

    }
}
