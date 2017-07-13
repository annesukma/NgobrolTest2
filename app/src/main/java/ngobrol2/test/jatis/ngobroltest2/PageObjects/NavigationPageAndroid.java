package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.NoSuchElementException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 14/11/2016.
 */
public class NavigationPageAndroid extends AppiumBasePage implements NavigationPage
{
    private final int TRIES = 5;

    /**
     * Get the drawer button
     */
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Ngobrol']")
    public MobileElement drawer;

    public NavigationPageAndroid(AndroidDriver driver) {
        super(driver);
    }

    /**
     * Go to a specific category within the navigation drawer
     *
     * @param categoryName category
     */
    public void gotoCategory(String categoryName) {
       int counter = 0;
        drawer.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MobileElement categoryElement = null;

        while (categoryElement == null) {
            try {
                counter++;
                if (counter == TRIES)
                    return;
                categoryElement = (MobileElement) driver.findElementByName(categoryName);
                        //findElementByName(categoryName);
            } catch (NoSuchElementException e) {
              //  driver.scrollTo(categoryName);
            }
        }

        categoryElement.click();

    }
}
