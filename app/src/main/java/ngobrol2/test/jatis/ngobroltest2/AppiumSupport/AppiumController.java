package ngobrol2.test.jatis.ngobroltest2.AppiumSupport;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class AppiumController {


    public static AppiumController instance = new AppiumController();
    public AndroidDriver driver;

    public void start() throws MalformedURLException
    {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("deviceName", "0123456789ABCDEF");
            capabilities.setCapability("browserName", "Android");
            capabilities.setCapability("platformVersion", "5.1");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "com.jatis.ownNgobrol2");
            capabilities.setCapability("appWaitActivity1","com.jatis.ownNgobrol2.activity.Act_Home");
            capabilities.setCapability("appWaitActivity2","com.jatis.ownNgobrol2.activity.Act_Intro");
            capabilities.setCapability("appActivity","com.jatis.ownNgobrol2.activity.Act_Splash");
            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public void stop() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    public void restartApp() {
        driver.resetApp();

    }

 }
