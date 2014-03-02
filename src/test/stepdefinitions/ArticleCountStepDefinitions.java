package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.MainPage;

public class ArticleCountStepDefinitions extends BasicDefinition{
    MainPage mainPage = new MainPage(driver);


    @Given("I am on start page")
    public void goToStartPage() {
        driver.get("http:localhost:8080");
    }

    @Then("^I should see (\\d+) previews$")
    public void I_should_see(int arg1) throws Throwable {
        Assert.assertEquals(mainPage.getArticleTittles().size(), arg1);
    }

    @After
    public void tierDown(){
        driver.quit();
    }


}
