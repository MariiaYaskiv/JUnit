import org.openqa.selenium.By;

public class CodePage {
    private By codeTab = By.xpath("//a[@id='code-tab']");
    private By mainBranchLocator = By.className("css-truncate-target");
    private By verifyTags = By.xpath("//span[@class=\"color-fg-muted\"][contains(text(), \"tags\")]");
    private By goToFiles = By.xpath("//a[@class=\"btn ml-2 d-none d-md-block\"]");
    private By addFile = By.xpath("//span[@class=\"d-none d-md-flex flex-items-center\"]");
    private By codeToClone = By.cssSelector("summary[class='Button--primary Button--medium Button flex-1 d-inline-flex']");
    private By cloneHttp = By.cssSelector("[value*='REDTvOD5b7QKeNVL']");
    private By cloneSsh = By.cssSelector("[value*='XiJ2xGxm8KnELKh8rx7QLhDjl8Vw']");
    private By cloneGithubCli = By.cssSelector("[value*='ZqH8lBdRijGyzyj6fVTTbn']");
    private By copyToTheRepository = By.cssSelector("[class$='ClipboardButton js-clone-url-http']");
    private By openWithGithubDesctop = By.cssSelector("a[data-action=\"click:get-repo#showDownloadMessage\"]");
}
