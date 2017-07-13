package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 14/12/2016.
 */
public class NgobrolContactPageAndroid extends AppiumBasePage implements NgobrolContactPage
{
    public NgobrolContactPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/arrow_excoll_group")
    private MobileElement excollGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/list_contact_ava")
    private MobileElement newGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/arrow_excoll_contact")
    private MobileElement excollContact;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Add Contact']")
    private MobileElement addContact;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/list_contact")
    private MobileElement listContact;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/action_search")
    private MobileElement search;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/item_contact_name")
    private MobileElement firstSearchResultName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/pre_ava")
    private MobileElement previewAva;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chat']")
    private MobileElement chatContact;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Call']")
    private MobileElement chatCall;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Share']")
    private MobileElement chatShare;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Timeline']")
    private MobileElement chatTimeline;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/contact_close_preview")
    private MobileElement contactClosePreview;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/preview_avatar")
    private MobileElement previewAvatar;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/contact_detail_avatar")
    private MobileElement contactDetailaAvatar;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/contact_detail_status")
    private MobileElement contactDetailStatus;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/contact_detail_phone")
    private MobileElement contactDetailPhone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Groups in common']")
    private MobileElement groupsInCommon;

    public boolean contactDetailaAvatarIsDisplayed() {
        return contactDetailaAvatar.isDisplayed();
    }

    public boolean contactDetailStatusIsDisplayed() {
        return contactDetailStatus.isDisplayed();
    }

    public boolean contactDetailPhoneIsDisplayed() {
        return contactDetailPhone.isDisplayed();
    }

    public boolean groupsInCommonIsDisplayed() {
        return groupsInCommon.isDisplayed();
    }

    public void viewContactDetail()
    {
        AssertTrue("Display Contact Detail Avatar", contactDetailaAvatarIsDisplayed());
        AssertTrue("Display Contact Detail Status",contactDetailStatusIsDisplayed());
        AssertTrue("Display Contact Detail Phone", contactDetailPhoneIsDisplayed());
        AssertTrue("Display Groups in Common ", groupsInCommonIsDisplayed());
    }

    public void search()
    {
        search.click();
    }

    public void searchContact()
    {
        search.click();
    }

    public MobileElement getFirstSearchResultName()
    {
        List<MobileElement> entries = driver.findElements(By.id("com.jatis.ownNgobrol2:id/item_contact_name"));
        return firstSearchResultName=entries.get(0);
    }

    public void previewContact()
    {
        previewAva.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/preview_avatar"),600,"Preview Contact");
    }

    public void selectContactAtIndex(int index)
    {
        List<WebElement> entries = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_name"));
        entries.get(index).click();
    }

    public void scrollContactName()
    {
       scrollingTo("Team Cook");
    }

    public void closePreviewContact()
    {
        contactClosePreview.click();
        boolean isPrevContactClose = driver.findElementsById("com.jatis.ownNgobrol2:id/preview_avatar").size()==0;
        AssertTrue("Close Preview Contact", isPrevContactClose);
    }



}

