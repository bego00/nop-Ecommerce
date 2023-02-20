package Registration;

import Base.BaseTest;
import DataProvider.DataProviderRegistration;
import Pages.Register;
import Pages.SuccessMessagePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationSuccessfulTest extends BaseTest {
    private Register register;
    SuccessMessagePage sm;

    @Test(dataProviderClass = DataProviderRegistration.class, dataProvider = "registerData")

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

        sm = register.clickRegisterButton();
        String actual_Message = sm.checkSuccessMessage();
        Assert.assertEquals(actual_Message, "Your registration completed");


    }
}
