package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.poi.ddf.EscherColorRef;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
    AppiumDriver driver;

    public Addtocart(AppiumDriver driver) {
        try {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='searchBox-mobile']")
    private WebElement SearchBarr;
    @AndroidFindBy(xpath = "//android.view.View[@resource-id='iconSearch']")
    private WebElement searchBtn;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
    private WebElement AddtoCart;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='PROCEED TO CHECKOUT']")
    private WebElement ProcedCheckOut;

    @AndroidFindBy(xpath = "//android.view.View[@text='Saved Addresses']/parent::android.view.View[1]/descendant::android.widget.RadioButton[1]")
    private WebElement TestAddress;

    @AndroidFindBy(xpath = "//android.view.View[@text='Saved Addresses']/parent::android.view.View[1]/descendant::android.widget.RadioButton[2]")
    private WebElement ExaAddress;
    @AndroidFindBy(xpath = "//android.view.View[@text='Saved Addresses']/parent::android.view.View[1]/descendant::android.widget.RadioButton[3]")
    private WebElement TestIpnoneAddress;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@resource-id='deliveryTracking']")
    private WebElement yesCheck;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Save & Continue']")
    private WebElement SaveBtn;

     public void AddtoCart() throws InterruptedException {
        // SearchBarr.click();
         SearchBarr.sendKeys("Wheel Hub");
         System.out.println("enter the mirror");
         Thread.sleep(3000);
         searchBtn.click();

         System.out.println("Click on the search Btn");
         Thread.sleep(3000);
     }
     public void AddtoCart2(){
    CreatAccountPage Scrool=new CreatAccountPage(driver);
    Scrool.scroolup();
    AddtoCart.click();
    Scrool.scroolup();
    ProcedCheckOut.click();
    Scrool.scroolup();
    ExaAddress.click();
    yesCheck.click();
    Scrool.scroolup();
    SaveBtn.click();
}


    }








