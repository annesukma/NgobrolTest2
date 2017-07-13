package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/11/2016.
 */
public class EditTextPageAndroid extends AppiumBasePage implements EditTextPage
{

    private MobileElement textField;
    public EditTextPageAndroid(AndroidDriver driver) {
        super(driver);
    }

    /**
     * @param text to input
     *
     * @return true, if text properly entered, else false.
     */
    public boolean enterText(String text, By locator) throws InterruptedException {

        textField = (MobileElement)driver.findElement(locator);
        return sendKeysToElement(text, textField, false);
    }

    /**
     *
     * @return the contents of the text box
     */
    public String getTextBoxText(){

        return textField.getText();
    }
}
