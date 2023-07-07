import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IssueTest extends BaseTest {
    @Test
    public void checkLoginIsSuccessful() {
        HomePage home = new HomePage(driver);
        home.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.getLogoOnTheMainPage();
        Assertions.assertTrue(mainPage.getLogoOnTheMainPage().isDisplayed());
        mainPage.goToPersonalLogo().click();
        mainPage.getYourRepositories().click();
        RepositoriesPage repositoriesPage = new RepositoriesPage(driver);
        repositoriesPage.getRepository().click();
        IssuesPage issuesPage = new IssuesPage(driver);
        issuesPage.getIssuesTab().click();
        issuesPage.getOpenIssue().click();
        issuesPage.typeIssue("Issue", "SomeBody in issue");
        issuesPage.getEditTextButton().click();
        issuesPage.typeTextToUpdateIssue("New Text", "Some comment");
        issuesPage.getIssuesTab().click();
        issuesPage.getCloseIssue().click();
    }
}
