package tests;

import GeneraicUtility.BaseClass;
import Pages.Addtocart;
import Pages.HomePage;
import Pages.SignIn;
import Pages.VerifySigInAcc;
import org.testng.annotations.Test;

import java.time.Duration;

public class SigInVerifyTest extends BaseClass {

@Test
    public void SigInVerify() throws InterruptedException {
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
   HomePage homePage=new HomePage(driver);
    homePage.ClickOnSigninBtn();
    SignIn sig=new SignIn(driver);
    sig.SigInAccountPage();
    Thread.sleep(10000);
    sig.ClikOnSigInBtn();
    Thread.sleep(3000);
    homePage.clikOnUserSigIn();
    VerifySigInAcc sign =new VerifySigInAcc(driver);
    sign.VerifyEmaileAdress();
    sign.verifyRegesteremaillAdd();
    System.out.println("Same account Id");


}

@Test
    public void AddToCart() throws InterruptedException {
    Addtocart Cart=new Addtocart(driver);
    Cart.AddtoCart();
    System.out.println("serching the mirror Ima");
    Cart.AddtoCart2();




}
}
