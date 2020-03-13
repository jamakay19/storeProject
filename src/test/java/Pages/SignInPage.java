package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="id_gender1")
    public WebElement maleButton;

    @FindBy(id="id_gender2")
    public WebElement femaleButton;

    @FindBy(id="customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(xpath = "//select[@id='days']")
    public WebElement selectDay;

    @FindBy(xpath = "//select[@id='months']")
    public WebElement selectMonth;

    @FindBy(xpath = "//select[@id='years']")
    public WebElement selectYear;

    @FindBy(id = "firstname")
    public WebElement AddressFirstName;

    @FindBy(id = "lastname")
    public WebElement AddressLastName;

    @FindBy(id = "address1")
    public WebElement AddressAddress;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement zip;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement additionalEmail;

    @FindBy(id = "submitAccount")
    public WebElement registerButton;



}


