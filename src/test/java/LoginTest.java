import Base.BaseTest;
import ExcelDataProvider.ExcelDataProvider;
import Pages.Login;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Login login;

    @Test(dataProviderClass = ExcelDataProvider.class, dataProvider = "TEST1_Sheet1")
    public void loginTest(String Email, String Password) {
/*
        String Email = String.valueOf(excel_data.getCellByColumnNameAndRowNum("mail",1));
        String Password = String.valueOf(excel_data.getCellByColumnNameAndRowNum("password",1));
*/
        login = homePage.clickLoginIcon();
        login.enterAccountData(Email, Password);
        String Actual = login.assertUrl();
        String Expected = "https://demo.nopcommerce.com/";
        soft.assertEquals(Actual, Expected);
        //login.logOut();

    }
}
