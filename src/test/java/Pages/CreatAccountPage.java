package Pages;

import GeneraicUtility.MobileInteraction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.security.PublicKey;

public class CreatAccountPage {
    AppiumDriver driver;
    MobileInteraction mobile =new MobileInteraction(driver);

    public CreatAccountPage(AppiumDriver driver) {
        this.driver = driver;
        try {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']")
    private WebElement CreatAccountTextContains;

    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[1]")
    private WebElement firstNameEnter;

    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[2]")
    private WebElement lastNameEnter;


    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[3]")
    private WebElement EmailEnter;

    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[4]")
    private WebElement ReEnterEmail;

    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[5]")
    private WebElement password;


    @AndroidFindBy(xpath = "//android.view.View[@text='Create an Account']/parent::android.view.View[1]/descendant::android.widget.EditText[6]")

    private WebElement conformPassword;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@resource-id,'recaptcha-anchor')]")
    private WebElement captcha;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='CREATE A NEW ACCOUNT']")
    private WebElement CreataccountClickOn;


       public void VerifyCreatAccountTextContains() {
           Assert.assertTrue(CreatAccountTextContains.getText().contains("Create an Account"));
       }
           public void EnterYourDetailes() throws InterruptedException {

               firstNameEnter.sendKeys("Praveen");
               lastNameEnter.sendKeys("kumar");
               EmailEnter.sendKeys("praveen.kumar@exathought.com");
               ReEnterEmail.sendKeys("praveen.kumar@exathought.com");
               password.sendKeys("Praveen9535");
                mobile.scroolup();
               conformPassword.sendKeys("Praveen9535");
               Thread.sleep(2000);
           }
             public void ClickOnCaptha() throws InterruptedException {
             captcha.click();
                 Thread.sleep(6000);
             CreataccountClickOn.click();

           }

       }




