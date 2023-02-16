package Pages;

import org.openqa.selenium.*;

public class Login extends BasePage {
    private By emailFiled = By.xpath("(//input[@id='Email'])[1]");
    private By passwordField = By.xpath("//div[@class='inputs']//input[@id='Password']");
    private By loginButton = By.xpath("(//div[@class='buttons']//button[@class='button-1 login-button'])");
    private By logOutElement = By.xpath("//a[@href=\"/logout\"]");

    public Login(WebDriver driver) {
        super(driver);
    }


    public void enterAccountData(String mail, String password) {
        driver.findElement(emailFiled).sendKeys(mail);
        WebElement passwordElement = driver.findElement(passwordField);
        passwordElement.sendKeys(password);
        passwordElement.sendKeys(Keys.ENTER);
    }
    public String assertUrl() {
        WaitUntilVisibleElement(logOutElement);
        return driver.getCurrentUrl();
    }

    public void logOut() {
        WaitUntilVisibleElement(logOutElement);
        clickElement(logOutElement);
    }
}