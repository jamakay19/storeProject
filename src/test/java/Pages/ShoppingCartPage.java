package Pages;

import Utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    public ShoppingCartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "searchbox")
    public WebElement searchBox;

    @FindBy(name = "submit_search")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@title='All best sellers']")
    public WebElement allBestSellersBtn;

    @FindBy(xpath = "//img[@alt='Printed Chiffon Dress']") //16.40
    public WebElement order1;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    public WebElement order2;

    @FindBy(xpath = "//img[@title='Blouse']")
    public WebElement order3;

    @FindBy(xpath = "//body[@class='product product-4 product-printed-dress category-10 category-evening-dresses hide-left-column hide-right-column lang_en']")
    public WebElement order4;

    @FindBy(xpath = "//img[@class='replace-2x img-responsive']/..//following-sibling::div[@class='product-content']")
    public WebElement order5;





}


