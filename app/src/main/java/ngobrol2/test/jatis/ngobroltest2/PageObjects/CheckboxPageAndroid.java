package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/12/2016.
 */
public class CheckboxPageAndroid extends AppiumBasePage implements CheckBoxPage
{
    public CheckboxPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }
    private MobileElement checkBox;

    /**
     * Clicks the checkbox
     * @param locator The locating mechanism
     */
    public void clickCheckBox(By locator) {

        checkBox = (MobileElement) driver.findElement(locator);
        checkBox.click();
    }

    /**
     *
     * @return the text from the display
     */
    public String getCheckBoxDisplay()
    {
        return checkBox.getText();
    }

    /**
     * return the checkbox status
     * @return
     */
    public boolean getCheckBoxStatus()
    {
        return Boolean.parseBoolean(checkBox.getAttribute("checked"));
    }

}
