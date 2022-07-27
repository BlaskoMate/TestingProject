package steps.loginsteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.SetupTestWithLogin;

public class LoginSteps extends SetupTestWithLogin {


    @Before
    public void setup(){
        setChromeDriver();
    }

    @Given("login")
    public void login() {
        super.login();
    }

    @After
    public void tearDown(){
        super.logout();
        quitChromeDriver();
    }

    @Given("^open page$")
    public void openXPage(String url){
        System.out.println(url);
    }

    @Given("^user is on (.*) page$")
    public void user_is_on_x_page(int num) {
        System.out.println(num);
    }

    @Given("^user is on num$")
    public void user_is_on_num(int num) {
        System.out.println(num);
    }

    @When("user enters username and password")
    public void user_enters_username_and_password() {
        System.out.println(2);
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println(3);
    }

    @Then("^user is navigated to (.*) a$")
    public void user_is_navigated_to_asd(String str) {
        System.out.println(str);
    }

    @Then("user is checked for being logged in")
    public void user_is_checked_for_being_logged_in() {
        System.out.println(5);
    }

}
