package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Amani on 15/12/2016.
 */
public class GroupTest extends BaseTest
{
    private String groupName1 = "Magang";
    private String groupName2 = "Magang 2";
    private String groupName3 = "Internship";
    private By editText = By.className("android.widget.EditText");

    public void openGroup()
    {
        homePage.selectTabContact();
        groupPage.selectGroupAtIndex(1);
        groupPage.chatGroup();
    }

    @Test
    public void viewMember()
    {
        dismissDialog();
        openGroup();
        toolbarPage.viewDetail();
        groupPage.viewMember();

    }

    @Test
    public void createGroup() throws InterruptedException
    {
        dismissDialog();
        homePage.selectTabContact();
        groupPage.newGroup();
        editTextPage.enterText(groupName1,By.className("android.widget.EditText"));
        System.out.println("Group Name : " + editTextPage.getTextBoxText());
        groupPage.create();
    }

    @Test
    public void cancelToCreateGroup() throws InterruptedException
    {
        dismissDialog();
        homePage.selectTabContact();
        groupPage.newGroup();
        editTextPage.enterText(groupName2,By.className("android.widget.EditText"));
        groupPage.cancelToCreateGroup();
    }

    @Test
    public void leaveGroup()
    {
        dismissDialog();
        openGroup();
        toolbarPage.viewDetail();
        groupPage.waifForDetailGroupActivity();
        groupPage.leaveGroup();
        homePage.selectTabContact();
        groupPage.checkGroup();
    }


    @Test
    public void chatGroup() throws InterruptedException
    {
        dismissDialog();
        openGroup();
        editTextPage.enterText("this is test", By.className("android.widget.EditText"));
        chatPage.sendText();
        chatPage.selectItemStickerAtIndex(3);
    }

    @Test
    public void addMember()
    {
        dismissDialog();
        openGroup();
        toolbarPage.viewDetail();
        groupPage.addMember(5);
    }


    @Test
    public void memberDetails(){
        viewMember();
        groupPage.memberDetails();
    }

    @Test
    public void setMemberAsAdmin()
    {
        viewMember();
        groupPage.setMemberAsAdmin();
    }

    @Test
    public void removeUser()
    {
        viewMember();
        groupPage.removeUser();
    }


    @Test
    public void sendMessage()
    {
        viewMember();
        groupPage.sendMessage();
    }

    @Test
    public void editGroup() throws InterruptedException
    {
        viewMember();
        groupPage.editGroup();
        editTextPage.enterText(groupName3,editText);
        String groupName = editTextPage.getTextBoxText();
        System.out.println(groupName);
        groupPage.checkUpdateGroupButton();

        if(groupName.equals(groupPage.getGroupDetailName()))
        {
            System.out.println("Update Group Name - Success");
        }
        else
            System.out.println("Failed to Update Group Name");

    }

    @Test
    public void checkGroupProfilePicture()
    {
        dismissDialog();
        openGroup();
        toolbarPage.checkGroupProfilePicture();
        toolbarPage.checkBackButton();
    }

    @Test
    public void checkMoreButton()
    {
        dismissDialog();
        openGroup();
        toolbarPage.checkIfMoreButtonClicked();
    }

    @Test
    public void AttachmentCamera()
    {
        dismissDialog();
        openGroup();
        attachmentPage.isAttachmentDisplayed();
        attachmentPage.attachPicture();
        chatPage.checkIfChatImageSent();
    }
}
