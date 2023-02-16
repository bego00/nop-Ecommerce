import Base.BaseTest;
import Pages.AlertPage;
import net.bytebuddy.implementation.auxiliary.MethodCallProxy;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertHandlingTest extends BaseTest {
    AlertPage alertPage;
    @Test
    public void alertHandlingTest() {
        alertPage = homePage.clickSearchButton();
        String alertMessage = alertPage.getTitle();
        Assert.assertEquals(alertMessage,"Please enter some search keyword");
        alertPage.acceptAlert();
    }
}
