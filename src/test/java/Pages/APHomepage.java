package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class APHomepage {

    public APHomepage(){ PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//div[@class='header_user_info']")
    public WebElement signInButton;

    @FindBy(id="email_create")
    public WebElement emailBox;

    @FindBy(name = "SubmitCreate")
    public WebElement submitButton;

    public static  String getEmail(int n)
    {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString()+"@gmail.com";
    }


}


