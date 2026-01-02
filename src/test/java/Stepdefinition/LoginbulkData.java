package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pojo.POJOLogin;
import org.sel.BaseClass;
import org.testng.Assert;

public class LoginbulkData extends BaseClass {
    POJOLogin dd;


    @Given("user launch the browser and hit the url")
    public void user_launch_the_browser_and_hit_the_url() {
        browserLaunch();
        launchUrl("https://adactinhotelapp.com/");
        implicitlywait(10);
        dd = new POJOLogin();
    }

    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        passvalue(dd.getAdtUsername(), username);
        passvalue(dd.getAdtPassword(), password);

    }

    @When("user clicks the login button")
    public void user_clicks_the_login_button() {
        click(dd.getAdtLoginBtn());
    }

    @Then("verify the user logged in the application successfully")
    public void verify_the_user_logged_in_the_application_successfully() {

        Assert.assertTrue(getDriver().getCurrentUrl().contains("SearchHotel.php"));
    }


}
