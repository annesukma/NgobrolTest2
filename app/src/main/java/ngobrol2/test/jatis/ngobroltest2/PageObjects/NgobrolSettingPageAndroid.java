package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/12/2016.
 */
public class NgobrolSettingPageAndroid extends AppiumBasePage implements NgobrolSettingPage
{
    public NgobrolSettingPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Log Out']")
    private MobileElement logout;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement btnOK;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
    private MobileElement Cancel;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Log Out']")
    private MobileElement Logout;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sound']")
    private MobileElement sound;

    @AndroidFindBy(id = "android:id/switchWidget")
    private MobileElement switchWidget;

    @AndroidFindBy(xpath = "//android:id/switchWidget[@text='Quiet Hours']")
    private MobileElement quietHours;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='FAQ']")
    private MobileElement FAQ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Contact Us']")
    private MobileElement contactUs;

    public void setupSound(int index) throws InterruptedException
    {
        sound.click();
        boolean isSoundListDisplayed = driver.findElements(By.id("android:id/text1")).size()!=0;
        AssertTrue("Display Sound List",isSoundListDisplayed);
        List<WebElement> dropList = elements(By.id("android:id/text1"));
        dropList.get(index).click();
        System.out.println("Selected Sound : " + dropList.get(index).getText());
        btnOK.click();
        Thread.sleep(3000);
        Assert.assertTrue(isSoundListDisplayed);

    }

    public String getSwitchWidgetStatus()
    {
        return switchWidget.getText();
    }

    public void setupVibrateToOn() throws InterruptedException
    {

        System.out.println("Vibrate Status : " + getSwitchWidgetStatus());
        if(getSwitchWidgetStatus().equals("OFF"))
            switchWidget.click();
        System.out.println("Vibrate Status : " + getSwitchWidgetStatus());
        Assert.assertEquals("ON",getSwitchWidgetStatus());
        Thread.sleep(5000);


    }

}
