package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 06/03/2017.
 */
public class LoginPageAndroid extends AppiumBasePage implements LoginPage
{
    public LoginPageAndroid(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/item_slider_image")
    private MobileElement slider;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/skip")
    private MobileElement skip;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/country")
    private MobileElement spinner;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/button_login")
    private MobileElement login;

    @AndroidFindBy(id = "android:id/button2")
    private MobileElement change;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement sure;

    //edit text input code id  --> "com.jatis.ownNgobrol2:id/input_code"

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/avatar")
    private MobileElement avatar;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_setup_ava")
    private MobileElement btnSetupAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_publish")
    private MobileElement publish;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Done']")
    private MobileElement done;

    public void login()
    {
        skip.click();
        loaded(By.name("Verify Phone Number"),1000,"SKIP");
    }

    public void activation()
    {
        login.click();
        sure.click();
        loaded(By.name("Verification Account"),1000,"Enter Number");
    }

    public void loadPublishPage()
    {
        loaded(By.id("com.jatis.ownNgobrol2:id/input_name_box"), 1000, "ENTER CODE");
    }

    public void publish() throws InterruptedException
    {
        publish.click();
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/title_template"), 1000);
        done.click();
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/btn_newchat"),3000);
        Boolean isBtnNewChatDisplay = elements(By.id("com.jatis.ownNgobrol2:id/btn_newchat")).size()!=0;
        AssertTrue("Login",isBtnNewChatDisplay);
        Thread.sleep(3000);
    }





}
