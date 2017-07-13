package ngobrol2.test.jatis.ngobroltest2.AppiumSupport;
import io.appium.java_client.android.AndroidDriver;

public abstract class AppiumBaseClass {

    protected AndroidDriver driver()

    {
        return AppiumController.instance.driver;
    }
}
