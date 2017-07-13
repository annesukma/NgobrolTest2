package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Amani on 20/12/2016.
 */
public class ChatTest extends BaseTest
{
    public String TEXT= "Hello this is appium test, wkwk ignored my text..i just do the random things to check my testing goin well";


    @Test
    public void chat() throws InterruptedException
    {
        dismissDialog();
        if(homePage.isItemChatNameDisplayed())
        {
            homePage.selectItemChatAtIndex(0);
            editTextPage.enterText(TEXT, By.className("android.widget.EditText"));
            chatPage.sendText();
            chatPage.selectItemStickerAtIndex(3);
            Thread.sleep(3000);
        }
        else
        {
            chatPage.newChat(0);
            editTextPage.enterText(TEXT, By.className("android.widget.EditText"));
            chatPage.sendText();
            chatPage.selectItemStickerAtIndex(3);
            Thread.sleep(3000);
        }

    }


    @Test
    public void newConversation() throws InterruptedException
    {
        dismissDialog();
        chatPage.newConveration(0);
        editTextPage.enterText(TEXT, By.className("android.widget.EditText"));
        chatPage.sendText();
    }

    @Test
    public void contactDetails()
    {
        dismissDialog();
        homePage.selectItemChatAtIndex(0);
        toolbarPage.viewDetail();
        contactPage.viewContactDetail();
    }

    @Test
    public void checkIfMoreButtonClicked()
    {
        dismissDialog();
        homePage.selectItemChatAtIndex(0);
        toolbarPage.checkIfMoreButtonClicked();
    }

    @Test
    public void checkIfAttachmentClicked()
    {
        dismissDialog();
        homePage.selectItemChatAtIndex(0);
        attachmentPage.isAttachmentDisplayed();
    }

    @Test
    public void attachPicture()
    {
        checkIfAttachmentClicked();
        attachmentPage.attachPicture();
        chatPage.checkIfChatImageSent();
    }

    @Test
    public void attachLocation()
    {
        checkIfAttachmentClicked();
        attachmentPage.attachLocation();
    }

    @Test
    public void attachContact()
    {
        checkIfAttachmentClicked();
        attachmentPage.attachContact();
    }


    @Test
    public void longPressEndChat() throws InterruptedException
    {
        dismissDialog();
        chatPage.longPressEndChat(0);
    }
}
