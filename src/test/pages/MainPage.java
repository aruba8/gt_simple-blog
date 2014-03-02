package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public final String articleTittlesXpath = "//div[@id='content']/h3";

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindAll(@FindBy(xpath = articleTittlesXpath))
    private List<WebElement> articleTittles;

    public List getArticleTittles() {
        return articleTittles;
    }
}
