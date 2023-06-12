package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignIn {
    public AppiumDriver driver;

    public SignIn(AppiumDriver driver) {
        this.driver = driver;
        try {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@text='Sign in']/parent::android.view.View[1]/descendant::android.widget.EditText[1]")
    private WebElement SignInEmail;
    @AndroidFindBy(xpath = "//android.view.View[@text='Sign in']/parent::android.view.View[1]/descendant::android.widget.EditText[2]")
    private WebElement SigInpassword;

    @AndroidFindBy(xpath = "//android.view.View[@text='Sign in']/parent::android.view.View[1]/descendant::android.widget.CheckBox[1]")
    private WebElement SigInCaptcha;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    private WebElement ClickOnSigInBtn;

    public void SigInAccountPage() {
        SignInEmail.sendKeys("tester_order@yahoo.com");
        SigInpassword.sendKeys("usap1q2w");
        SigInCaptcha.click();
    }
    public void ClikOnSigInBtn(){
        Assert.assertTrue(ClickOnSigInBtn.getText().contains("SIGN IN"));
        System.out.println("It's true");
        ClickOnSigInBtn.click();

    }

}