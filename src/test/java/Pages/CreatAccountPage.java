package Pages;

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

public void scroolup(){
    // Get the device screen dimensions
    Dimension size = driver.manage().window().getSize();

// Set the start and end coordinates for the swipe action
    int startX = size.width / 2;
    int startY = (int) (size.height * 0.6);
    int endX = startX;
    int endY = (int) (size.height * 0.2);

// Perform the swipe action from the start coordinates to the end coordinates
    TouchAction action = new TouchAction ((PerformsTouchActions) driver);
    action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();

}
       public void VerifyCreatAccountTextContains() {
           Assert.assertTrue(CreatAccountTextContains.getText().contains("Create an Account"));
       }
           public void EnterYourDetailes() throws InterruptedException {
               firstNameEnter.sendKeys("Praveen");
               lastNameEnter.sendKeys("kumar");
               EmailEnter.sendKeys("praveen.kumar@exathought.com");
               ReEnterEmail.sendKeys("praveen.kumar@exathought.com");
               password.sendKeys("Praveen9535");
               scroolup();
               conformPassword.sendKeys("Praveen9535");
               Thread.sleep(2000);
           }
             public void ClickOnCaptha() throws InterruptedException {
             captcha.click();
                 Thread.sleep(6000);
             CreataccountClickOn.click();

           }

       }




