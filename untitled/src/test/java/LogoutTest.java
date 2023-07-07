import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void checkLogOutFromGitHub() {
        String expectedQuestionText = "Are you sure you want to sign out?";
        HomePage homePage = new HomePage(driver);
        homePage.goToLoginPage().loginSuccessful("mari444ka1991@gmail.com", "More2023");
        MainPage mainPage = new MainPage(driver);
        mainPage.goToProfileForm();
        ProfileForm profileForm = new ProfileForm(driver);
        Assertions.assertEquals(expectedQuestionText, profileForm.signOutFromGitHub().getQuestionElement().getText());
    }
}
