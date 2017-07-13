package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static  ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/12/2016.
 */
public class NgobrolGroupPageAndroid extends AppiumBasePage implements NgobrolGroupPage
{
    public NgobrolGroupPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }


    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/edit_ava")
    private MobileElement editAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_setup_ava")
    private MobileElement setupAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_cancel")
    private MobileElement btnCancel;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_create")
    private MobileElement btnCreate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Invite Friend']")
    private MobileElement btnInvite;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='New Group']")
    private MobileElement newGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_done")
    private MobileElement btnDone;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Create this group ?']")
    private MobileElement createGroupNotification;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cancel create a group ?']")
    private MobileElement cancelCreateGroupNotification;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Cancel']")
    private MobileElement cancel;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Yes']")
    private MobileElement yes;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chat']")
    private MobileElement chatGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_back")
    private MobileElement btnBack;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/menu_add_group_member")
    private MobileElement addMember;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/menu_leave_group")
    private MobileElement leaveGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_cancel")
    private MobileElement cancelInvite ;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_invite")
    private MobileElement invite;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_edit")
    private MobileElement editGroup;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_edit_cancel")
    private MobileElement editCancel;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_edit_update")
    private MobileElement editUpdate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Details']")
    private MobileElement detailMember;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Set Admin']")
    private MobileElement setAdmin;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Remove User']")
    private MobileElement removeMember;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Send Message']")
    private MobileElement sendMessage;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/alertTitle")
    private MobileElement memberName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/contact_detail_avatar")
    private MobileElement contactDetailAvatar;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/alertTitle")
    private MobileElement alertTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Camera']")
    private MobileElement camera;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gallery']")
    private MobileElement gallery;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc='Shutter button']")
    private MobileElement shutterButton;

    @AndroidFindBy(id = "com.android.gallery3d:id/btn_done")
    private MobileElement btnDoneCamera;

    @AndroidFindBy(id = "com.android.gallery3d:id/btn_cancel")
    private MobileElement btnCancelCamera;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rotate']")
    private MobileElement rotate;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Crop']")
    private MobileElement crop;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/edit_group_ava")
    private MobileElement editGroupAva;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/group_detail_name")
    private MobileElement groupDetailName;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/item_contact_avatar")
    private MobileElement itemContacts;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/cb_invite")
    private MobileElement checkBoxInvite;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Are you sure want to leave this group ?']")
    private MobileElement leaveGroupNotification;

    public String getGroupDetailName()
    {
        return groupDetailName.getText();
    }

    public boolean createGroupNotifIsDisplayed()
    {
        return createGroupNotification.isDisplayed();
    }

    public boolean yesButtonIsDisplayed()
    {
        return yes.isDisplayed();
    }

    public boolean cancelButtonIsDisplayed()
    {
        return cancel.isDisplayed();
    }

    public boolean cancelNotificationIsDisplayed()
    {
        return cancelCreateGroupNotification.isDisplayed();
    }

    public boolean itemContactIsDisplayed()
    {
        return itemContacts.isDisplayed();
    }

    public boolean checkBoxInviteIsDisplayed()
    {
        return checkBoxInvite.isDisplayed();
    }

    public boolean leaveGroupNotificationIsDisplayed()
    {
        return leaveGroupNotification.isDisplayed();
    }

    public void newGroup()
    {
        newGroup.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/edit_ava"),600,"Load Create Group Page");
        btnInvite.click();
        selectContactAtIndex(1);
        btnDone.click();

    }

    public void create()
    {
        btnCreate.click();
        AssertTrue("Display Create Group Notification",createGroupNotifIsDisplayed()&&yesButtonIsDisplayed()&&cancelButtonIsDisplayed());
        yes.click();
        waitForVisibilityOf(By.xpath("//android.widget.TextView[@text='Magang']"),1000);
        boolean isGroupCreated = driver.findElements(By.xpath("//android.widget.TextView[@text='Magang']")).size()!=0;
        AssertTrue("Create Group",isGroupCreated);

    }

    public void checkCancelButton()
    {

       AssertTrue("Display Cancel Notification",cancelNotificationIsDisplayed()&&cancelButtonIsDisplayed()&&yesButtonIsDisplayed());
    }

    public void cancelToCreateGroup()
    {
        cancel.click();
        checkCancelButton();
        yes.click();
        boolean isGroupCreated = driver.findElements(By.xpath("//android.widget.TextView[@text='Magang 2']")).size()==0;
        AssertTrue("Cancel to Create Group " ,isGroupCreated);
    }


    public void selectContactAtIndex(int index)
    {
        List<WebElement> invites = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_avatar"));
        invites.get(index).click();
        String selectedInvites = invites.get(index).getText();
    }

    public void selectGroupAtIndex(int index)
    {
        List<WebElement> groups = elements(By.id("com.jatis.ownNgobrol2:id/item_group_name"));
        String selectedGroup = groups.get(index).getText();
        System.out.println("Group Name : "+selectedGroup);
        groups.get(index).click();
    }



    public void chatGroup()
    {
        chatGroup.click();
    }

    public void waifForDetailGroupActivity()
    {
        loaded(By.id("com.jatis.ownNgobrol2:id/menu_add_group_member"), 1000, "Detail Group Page");
    }

    public void leaveGroup()
    {
        leaveGroup.click();
        AssertTrue("Display Leave Group Notification ", leaveGroupNotificationIsDisplayed()&&cancelButtonIsDisplayed()&&yesButtonIsDisplayed());
        yes.click();
    }

    public void checkGroup()
    {
        boolean leaveGroup = driver.findElementsByXPath("//android.widget.TextView[@text='Magang']").size()==0;
        AssertTrue("Leave Group",leaveGroup);
    }
    public void viewMember()
    {
        boolean isMemberDisplay = driver.findElementsById("com.jatis.ownNgobrol2:id/item_contact_name").size()!=0;
        AssertTrue("View Member Group",isMemberDisplay);
    }

    public void editGroup()
    {
        editGroup.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/edit_group_ava"),600,"Edit Group");
        editGroupAva.click();
        camera.click();
        loaded(By.xpath("//android.widget.ImageView[@content-desc='Shutter button']"),1000,"Load Camera Page");
        shutterButton.click();
        btnDoneCamera.click();
        loaded(By.xpath("//android.widget.TextView[@text='Crop']"),1000,"Load Crop Page");
        crop.click();
        loaded(By.id("com.jatis.ownNgobrol2:id/edit_group_ava"),1000,"Crop Image");

    }

    public void checkUpdateGroupButton()
    {
        editUpdate.click();

    }

    public void cancelUpdateGroup()
    {
        editCancel.click();
    }

    public void selectMemberAtIndex(int index)
    {
        List<WebElement> members = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_name"));
        String selectedMember = members.get(index).getText();
        System.out.println("Member Name : "+ selectedMember);
        members.get(index).click();
    }

    public void selectMember()
    {
        selectMemberAtIndex(1);
        boolean isMemberSelected = memberName.isDisplayed();
        AssertTrue("Select Member", isMemberSelected);
    }

    public void memberDetails()
    {
        selectMember();
        detailMember.click();
    }

    public void setMemberAsAdmin()
    {
        selectMember();
        setAdmin.click();
        List<WebElement> contactRole = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_role"));
        boolean isContactRoleDisplayed = contactRole.get(1).isDisplayed();
        AssertTrue("Set Member as Admin ", isContactRoleDisplayed);
    }

    public void removeUser()
    {
        selectMember();
        removeMember.click();
        boolean isMemberRemoved = driver.findElementsByName("Lary Page").size()==0;
        AssertTrue("Remove User",isMemberRemoved);
    }

    public void sendMessage()
    {
        selectMember();
        sendMessage.click();
        boolean sendMessage = driver.findElementsByXPath("//android.widget.TextView[@text='Lary Page']").size()!=0;
        AssertTrue("Send Message", sendMessage);
    }

    public void addMember(int index)
    {
        addMember.click();
        AssertTrue("Load Invite Page",itemContactIsDisplayed()&&checkBoxInviteIsDisplayed());
        List<WebElement> cb = elements(By.id("com.jatis.ownNgobrol2:id/cb_invite"));
        String selectedMember = cb.get(index).getText();
        cb.get(index).click();
        invite.click();
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/item_contact_name"),3000);
        boolean isMemberAdded = driver.findElementsByXPath("//android.widget.TextView[@text='Team Cook']").size()!=0;
        AssertTrue("Add Member",isMemberAdded);
    }

}
