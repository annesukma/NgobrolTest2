package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 14/12/2016.
 */
public class NgobrolUserPageAndroid extends AppiumBasePage implements NgobrolUserPage
{
    public NgobrolUserPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_cancel")
    private MobileElement btnCancel;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_update")
    private MobileElement btnUpdate;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_remove_ava")
    private MobileElement removeAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_setup_ava")
    private MobileElement setupAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/edit_ava")
    private MobileElement viewAva;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Ngobrol']")
    private MobileElement drawer;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/nav_header_ava")
    private MobileElement ava;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/nav_header_name")
    private MobileElement displayName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/nav_header_status")
    private MobileElement displaySatatus;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    private MobileElement yes;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='No']")
    private MobileElement no;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Camera']")
    private MobileElement camera;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gallery']")
    private MobileElement gallery;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Shutter button']")
    private MobileElement shutterButton;

    @AndroidFindBy(id = "com.android.gallery3d:id/btn_done")
    private MobileElement btnDone;

    @AndroidFindBy(id = "com.android.gallery3d:id/btn_cancel")
    private MobileElement btnCancelCamera;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rotate']")
    private MobileElement rotate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Crop']")
    private MobileElement crop;

    public void updateProfile()
    {
        btnUpdate.click();
    }

    public void cancelUpdate()
    {
        btnCancel.click();
    }

    public MobileElement getDisplayName()
    {
        return displayName;
    }

    public MobileElement getDisplaySatatus()
    {
        return displaySatatus;
    }

    public void viewProfile()
    {
        drawer.click();
        ava.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/edit_ava"),1000,"Load User Page");
    }

    public void updateStatus()
    {
        updateProfile();
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/nav_header_status"), 1000);
    }

    public void updateName()
    {
        updateProfile();
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/nav_header_name"), 1000);
    }

    public void cancelUserUpdate()
    {
        cancelUpdate();
        yes.click();
    }

    public void removeAva()
    {
        removeAva.click();
        Boolean isAvaRemoved = driver.findElements(By.id("com.jatis.ownNgobrol2:id/btn_remove_ava")).size()==0;
        AssertTrue("Remove Ava", isAvaRemoved);
    }

    public void updatepProfilePicture()
    {
        setupAva.click();
        camera.click();
        loaded(By.xpath("//android.widget.ImageView[@content-desc='Shutter button']"),1000,"Load Camera Page");
        shutterButton.click();
        btnDone.click();
        loaded(By.xpath("//android.widget.TextView[@text='Crop']"),1000,"Load Crop Page");
        crop.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/edit_ava"),1000,"Crop Image");
        updateProfile();
        loaded(By.id("com.jatis.ownNgobrol2:id/nav_header_ava"),1000,"Update Profile Picture");
    }

    public void updatepProfilePictureFromGallery()
    {
        setupAva.click();
        gallery.click();

    }


}
