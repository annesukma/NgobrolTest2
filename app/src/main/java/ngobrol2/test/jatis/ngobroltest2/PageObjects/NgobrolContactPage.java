package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by Amani on 03/01/2017.
 */
public interface NgobrolContactPage
{
    public void search();

    public void searchContact();

    public MobileElement getFirstSearchResultName();

    public void previewContact();

    public void selectContactAtIndex(int index);

    public void scrollContactName();

    public void closePreviewContact();

    public void viewContactDetail();

}
