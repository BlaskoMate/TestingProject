package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import util.PageUrlCollection;
import util.WebDriverManager;

import java.util.List;

public class IndexPage {
    private final WebDriver driver;
    public static final int USERNAME_COLUMN_INDEX = 1;
    public static final int PASSWORD_COLUMN_INDEX = 2;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 3), this);
    }

    @FindBy(xpath = "//input[@id='login-form-username']")
    WebElement usernameInputField;

    @FindBy(xpath = "//input[@id='login-form-password']")
    WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='aui-message aui-message-error']/p")
    WebElement wrongCredentials;

    @FindBy(xpath = "//a[@id='header-details-user-fullname']")
    WebElement userIcon;

    @FindBy(xpath = "//a[@id='log_out']")
    WebElement logoutButton;

    @FindBy(xpath = "//a[@class='aui-nav-link login-link']")
    WebElement headerLoginButton;

    @FindBy(xpath = "//p[@class='title']/strong")
    WebElement logoutNotification;

    @FindBy(xpath = "//a[@id='create_link']")
    WebElement createButton;

    @FindBy(xpath = "//input[@id='project-field']")
    WebElement projectInputField;

    @FindBy(xpath = "//input[@id='issuetype-field']")
    WebElement issueTypeField;

    @FindBy(xpath = "//input[@id='create-issue-submit']")
    WebElement createIssueCreateButton;

    @FindBy(xpath = "//a[@class='issue-created-key issue-link']")
    WebElement createIssuePopUp;

    @FindBy(xpath = "//input[@id='summary']")
    WebElement summaryInputField;

    @FindBy(xpath = "//button[@class='aui-button aui-button-link cancel']")
    WebElement cancelButton;


    public boolean isHeaderLoginButtonVisible() {
        return headerLoginButton.isDisplayed();
    }



    public void attemptLogin(List<String> loginCredentials){
//        WebDriverManager.waitUntilVisible(driver, usernameInputField);
//        setUsernameInputField(loginCredentials.get(USERNAME_COLUMN_INDEX));
//        WebDriverManager.waitUntilVisible(driver, passwordInputField);
//        setPasswordInputField(loginCredentials.get(PASSWORD_COLUMN_INDEX));
//        WebDriverManager.waitUntilVisible(driver, loginButton);
//        clickLoginButton();
    }

    public void successfulLogin(List<String> loginCredentials){
        attemptLogin(loginCredentials);
        WebDriverManager.waitUntilVisible(driver, userIcon);
    }

    public void logout(){

    }
}
