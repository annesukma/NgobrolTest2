package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 23/02/2017.
 */
public interface CheckBoxPage {
    public void clickCheckBox(By locator);
    public String getCheckBoxDisplay();
    public boolean getCheckBoxStatus();
}
