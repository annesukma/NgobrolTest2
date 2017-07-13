package ngobrol2.test.jatis.ngobroltest2.PageObjects;

/**
 * Created by Amani on 14/12/2016.
 */
public interface NgobrolChatPage
{
    public void selectItemStickerAtIndex(int index);

    public void sendText();

    public void checkIfChatImageSent();

    public void longPressClearChat(int index) throws InterruptedException;

    public void longPressEndChat(int index) throws InterruptedException;

    public void negativeTestChat();

    public void newChat(int index);

    public void newConveration(int index);

}
