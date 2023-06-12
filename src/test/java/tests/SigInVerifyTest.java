package tests;

import GeneraicUtility.BaseClass;
import GeneraicUtility.MobileInteraction;
import Pages.*;
import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SigInVerifyTest extends BaseClass {
    MobileInteraction Mobile = new MobileInteraction(driver);

    @Test
    public void SigInVerify() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        HomePage homePage = new HomePage(driver);
        homePage.ClickOnSigninBtn();
        SignIn sig = new SignIn(driver);
        sig.SigInAccountPage();
        Thread.sleep(10000);
        sig.ClikOnSigInBtn();
        Thread.sleep(3000);
        homePage.clikOnUserSigIn();
        VerifySigInAcc sign = new VerifySigInAcc(driver);
        sign.VerifyEmaileAdress();
        sign.verifyRegesteremaillAdd();
        System.out.println("Same account Id");


    }
    @Test                                              //add
    public void AddToCart() throws InterruptedException {
        Addtocart Cart = new Addtocart(driver);
        Cart.AddtoCart();
        System.out.println("serching the product Ima");
        Thread.sleep(3000);
        Cart.AddtoCart2();
    }

    @Test
    public void AddressDetailes() throws InterruptedException {
        Addtocart Cart = new Addtocart(driver);
        WithOutLogInAddress Addent = new WithOutLogInAddress(driver);
            Cart.AddtoCart();
           Addent.AddressDetailes();


    }
}