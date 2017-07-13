package ngobrol2.test.jatis.ngobroltest2.PageObjects;

/**
 * Created by Amani on 20/12/2016.
 */
public interface NgobrolHomePage
{
    public void selectItemChatAtIndex(int index);

    public void selectTabContact();
    public void selectTabChat();
    public boolean isItemChatNameDisplayed();
    public void openNotification();
}
