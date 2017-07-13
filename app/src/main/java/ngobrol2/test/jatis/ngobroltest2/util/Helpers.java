package ngobrol2.test.jatis.ngobroltest2.util;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;


public abstract class Helpers extends AppiumBasePage {
    protected Helpers(AndroidDriver driver) {
        super(driver);
    }


    /**
     *
     * @param locator The locating mechanism
     * @return return an element by locator
     */
    public static WebElement element(By locator) {
        return driver.findElement(locator);
      }

    /**
     *
     * @param locator The locating mechanism
     * @return Return a list of elements by locator
     */
    public static List<WebElement> elements(By locator) {
        return driver.findElements(locator);
    }

    /**
     * press back button at android device / emulator
     */
    public static void back() {
        driver.navigate().back();
      }

    /**
     * Scroll to element that contains name or text
     * @param str name of an element
     */
    public static void scrollingTo(String str)
    {
        MobileElement element = (MobileElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + str + "\").instance(0))");
        element.click();
    }

    /**
     * Wait for an element (selected by locator) for the provided amount of milliseconds to be visible.
     * @param locator The locating mechanism to use
     * @param time Desired waiting duration
     */
    public static void waitForVisibilityOf(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Wait for an element (selected by locator) for the provided amount of milliseconds to be clickable
     * @param locator The locating mechanism
     * @param time  The amount of time to wait
     */
    public static void waitForClickabilityOf(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Wait for an element (selected by locator) for the provided amount of milliseconds to be invisible
     * @param locator The locating mechanism
     * @param time  The amount of time to wait
     */
    public static void waitForInvisibilityOf(By locator, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));

    }

    /**
     * Verify the desired page has loaded
     * @param locator The locating mechanism
     * @param time Desired waiting duration
     * @param description console message if test is passed or failed
     */
    public static void loaded(By locator, int time, String description)
    {
        try {
            waitForVisibilityOf(locator,time);
            System.out.println(description + " - Success");
        }
        catch (Exception e)
        {
            System.out.println(description + " - Failed");
        }
    }

    /**
     * Asserts that a condition is true
     * @param description console message if test is passed or failed
     * @param condition condition to be checked
     */
    public static void AssertTrue(String description, boolean condition)
    {
        try{
            Assert.assertTrue(condition);
            System.out.println(description + " - Success");
        }catch(AssertionError e){
            System.out.println(description + " - Failed");
        }
    }

    /**
     * turn on airplane mode
     */
    public static void airplaneModeEnable()
    {
        driver.setConnection(Connection.AIRPLANE);
        Assert.assertEquals(Connection.AIRPLANE, driver.getConnection());
        System.out.println("Connection :: " + driver.getConnection());
    }

    /**
     * turn on all (data and wi-fi)
     */
    public static void turnOnAll()
    {
        driver.setConnection(Connection.ALL);
        Assert.assertEquals(Connection.ALL, driver.getConnection());
        System.out.println("Connection :: " + driver.getConnection());
    }

    /**
     * turn off all (data and wi-fi)
     */
    public static void turnOffAll()
    {
        driver.setConnection(Connection.NONE);
        Assert.assertEquals(Connection.NONE, driver.getConnection());
        System.out.println("Connection :: " + driver.getConnection());
    }

    /**
     * turn on data
     */
    public static void dataEnable()
    {
        driver.setConnection(Connection.DATA);
        Assert.assertEquals(Connection.DATA, driver.getConnection());
        System.out.println("Connection :: " + driver.getConnection());
    }

    /**
     * turn on wi-fi
     */
    public static void wifiEnable()
    {
        driver.setConnection(Connection.WIFI);
        Assert.assertEquals(Connection.WIFI, driver.getConnection());
        System.out.println("Connection :: " + driver.getConnection());
    }

    /**
     * Press and hold an element until the context menu event has fired.
     * @param locator The locating mechanism
     * @return
     */
    public static TouchAction longPressElement(By locator)
    {
        WebElement item = element(locator);
        TouchAction touchAction = new TouchAction(driver);
        return touchAction.longPress(item).perform();
    }

    /**
     *
     * @param locator Press and hold elements at the desired index until the contextmenu event has fired.
     * @param index number of index
     * @return
     */
    public static TouchAction longPressElementsAtIndex(By locator, int index)
    {
        List<WebElement> items = elements(locator);
        WebElement itemSelected = items.get(index);
        TouchAction touchAction = new TouchAction(driver);
        return touchAction.longPress(itemSelected).perform();
    }

    /**
     * Select elements at index
     * @param locator The locating mechanism
     * @param index number of index
     * @return
     */
    public static WebElement selectElementAtIndex(By locator, int index)
    {
        List<WebElement> entries = elements(locator);
        return entries.get(index);
    }

}