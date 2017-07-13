package ngobrol2.test.jatis.ngobroltest2.NegativeTest;

import org.junit.Test;
import org.openqa.selenium.By;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import ngobrol2.test.jatis.ngobroltest2.Tests.BaseTest;

/**
 * Created by Amani on 19/01/2017.
 */
public class ChatTest extends BaseTest
{
    private String TEXT= "This is kind of negative testing, MNVJFN29485!@#$%$^";

    @Test
    public void chat() throws InterruptedException
    {
        dismissDialog();
        homePage.selectItemChatAtIndex(1);
        airplaneModeEnable();
        editTextPage.enterText(TEXT, By.className("android.widget.EditText"));
        chatPage.negativeTestChat();

    }


}
