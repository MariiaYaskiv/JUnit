import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void checkLogoOnTheLoginPage() {
        HomePage homePage = new HomePage(driver);
        assertTrue(homePage.goToLoginPage().getLogo().isDisplayed(), "Logo is not displayed");
    }

    @Test
    public void checkLoginIsSuccessful() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        Assertions.assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
    }

    @Test
    public void checkFailedLogin() {
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginFailed("1test9874@ukr.net", "test9874@ukr.net");
        loginPage.validateErrorMessage("Incorrect username or password.");
    }

    @Test
    public void checkRepositoriesList() {
        List<String> expReposList = new ArrayList<>();
        expReposList.add("test2");
        expReposList.add("test1");
        expReposList.add("test");

        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm().goToRepositoriesPage();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        Assertions.assertEquals(expReposList, repositoriesPage.getRepositories());
    }
}
