package ngobrol2.test.jatis.ngobroltest2.AppiumSupport;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * Created by Amani on 14/11/2016.
 */
public abstract class AppiumBasePage {
    private static final int KEYBOARD_ANIMATION_DELAY = 2500;
    private static final int XML_REFRESH_DELAY = 2500;

    /**
     * The driver
     */
    protected static AndroidDriver driver;
    public static Dimension size;



    protected AppiumBasePage(AndroidDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);

    }



    /**

     * @param input String to be sent
     * @param element WebElement to receive text, cannot be a secure text field.
     * @param appendNewLine true to append a new line character to incoming string when sending to element, else false
     *
     * @return true if keys were successfully sent, otherwise false.
     */
    protected boolean sendKeysToElement(String input, MobileElement element, boolean appendNewLine) throws InterruptedException {
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;



        do {
            element.clear();
            Thread.sleep(KEYBOARD_ANIMATION_DELAY);

            if (appendNewLine) {
                element.sendKeys(input + "\n");
            } else {
                element.sendKeys(input);
            }


            Thread.sleep(XML_REFRESH_DELAY);

        } while (!element.getText().contains(input) && ++attempts < MAX_ATTEMPTS);
        element.click();
        driver.hideKeyboard();
        return element.getText().contains(input);

    }


}
