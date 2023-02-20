import Base.BaseTest;
import DataProvider.DataProviderLogin;
import ExcelDataProvider.Excel_Data;
import Pages.Login;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    Login login;
    Excel_Data excel_data = new Excel_Data("./Excel/DATA_TEST.xlsx","Sheet1");
    @Test()
    public void loginTest() {
        String Email = String.valueOf(excel_data.getCellByColumnNameAndRowNum("mail",1));
        String Passwords = String.valueOf(excel_data.getCellByColumnNameAndRowNum("password",1));
        login = homePage.clickLoginIcon();
        login.enterAccountData(Email, Passwords);
        String Actual = login.assertUrl();
        String Expected = "https://demo.nopcommerce.com/";
        soft.assertEquals(Actual, Expected);
        //login.logOut();

    }
}
