package StepDefinitions;

import Pages.APHomepage;
import Pages.SignInPage;
import Utils.BrowserUtils;
import Utils.ConfigurationReader;
import Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class GroupProjectSteps {

    WebDriver driver= Driver.getDriver();
    String savedEmail="";
    APHomepage apHomePage = new APHomepage();
    SignInPage singInPage=new SignInPage();

    @Given("the user navigate to automation practice web page")
    public void the_user_navigate_to_automation_practice_web_page() {
        driver.get(ConfigurationReader.getProperty("url"));
    }
    @When("the user click sign in button")
    public void the_user_click_sign_in_button() {
        apHomePage.signInButton.click();
    }
    @Then("the user enter valid email address")
    public void the_user_enter_valid_email_address() {
        BrowserUtils.waitForSec(2);
        String email=apHomePage.getEmail(8);
        savedEmail=email;
        System.out.println(email);
        apHomePage.emailBox.sendKeys(email);
    }
    @Then("the user click create account button")
    public void the_user_click_create_account_button() {
        apHomePage.submitButton.click();
    }
    @Then("the user click male button")
    public void the_user_click_male_button() {
        singInPage.maleButton.click();
    }
    @Then("The user enter personal information")
    public void the_user_enter_personal_information(Map<String,String> data) {
        singInPage.firstName.sendKeys(data.get("name"));
        singInPage.lastName.sendKeys(data.get("lastName"));
        singInPage.password.sendKeys(data.get("password"));
//        singInPage.day.click();
//
//        singInPage.day.sendKeys(data.get("day")+ Keys.ENTER);
//        singInPage.month.click();
//        BrowserUtils.waitForSec(1);
//        singInPage.month.sendKeys(data.get("month")+Keys.ENTER);
//        singInPage.year.click();
//        BrowserUtils.waitForSec(1);
//        singInPage.year.sendKeys(data.get("year")+Keys.ENTER);

        Select selectDay=new Select(singInPage.selectDay);
        Select selectMonth=new Select(singInPage.selectMonth);
        Select selectYear=new Select(singInPage.selectYear);
        BrowserUtils.waitForSec(2);
        selectDay.selectByValue(data.get("day"));
        BrowserUtils.waitForSec(2);
        selectMonth.selectByValue(data.get("month"));
        BrowserUtils.waitForSec(2);
        selectYear.selectByValue(data.get("year"));

    }
    @Then("the user add address information")
    public void the_user_add_address_information(Map<String,String> addressInfo) {
        singInPage.AddressFirstName.sendKeys(addressInfo.get("addressName"));
        singInPage.AddressLastName.sendKeys(addressInfo.get("addressLastName"));
        singInPage.AddressAddress.sendKeys(addressInfo.get("address"));
        singInPage.city.sendKeys(addressInfo.get("city"));
        singInPage.state.sendKeys(addressInfo.get("state"));
        singInPage.zip.sendKeys(addressInfo.get("zip"));
        singInPage.country.sendKeys(addressInfo.get("country"));
        singInPage.mobilePhone.sendKeys(addressInfo.get("phoneNumber"));
        singInPage.additionalEmail.sendKeys(addressInfo.get("alias"));
    }
    @Then("click Register button")
    public void click_Register_button() {
        singInPage.registerButton.click();
    }



}


