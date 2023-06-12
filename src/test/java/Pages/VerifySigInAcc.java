package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerifySigInAcc {
    public AppiumDriver driver;

    public VerifySigInAcc(AppiumDriver driver) {

        try {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='My Account']")
    private WebElement MyAccount;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Name, email & password details']/parent::android.view.View[1]")
    private WebElement ClickOnMyAccount;
    @AndroidFindBy(xpath = "//android.view.View[@text='First Name:']/parent::android.view.View[1]/descendant::android.widget.EditText[3]")
    private WebElement EmailAdressContaines;

    public void VerifyEmaileAdress() {
        MyAccount.click();
        ClickOnMyAccount.click();
    }

    public void verifyRegesteremaillAdd() {

        Assert.assertTrue(EmailAdressContaines.getText().equals("tester_order@yahoo.com"));
    }
}






















