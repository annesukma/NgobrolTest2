package ngobrol2.test.jatis.ngobroltest2.Tests;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Amani on 06/03/2017.
 */
public class LoginTest extends BaseTest
{


    @Test
    public void login() throws InterruptedException
    {

       // driver().startActivity("com.jatis.ownNgobrol2","com.jatis.ownNgobrol2.activity.Act_Intro");
        waitForClickabilityOf(By.id("com.jatis.ownNgobrol2:id/skip"),1000);
        loginPage.login();
        spinnerPage.selectSpinnerAtIndex(0, By.id("android:id/text1"));
        editTextPage.enterText("83813360954",By.id("com.jatis.ownNgobrol2:id/phone_number"));
        loginPage.activation();
        editTextPage.enterText("123456",By.className("android.widget.EditText"));
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/name"),1000);
        editTextPage.enterText("Me",By.id("com.jatis.ownNgobrol2:id/name"));
        editTextPage.enterText("Hello",By.id("com.jatis.ownNgobrol2:id/status"));
        loginPage.loadPublishPage();
        loginPage.publish();

    }

}
