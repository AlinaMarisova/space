package pageobject;

import driver.DriverConfig;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasePage {

    protected final AppiumDriver driver;
    private static final Logger logger = Logger.getLogger(BasePage.class.getName());

    public BasePage(final AppiumDriver<?> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    private void fluentWait(MobileElement element, long timeout) {
        Wait wait = new AppiumFluentWait(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementToBePresent(WebElement element, String errorMessage, long timeoutInSeconds) {
        Wait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(timeoutInSeconds))
                .pollingEvery(Duration.ofMillis(5))
                .ignoring(NoSuchElementException.class, StaleElementReferenceException.class)
                .ignoring(TimeoutException.class)
                .withMessage(errorMessage);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementAndSendKeys (MobileElement element, String value, long timeoutInSeconds){
        try {
            fluentWait(element, timeoutInSeconds);
        } catch (ElementNotVisibleException e) {
            logger.log(Level.WARNING, "не найдено");
        }
        element.sendKeys(value);
        return element;
    }
//
//    public WebElement waitForElementToBeClickable(WebElement element, long timeoutInSeconds) {
//        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
//        try {
//            return wait.until(ExpectedConditions.elementToBeClickable(element));
//        } catch (StaleElementReferenceException e) {
//            return wait.until(ExpectedConditions.elementToBeClickable(element));
//        }
//    }


}
