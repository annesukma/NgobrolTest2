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
 * Created by Amani on 15/12/2016.
 */
public class NgobrolHomePageAndroid extends AppiumBasePage implements NgobrolHomePage
{
    public NgobrolHomePageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Timeline']")
    private MobileElement tabTimeline;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chats']")
    private MobileElement tabChats;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CONTACTS']")
    private MobileElement tabContacts;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/input_message")
    private MobileElement textField;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/item_chat_name")
    private MobileElement itemChatName;

    private String selectedItem;

    public void openNotification()
    {
        driver.openNotifications();
        WebElement element = driver.findElementByName("Ngobrol");
        element.click();
    }

    public void selectItemChatAtIndex(int index)
    {
        List<WebElement> entries = elements(By.id("com.jatis.ownNgobrol2:id/item_chat_name"));
        selectedItem = entries.get(index).getText();
        entries.get(index).click();
        System.out.println("Chat Name : " + selectedItem);

    }

    public boolean isItemChatNameDisplayed()
    {
        boolean isItemChatDisplayed = driver.findElements(By.id("com.jatis.ownNgobrol2:id/item_chat_name")).size()!=0;
        return isItemChatDisplayed;
    }


    public void selectTabContact()
    {
        tabContacts.click();
        loaded(By.name("Add Contact"),600,"Load Contact Page");

    }

    public void selectTabChat()
    {
        tabChats.click();
        loaded(By.name("Add Contact"),600,"Load Contact Page");
    }

    public void selectTabTimeLine()
    {
        tabTimeline.click();
    }
}
