package GeneraicUtility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public class MobileInteraction {
    AppiumDriver driver;
    public MobileInteraction(AppiumDriver driver) {
        this.driver=driver;

    }

    public void scroolup(){
        // Get the device screen dimensions
        Dimension size = driver.manage().window().getSize();

    //  Set the start and end coordinates for the swipe action
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.6);
        int endX = startX;
        int endY = (int) (size.height * 0.2);

// Perform the swipe action from the start coordinates to the end coordinates
        TouchAction action = new TouchAction ((PerformsTouchActions) driver);
        action.press(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();

    }
}

