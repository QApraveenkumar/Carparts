package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WithOutLogInAddress {
    AppiumDriver driver;
    public WithOutLogInAddress(AppiumDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='searchBox-mobile")
    private WebElement SearchBarAdd;
    @AndroidFindBy(xpath = "/android.view.View[@resource-id='iconSearch")
    private WebElement SearchBtnAdd;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping Address']/parent::android.view.View[1]/descendant::android.widget.EditText[1]")
    private WebElement AddFirstname;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping Address']/parent::android.view.View[1]/descendant::android.widget.EditText[2]")
    private WebElement AddLastname;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping Address']/parent::android.view.View[1]/descendant::android.widget.EditText[3]")
    private WebElement AddStreet;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Shipping Address']/parent::android.view.View[1]/descendant::android.widget.EditText[4]")
    private WebElement AddCity;

}
