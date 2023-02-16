package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Alert;
public class AlertPage extends BasePage{
    Alert alert = driver.switchTo().alert();
    public AlertPage(WebDriver driver) {
        super(driver);
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getTitle(){
       return alert.getText();
    }
}
