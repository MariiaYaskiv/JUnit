import org.openqa.selenium.By;

public class ActionsGithubPage {
    private By actionsTab = By.xpath("//a[@id='actions-tab']");
    private By mainTextOnThePageActions = By.xpath("//h1[@class=\"mb-2 lh-condensed\"]");
    private By configureAndroidCI = By.xpath("//h4[contains(text(),'Android CI')]");
    private By deploymentText = By.xpath("//h2[contains(text(),'Deployment')]");
    private By buttonRequest = By.xpath("//a[@class=\"btn mr-2 btn-block\"]");
    private By configurePages = By.xpath("//h2[contains(text(),'Pages')]");

}
