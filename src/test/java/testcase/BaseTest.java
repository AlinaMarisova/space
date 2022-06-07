package testcase;

import com.oracle.tools.packager.Log;
import driver.DriverConfig;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Capabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class BaseTest {

    public static AndroidDriver driver;

    @AfterTest(alwaysRun = true)
    @Parameters({"generateReport"})
    public void tearDown(ITestContext iTestContext, @Optional String generateReport) {
        if (driver != null) {
            Log.info("After suite: ");
            driver.quit();
        }
    }

    @BeforeTest(alwaysRun = true)
    @Parameters({"deviceName", "platformVersion", "wdaPort"})
    protected void setUP(@Optional String deviceName, @Optional String platformVersion, @Optional String wdaPort ) {
        Log.info("Before suit: ");
        Log.info("*** Setting up the driver ***");
        driver = new DriverConfig().createInstance();
        reinstallApp();
    }

    public void reinstallApp() { driver.resetApp(); }

    public static String getInfo() {
        Capabilities cap = driver.getCapabilities();
        String browserName = cap.getBrowserName();
        String platform = cap.getPlatform().toString();
        String version = cap.getVersion();
        return String.format("browser: %s v: %s platform: %s", browserName, version, platform);
    }
}
