package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
    public SignOutPage (){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//a[@title='Log me out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//form[@id='login_form']//input[@id='email']")
    public WebElement emailAddress;

    @FindBy(xpath = "//form[@id='login_form']//input[@id='passwd']")
    public WebElement password;

    @FindBy(xpath = "//form[@id='login_form']//button")
    public WebElement signInButton;

    @FindBy(xpath = "//a[@title='View my customer account']")
    public WebElement validation;
    @FindBy(xpath = "//div[@id='center_column']/div[1]/ol")
    public WebElement failedMessage;

}
