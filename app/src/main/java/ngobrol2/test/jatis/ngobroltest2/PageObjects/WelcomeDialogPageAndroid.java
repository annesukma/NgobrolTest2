package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 13/12/2016.
 */
public class WelcomeDialogPageAndroid extends AppiumBasePage implements WelcomeDialogPage
{
    public WelcomeDialogPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Dismiss']")
    private MobileElement dismissButton;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/title_template")
    private MobileElement title;


    public void dismisDialog()
    {
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/title_template"), 600);
        dismissButton.click();
        boolean isDialogDismiss = driver.findElements(By.id("com.jatis.ownNgobrol2:id/title_template")).size()==0;
        AssertTrue("Dismiss Dialog",isDialogDismiss);
    }
}
