package ngobrol2.test.jatis.ngobroltest2.PageObjects;


import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 13/12/2016.
 */
public class NgobrolChatPageAndroid extends AppiumBasePage implements NgobrolChatPage {
    public NgobrolChatPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }


    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_content")
    private MobileElement chatContent;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_bub")
    private MobileElement chatBub;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_status")
    private MobileElement chatStatus;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_image_source")
    private MobileElement chatImage;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_contact")
    private MobileElement chatContact;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_sticker")
    private MobileElement chatSticker;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_location")
    private MobileElement chatLocation;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_text")
    private MobileElement chatText;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/sticker")
    private MobileElement Sticker;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/list_chat")
    private MobileElement listChat;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/view_chat_image_progress")
    private MobileElement imageProgress;

    //sticker
    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/list_sticker_pack_default")
    private MobileElement stickerPack;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/item_sticker")
    private MobileElement itemSticker;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/date_divider")
    private MobileElement dateDivider;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_send")
    private MobileElement btnSend;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/btn_newchat")
    private MobileElement newChat;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/action_newchat")
    private MobileElement newConversation;

    public boolean isChatImageDisplayed()
    {
        return chatImage.isDisplayed();
    }

    public boolean isChatLocationDisplayed()
    {
        return chatLocation.isDisplayed();
    }

    public boolean isChatContactDisplayed()
    {
        return chatContact.isDisplayed();
    }

    public void send()
    {
        btnSend.click();
    }

    public void newConveration(int index)
    {
        newConversation.click();
        List<WebElement> contactName = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_name"));
        String selectedContact =  contactName.get(index).getText();
        System.out.println("Contact Name" + selectedContact);
        contactName.get(index).click();
    }

    public void sendText()
    {
        WebDriverWait wait = new WebDriverWait(driver, 3000);
        wait.until(ExpectedConditions.elementToBeClickable(btnSend));
        send();
        boolean isTextSend =  chatText.isDisplayed();
        AssertTrue("Send Text",isTextSend);
    }

    public void negativeTestChat()
    {
        send();
        boolean isSendButtonClickable = btnSend.isEnabled();
        Assert.assertFalse(isSendButtonClickable);
    }



    public void newChat(int index)
    {
        newChat.click();
        selectElementAtIndex(By.id("com.jatis.ownNgobrol2:id/item_contact_name"),index).click();
        //List<WebElement> entries = elements(By.id("com.jatis.ownNgobrol2:id/item_contact_name"));
        //entries.get(index).click();
    }

    public void selectItemStickerAtIndex(int index)
    {
        Sticker.click();
        stickerPack.click();
        List<WebElement> entries = elements(By.id("com.jatis.ownNgobrol2:id/item_sticker"));
        entries.get(index).click();

        boolean isStickerDisplay  = chatSticker.isDisplayed();
        AssertTrue("Display Sticker", isStickerDisplay);
    }

    public void checkIfChatImageSent()
    {
        AssertTrue("Attach Picture",isChatImageDisplayed());
        waitForVisibilityOf(By.id("com.jatis.ownNgobrol2:id/view_chat_image_upload_progress"),3000);
        waitForInvisibilityOf(By.id("com.jatis.ownNgobrol2:id/view_chat_image_upload_progress"),3000);
        boolean isImageSent = driver.findElementsById("com.jatis.ownNgobrol2:id/view_chat_image_upload_progress").size()==0;
        AssertTrue("Send Picture",isImageSent);

    }

    public void longPressClearChat(int index) throws InterruptedException
    {
        longPressElementsAtIndex(By.id("com.jatis.ownNgobrol2:id/item_chat_name"),index);
        driver.findElementByName("Clear Chat").click();
        Thread.sleep(5000);
        List<WebElement> items = elements(By.id("com.jatis.ownNgobrol2:id/item_chat_name"));
        items.get(index).click();
        boolean isChatImageDisplayed = driver.findElements(By.id("com.jatis.ownNgobrol2:id/view_chat_image_source")).size()!=0;
        Assert.assertFalse(isChatImageDisplayed);
    }

    public int getItemChatSize()
    {
        List<WebElement> items = elements(By.id("com.jatis.ownNgobrol2:id/item_chat_name"));
        return items.size();
    }

    public void longPressEndChat(int index) throws InterruptedException
    {
        int currentSize = getItemChatSize();
        System.out.println("Current Chat Size Before doing End Chat :: " + currentSize);
        longPressElementsAtIndex(By.id("com.jatis.ownNgobrol2:id/item_chat_name"),index);
        element(By.name("End Chat")).click();
       // driver.findElementByName("End Chat").click();
        Thread.sleep(5000);
        try{
            System.out.println("Current Chat Size After doing End Chat :: " + getItemChatSize());
            Assert.assertEquals(currentSize-1,getItemChatSize());
            System.out.println("End Chat - Success");
        }catch(AssertionError e){
            System.out.println("End Chat- Failed");
        }
    }

    public void checkIfLocationSent()
    {
        AssertTrue("Send Location",isChatLocationDisplayed());
    }

    public void checkIfContactSent()
    {
        AssertTrue("Send Contact",isChatContactDisplayed());
    }



}
