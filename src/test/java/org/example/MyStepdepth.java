package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdepth {


    Homepage homepage = new Homepage();
    RegistrationPage registrationPage= new RegistrationPage();
    RegistrationSuccessive registrationSuccessive = new RegistrationSuccessive();

    //As  a user I should be able to register successfully.
    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        // Write code here that turns the phrase above into concrete actions
       homepage.clickOnRegisterButton();
    }

    @When("I entered registration details")
    public void i_entered_registration_details() {
        // Write code here that turns the phrase above into concrete actions
      registrationPage.UserShouldBeAbleTORegisterSuccessfully();
    }

    @Then("I should be able to registered successfully")
    public void i_should_be_able_to_registered_successfully() {
        // Write code here that turns the phrase above into concrete actions
       registrationSuccessive.verifyUserRegisteredSuccessfully();
    }

    //User should be able to navigate to desired category page successfully from top header menu
    @Given("I am on homepage")
    public void i_am_on_homepage() {

    }

    @When("I click on {string} from top menu header")
    public void i_click_on_from_top_menu_header(String category_name) {
        // Write code here that turns the phrase above into concrete actions
        homepage.clickOnCategoryLink(category_name);
    }

    @Then("I should able to successfully navigated to related {string} category page successfully")
    public void i_should_able_to_successfully_navigated_to_related_category_page_successfully(String category_url ) {
        // Write code here that turns the phrase above into concrete actions
        Utils.verifyCurrentUrl(category_url);
    }


}

