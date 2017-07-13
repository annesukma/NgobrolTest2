package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 21/12/2016.
 */
public class ContactTest extends BaseTest
{
    private String contactName="Ubai";
    private static final String TEXT_ENTRY__MSG = "Text was entered properly !!";
    @Test
    public void searchContact() throws InterruptedException
    {
        dismissDialog();
        homePage.selectTabContact();
        contactPage.search();
        editTextPage.enterText(contactName, By.className("android.widget.EditText"));
        Assert.assertTrue(editTextPage.getTextBoxText().contains(contactName));
        System.out.println("Text Entered : " + editTextPage.getTextBoxText() + " \n"+TEXT_ENTRY__MSG);

        //Verify result

        MobileElement searchResult = contactPage.getFirstSearchResultName();
        Assert.assertEquals("Ahmad Ubaidillah", searchResult.getText());
        System.out.println("Contact Name is : " + searchResult.getText());
        //Navigate to chat page
        searchResult.click();
    }

    @Test
    public void previewContact()
    {
        dismissDialog();
        homePage.selectTabContact();
        contactPage.scrollContactName();
        contactPage.previewContact();
    }

    @Test
    public void closePreviewContact()
    {
        dismissDialog();
        homePage.selectTabContact();
        contactPage.selectContactAtIndex(3);
        contactPage.previewContact();
        contactPage.closePreviewContact();
    }

}
