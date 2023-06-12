package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class HomePage {
	
	 AppiumDriver driver;
	public HomePage(AppiumDriver driver) {
		this.driver=driver;
	try {
		
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    } catch (Exception e) {

        e.printStackTrace();
    }
}
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Sign In or Create Account']")
	private WebElement loginBtn;
@AndroidFindBy(xpath = "//android.view.View[@content-desc='Hello, QA Manila']")
private WebElement ofterSigIn;

	@AndroidFindBy(xpath = "//android.view.View[@text='Sign in']")
	private WebElement signIn_txt;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Create a New Account']")
	private WebElement crateAccount_btn;
	

	
	public void ClickOnSigninBtn() {
		loginBtn.click();
		}
		public void clikOnUserSigIn(){
		ofterSigIn.click();

		}

		public void verifySignInPageDisplayed(){
			Assert.assertTrue(signIn_txt.getText().contains("Sign in"));
		}

		public void clickOnCreateAccountBtn(){
		crateAccount_btn.click();
		}

		public void verifyAccountCreatePageDisplayed(){
		Assert.assertTrue(crateAccount_btn.getText().contains("Create a New Account"));
		}

}
