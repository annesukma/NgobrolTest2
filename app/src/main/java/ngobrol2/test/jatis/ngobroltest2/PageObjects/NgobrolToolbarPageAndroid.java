package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 04/01/2017.
 */
public class NgobrolToolbarPageAndroid extends AppiumBasePage implements NgobrolToolbarPage
{
    public NgobrolToolbarPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private MobileElement navigateUp;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/toolbar_avatar")
    private MobileElement toolbarAvatar;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/toolbar_text")
    private MobileElement toolbarText;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='More options']")
    private MobileElement moreOptions;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='End Chat']")
    private MobileElement endChat;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Clear Chat']")
    private MobileElement clearChat;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Backup/Restore']")
    private MobileElement backupRestore;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/preview_ava_circle")
    private MobileElement previewAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_back")
    private MobileElement btnBack;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/preview_name")
    private MobileElement previewName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/toolbar_name")
    private MobileElement toolbarName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/toolbar_info")
    private MobileElement toolbarInfo;

    public void navigateUp()
    {
        navigateUp.click();
    }

    public void viewDetail()
    {
        toolbarText.click();
    }

    public void moreOption()
    {
        moreOptions.click();
    }

    public boolean endChatIsDisplayed()
    {
        return  endChat.isDisplayed();
    }

    public boolean clearChatIsDisplayed()
    {
        return clearChat.isDisplayed();
    }

    public boolean backupRestoreIsDisplayed()
    {
        return backupRestore.isDisplayed();
    }

    public boolean toolbarAvatarIsDisplayed()
    {
        return toolbarAvatar.isDisplayed();
    }

    public boolean toolbarInfoIsDisplayed()
    {
        return toolbarInfo.isDisplayed();
    }

    public boolean btnBackIsDisplayed()
    {
        return btnBack.isDisplayed();
    }

    public  boolean previewNameIsDisplayed()
    {
        return previewName.isDisplayed();
    }

    public boolean toolbarNameIsDisplayed()
    {
        return toolbarName.isDisplayed();
    }

    public boolean previewAvaIsDisplayed()
    {
        return previewAva.isDisplayed();
    }

    public void checkIfMoreButtonClicked()
    {
        moreOption();
        AssertTrue("Display End Chat Button",endChatIsDisplayed());
        AssertTrue("Display Clear Chat Button",clearChatIsDisplayed());
        AssertTrue("Display Backup/Restore Button",backupRestoreIsDisplayed());
        System.out.println("Click More Button - Success");
       // AssertTrue("Click More Button",endChatIsDisplayed()&&clearChatIsDisplayed()&&backupRestoreIsDisplayed());
    }

    public void checkGroupProfilePicture()
    {
        toolbarAvatar.click();
        AssertTrue("Check Group Profile Picture", btnBackIsDisplayed()&&previewAvaIsDisplayed()&&previewNameIsDisplayed());

    }

    public void checkBackButton()
    {
        btnBack.click();
        AssertTrue("Check Back Button",toolbarAvatarIsDisplayed()&&toolbarNameIsDisplayed()&&toolbarInfoIsDisplayed());

    }



}
