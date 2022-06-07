package driver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DriverConfig {
    private AndroidDriver<?> driver;

    private static final Logger logger = Logger.getLogger(DriverConfig.class.getName());

    public AndroidDriver<?> createInstance() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("deviceName", "Test");
            capabilities.setCapability("appPackage", "com.jetbrains.space");
//            capabilities.setCapability("app", "/Users/a.marisova/Documents/Space.2020.8.34.apk");

            capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
            capabilities.setCapability(MobileCapabilityType.FULL_RESET, "false");
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            logger.log(Level.WARNING, "can't instantiate driver", e);
        }
        return driver;
    }

}
