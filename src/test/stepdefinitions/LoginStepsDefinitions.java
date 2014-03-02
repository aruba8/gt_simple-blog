package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStepsDefinitions extends BasicDefinition {
    String user;
    LoginPage loginPage = new LoginPage(driver);


    @Given("^I am an? (.*)$")
    public void I_am_a_asd(String user) throws Throwable {
        this.user = user;
    }

    @When("^I login$")
    public void I_login() throws Throwable {
        driver.get("http://localhost:8080/login");
        loginPage.login(user, user);
    }

    @Then("^I should be redirected to add post page$")
    public void I_should_be_redirected_to_add_post_page() throws Throwable {
        Assert.assertEquals(driver.getCurrentUrl(), "http://localhost:8080/addpost");
    }

    @After
    public void tierDown(){
        driver.quit();
    }

}
