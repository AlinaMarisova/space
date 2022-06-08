package testcase;

import com.oracle.tools.packager.Log;
import driver.DriverConfig;
import io.appium.java_client.android.AndroidDriver;
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
    }

    public void reinstallApp() { driver.resetApp(); }

}
