import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    private By imgLocator = By.xpath("//img[@class='avatar circle'][1]");
    private By buttonPersonalLogo = By.cssSelector("button[class*='AppHeader-logo Button--invisible']");
    private By yourRepositories = By.xpath("//span[contains(text(),'Your repositories')]");

    public WebElement getLogoForMenu() {
        return driver.findElement(buttonPersonalLogo);
    }

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLogoOnTheMainPage() {
        return driver.findElement(imgLocator);
    }

    public ProfileForm goToProfileForm() {
        Assertions.assertTrue(driver.findElement(imgLocator).isDisplayed());
        driver.findElement(imgLocator).click();
        return new ProfileForm(driver);
    }

    public WebElement goToPersonalLogo() {
        return driver.findElement(buttonPersonalLogo);
    }

    public WebElement getYourRepositories() {
        return driver.findElement(yourRepositories);
    }
}