package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    private final String usernameInputXpath = "//input[@name='username']";
    private final String passwordInputXpath = "//input[@name='password']";
    private final String submitButtonXpath = "//button[@type='submit']";

    @FindBy(xpath = submitButtonXpath)
    private WebElement submitButton;

    @FindBy(xpath = usernameInputXpath)
    private WebElement usernameInput;

    @FindBy(xpath = passwordInputXpath)
    private WebElement passwordInput;

    public WebElement getUsernameInput() {
        return usernameInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public void login(String username, String password){
        getUsernameInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getSubmitButton().click();
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }
}
