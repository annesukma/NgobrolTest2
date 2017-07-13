package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.InputMismatchException;

/**
 * Created by Amani on 03/01/2017.
 */
public class SettingTest extends BaseTest
{
    @Test
    public void sound() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Settings");
        settingPage.setupSound(2);
    }

    @Test
    public void setupVibrate() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Settings");
        settingPage.setupVibrateToOn();
    }

    @Test
    public void groupNotification() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Settings");
        checkboxPage.clickCheckBox(By.className("android.widget.CheckBox"));
        System.out.println("Checked CheckBox : " + checkboxPage.getCheckBoxStatus());
        Assert.assertTrue(checkboxPage.getCheckBoxStatus());
        Thread.sleep(3000);
    }
}
