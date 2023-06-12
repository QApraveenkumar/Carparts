package tests;

import GeneraicUtility.BaseClass;
import GeneraicUtility.BaseClass;
import Pages.CreatAccountPage;
import Pages.HomePage;
import org.testng.annotations.Test;

import java.time.Duration;

//@Listeners("src/main/java/GenericUtility/Listner")
public class LoginTest extends BaseClass{
	
	@Test
	public void test1() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		System.out.println("app is launched");
		HomePage hpage = new  HomePage(driver);

		hpage.ClickOnSigninBtn();
		hpage.verifySignInPageDisplayed();
		hpage.clickOnCreateAccountBtn();
		hpage.verifyAccountCreatePageDisplayed();
		System.out.println("clicked ");
		CreatAccountPage Accpage =new CreatAccountPage(driver);
		Accpage.VerifyCreatAccountTextContains();
		System.out.println("I'm in creat account page pls enter your detailes");
		Accpage.EnterYourDetailes();
		Accpage.ClickOnCaptha();
	}

}
