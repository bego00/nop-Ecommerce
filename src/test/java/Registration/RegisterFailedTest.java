package Registration;

import Base.BaseTest;
import DataProvider.DataProviderRegistration;
import Pages.Register;
import Pages.SuccessMessagePage;
import org.testng.annotations.Test;

public class RegisterFailedTest extends BaseTest {
    private Register register;


    @Test(dataProviderClass = DataProviderRegistration.class,dataProvider = "registerData")
    public void registerTest(String FName, String SName,
                             String EMail, String com_name,
                             String pass1, String confPass) {
        register = homePage.clickRegisterIcon();
        register.gender_btn();
        register.first_name(FName);
        register.second_name(SName);
        register.dropdown_date();
        register.Enter_Email(EMail);
        register.enterCompanyName(com_name);
        register.press_Check_Box();
        register.enterPassword(pass1, confPass);
        register.clickRegisterButton();
        String AcutalMessage = "The specified email already exists";
        soft.assertEquals(register.failedMessage(),AcutalMessage,"Registration Process Done");
    }

}
