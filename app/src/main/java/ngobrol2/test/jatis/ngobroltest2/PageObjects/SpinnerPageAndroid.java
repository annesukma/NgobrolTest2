package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/11/2016.
 */
public class SpinnerPageAndroid extends AppiumBasePage implements SpinnerPage
{
    public SpinnerPageAndroid(AndroidDriver driver)
    {
        super(driver);
        selectedEntry=null;
    }


    /**
     * saves the last entry
     */
    private String selectedEntry;


    /**
     * The text display
     */
    @AndroidFindBy(tagName = "Pilih tagihan")
    private MobileElement display;


    /**
     * Selects a specific item from the spinner control
     *
     * @param index of the spinner items
     */
    public void selectSpinnerAtIndex(int index, By locator) {
         driver.findElement(locator).click();
        List<WebElement> entries = elements(By.id("android:id/text1"));
        selectedEntry = entries.get(index).getText();
        entries.get(index).click();

    }

    /**
     *
     * @return the selected entry
     */
    public String getSelectedEntry() {
        return selectedEntry;
    }

    /**
     *
     * @return the text from the display
     */
    public String getDisplayText() {
        return display.getText();
    }
}

