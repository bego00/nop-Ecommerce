package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessMessagePage extends BasePage{

    private By successMessage = By.xpath("//div[@class='page-body']//div[@class='result']");

    public SuccessMessagePage(WebDriver driver) {
        super(driver);
    }

    public String checkSuccessMessage() {
        WaitUntilVisibleElement(successMessage);
        return driver.findElement(successMessage).getText();
    }
}
