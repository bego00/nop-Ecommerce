import Base.BaseTest;
import Pages.AlertPage;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

public class AlertHandlingTest extends BaseTest {
    AlertPage alertPage;
    @Test
    public void alertHandlingTest() {
        alertPage = homePage.clickSearchButton();
        alertPage.acceptAlert();
    }
}
