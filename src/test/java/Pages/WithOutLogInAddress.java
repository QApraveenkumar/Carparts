package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WithOutLogInAddress {
    AppiumDriver driver;

    public WithOutLogInAddress(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='searchBox-mobile")
    private WebElement SearchBarAdd;
    @AndroidFindBy(xpath = "/android.view.View[@resource-id='iconSearch")
    private WebElement SearchBtnAdd;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryFirstName']")
    private WebElement AddFirstname;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryFirstLastName']")
    private WebElement AddLastname;
    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryStreetAddress']")
    private WebElement AddStreet;
    @AndroidFindBy(xpath = "//android.widget.Spinner[@resource-id='deliveryState']")
    private WebElement AddCity;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryPostcode']")
    private WebElement Zipcode;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryTelephone']")
    private WebElement PhoneNumber;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='deliveryTracking']")
    private WebElement CheckBox;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='deliveryEmailAddress']")
    private WebElement EmailAdd;


public void SelectCountry(AppiumDriver driver) {
    AddCity.click();
    driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android:id/text1\")).getChildByText(" + "new UiSelector().className(\"android.widget.CheckedTextView\"), \"Indiana\")"));


 }

public void AddressDetailes(){
    AddFirstname.sendKeys("Praveen");
    AddLastname.sendKeys("kumar");





}
}
