package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 24/01/2017.
 */
public class ImageGalleryPageAndroid extends AppiumBasePage implements ImageGalleryPage
{

        @AndroidFindBy(className = "android.view.View")
        private MobileElement imageGalley;

        public ImageGalleryPageAndroid(AndroidDriver driver) {
            super(driver);
        }

        /**
         *
         * @return if the grid view is displayed
         */
        public boolean imageGalleryIsDisplayed() {
            return imageGalley.isDisplayed();
        }

}
