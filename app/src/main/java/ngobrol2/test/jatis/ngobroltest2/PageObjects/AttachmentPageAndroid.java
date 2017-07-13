package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 19/12/2016.
 */
public class AttachmentPageAndroid extends AppiumBasePage implements AttachmentPage
{
    public AttachmentPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attachment")
    private MobileElement attachment;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_camera")
    private MobileElement attachCamera;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_photo")
    private MobileElement attachPhoto;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_video")
    private MobileElement attachVideo;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_audio")
    private MobileElement attachAudio;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_location")
    private MobileElement attachLocation;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_contact")
    private MobileElement attachContact;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attach_doc")
    private MobileElement attachDoc;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/dropdown_attachment")
    private MobileElement dropdown;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/attachment")
    private MobileElement close;

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

    public boolean isAttachCameraDisplayed()
    {
        return attachCamera.isDisplayed();
    }

    public boolean isAttachPhotoDisplayed()
    {
        return attachPhoto.isDisplayed();
    }

    public boolean isAttachVideoDisplayed()
    {
        return attachVideo.isDisplayed();
    }

    public boolean isAttachAudioDisplayed()
    {
        return attachAudio.isDisplayed();
    }

    public boolean isAttachLocationDisplayed()
    {
        return attachLocation.isDisplayed();
    }

    public boolean isAttachContactDisplayed()
    {
        return attachContact.isDisplayed();
    }

    public boolean isAttachDocDisplayed()
    {
        return attachDoc.isDisplayed();
    }

    public void isAttachmentDisplayed()
    {

        attachment.click();
        Assert.assertTrue(isAttachCameraDisplayed()&&isAttachAudioDisplayed()&&isAttachContactDisplayed()&&isAttachDocDisplayed()&&
                isAttachLocationDisplayed()&&isAttachPhotoDisplayed()&&isAttachVideoDisplayed());
        System.out.println("Display Attachment - Success");

    }


    public void attachPicture()
    {
        attachCamera.click();
        camera.click();
        loaded(By.xpath("//android.widget.ImageView[@content-desc='Shutter button']"),1000,"Load Camera Page");
        shutterButton.click();
        btnDone.click();
        loaded(By.xpath("//android.widget.TextView[@text='Crop']"),1000,"Load Crop Page");
        crop.click();
    }

    public void attachLocation()
    {
        attachLocation.click();
    }

    public void attachContact()
    {
        attachContact.click();
    }


}
