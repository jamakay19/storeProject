package StepDefinitions;

import Pages.APHomepage;
import Pages.SignInPage;
import Pages.SignOutPage;
import Utils.BrowserUtils;
import Utils.ConfigurationReader;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class StoreProjectSteps {
    WebDriver driver = Driver.getDriver();
    APHomepage page = new APHomepage();
    SignInPage registrationPage = new SignInPage();
    SignOutPage signOut = new SignOutPage();

    @Given("the user navigate to the automation practice website")
    public void the_user_navigate_to_the_automation_practice_website() {
        driver.navigate().to(ConfigurationReader.getProperty("url"));
    }

    @Then("the user clicking sign in button")
    public void the_user_clicking_sign_in_button() {
        page.signInButton.click();
    }

    @Then("the user enters email in email address window")
    public void the_user_enters_email_in_email_address_window(Map<String, String> email) {
        page.emailBox.sendKeys(email.get("email"));
    }

    @Then("the user clicks on create an account button")
    public void the_user_clicks_on_create_an_account_button() {
        page.submitButton.click();
    }

    @Then("the user create a new account entering following information")
    public void the_user_create_a_new_account_entering_following_information(Map<String, String> info) {
        registrationPage.femaleButton.click();
        registrationPage.firstName.sendKeys(info.get("firstName"));
        registrationPage.lastName.sendKeys(info.get("lastName"));
        registrationPage.password.sendKeys(info.get("password"));
        registrationPage.AddressAddress.sendKeys(info.get("address"));
        registrationPage.city.sendKeys(info.get("city"));

        Select selectState = new Select(registrationPage.state);
        selectState.selectByVisibleText(info.get("state"));
        BrowserUtils.waitForSec(2);
        registrationPage.zip.sendKeys(info.get("zip"));
        registrationPage.mobilePhone.sendKeys(info.get("mobileNumber"));
    }
    @Then("the user click register button and validate account created")
    public void the_user_click_register_button_and_validate_account_created(Map<String, String> validation) {
       registrationPage.registerButton.click();
       String actual = signOut.validation.getText();
       String expected = validation.get("validation");
       Assert.assertEquals(actual, expected);
    }

    @Given("the user click sign out button")
    public void the_user_click_sign_out_button() {
        signOut.signOutButton.click();
    }

    @Then("the user provide email and password")
    public void the_user_provide_email_and_password(Map<String, String> data) {
        signOut.emailAddress.sendKeys(data.get("email1"));
        signOut.password.sendKeys(data.get("password1"));
    }
    @Then("the user click signing in button and validating signing in")
    public void the_user_click_signing_in_button_and_validating_signing_in(Map<String, String> validation) {
        signOut.signInButton.click();
        String actual = signOut.validation.getText();
        String expected = validation.get("validate");
        Assert.assertEquals(actual,expected);}

    @Given("the user click Sign Out button")
        public void the_user_click_Sign_Out_button() {
        signOut.signOutButton.click();
        }

        @Then("the user provide Email and Password")
        public void the_user_provide_Email_and_Password(Map<String, String> data) {
            signOut.emailAddress.sendKeys(data.get("email2"));
            signOut.password.sendKeys(data.get("password2"));
        }

    @Then("the user click signing in button and validate")
    public void the_user_click_signing_in_button_and_validate(Map<String, String> validation) {
        signOut.signInButton.click();
        String actual = signOut.failedMessage.getText();
        String expected = validation.get("validate");
        Assert.assertEquals(actual, expected);
    }


}
