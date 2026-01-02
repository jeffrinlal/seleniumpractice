package Stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pojo.POJOAdactin;
import org.sel.BaseClass;

public class AdcRegistrationSteps extends BaseClass {

    POJOAdactin adc;

    @Given("the user login to reistration page")
    public void the_user_login_to_reistration_page() {
        browserLaunch();
        launchUrl("https://adactinhotelapp.com/Register.php");

    }

    @When("the user enters the {string} and {string} and {string} and {string} and {string}")
    public void the_user_enters_the_and_and_and_and(String username, String password, String confirmpassword, String fname, String email) {
        adc = new POJOAdactin();
        passvalue(adc.getadcUsername(), username);
        passvalue(adc.getadcPassword(), password);
        passvalue(adc.getadcConfirmPassword(), confirmpassword);
        passvalue(adc.getadcFullName(), fname);
        passvalue(adc.getadcEmail(), email);
    }

    @When("user click the checkbox and submit the register button")
    public void user_click_the_checkbox_and_submit_the_register_button() {
        click(adc.getadcRegisterBtn());
    }

    @Then("validate the user successfully created the account")
    public void validate_the_user_successfully_created_the_account() {

    }


}
