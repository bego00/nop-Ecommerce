package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomePage extends BasePage {

    private By registerIcon = By.xpath("//ul/li/a[@class='ico-register']");
    private By loginicon = By.xpath("//div//a[@class='ico-login']");
    private By logOutElement = By.xpath("//a[@href=\"/logout\"]");

    private By AnchorElementForProducts = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]//div[@class=\"title\"]");
    private By currencyElement = By.xpath("//span[@class=\"price actual-price\"]");

    private By searchBoxField = By.xpath("//input[@id=\"small-searchterms\"]");
    private By searchButton = By.xpath("//button[@class=\"button-1 search-box-button\"]");
    private By appleMacBookItem = By.xpath("//div[@data-productid=\"4\"]//a[@title=\"Show details for Apple MacBook Pro 13-inch\"]");
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public Register clickRegisterIcon() {
        clickElement(registerIcon);
        return new Register(driver);
    }

    public Login clickLoginIcon() {
        clickElement(loginicon);
        return new Login(driver);
    }

    public WebElement get_cur_list() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public void changeCurrency(String currency) {
        Select curr = new Select(get_cur_list());
        curr.selectByVisibleText(currency);
    }

    public String checkCurrency() {
        String output = "";
        List<WebElement> currencies = driver.findElements(currencyElement);
        for (WebElement webElement : currencies) {
            output = webElement.getText();
            System.out.println(output);
        }
        return output;
    }

    public void enterKeywordInSearchBox(String Keyword) {
        WaitUntilVisibleElement(searchBoxField);
        WebElement searchbox = driver.findElement(searchBoxField);
        searchbox.sendKeys(Keyword, Keys.ENTER);
    }

    public SearchByProductNamePage clickOnMacItem() {
        WaitUntilVisibleElement(appleMacBookItem);
        clickElement(appleMacBookItem);
        return new SearchByProductNamePage(driver);
    }

    public WebElement selectElement(String elementName) {
        WebElement menuElement = driver.findElement
                (By.xpath("//ul[@class=\"top-menu notmobile\"]//li//a[@href=\"/" + elementName + "\"]"));
        return menuElement;
    }

    public NoteBooksPage selectNoteBooks(String MenuElementName, String SubElementName) {
        actions.moveToElement(selectElement(MenuElementName)).perform();
        actions.moveToElement(selectElement(SubElementName)).click().perform();
        return new NoteBooksPage(driver);
    }

    public AlertPage clickSearchButton() {
       clickElement(searchButton);
       return new AlertPage(driver);
    }
}