package Pages;

import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage{
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
