package GeneraicUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    //public static AppiumDriverLocalService service;
    public static AndroidDriver driver;
    //
//	@BeforeClass
//	public void startAppiumServer() {
//
//		service=new AppiumServiceBuilder().withIPAddress("127.0.0.1").usingPort(4723).build();
//		service.start();
//	}
    @BeforeMethod
    public void launchApp() throws MalformedURLException {

        DesiredCapabilities cap =new DesiredCapabilities();

        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability("appPackage", "com.carparts.app");
        cap.setCapability("appActivity","com.carparts.app.MainActivity");
        cap.setCapability("noReset", true);

        URL url = new URL("http://localhost:4723/wd/hub");

        driver= new AndroidDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));


    }

}
