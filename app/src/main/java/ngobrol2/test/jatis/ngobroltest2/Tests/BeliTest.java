package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 17/11/2016.
 */
public class BeliTest extends BaseTest
{
    private static final String SPINNER_BASE_STRING = "Selected: %s";
    /**@Test
    public void swipePage() throws InterruptedException
    {
        navPage.gotoCategory("Beli");
        beliPage.swipePage();
    }*/


    @Test
    public void beliPLN() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Beli");
        beliPage.loaded();
        beliPage.beliPLN();
        spinnerPage.selectSpinnerAtIndex(1,By.id("android:id/text1"));
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());

       // Assert.assertEquals(spinnerPage.getDisplayText(), String.format(SPINNER_BASE_STRING, spinnerPage.getSelectedEntry()));
        editTextPage.enterText("08756888", By.className("android.widget.EditText"));
        beliPage.buy();

    }

    @Test
    public void beliPulsa() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Beli");
        beliPage.loaded();
        beliPage.beliPulsa();
        beliPage.selectContactNumber();
        contactPage.search();
        //editTextPage.enterText("Ubai");
        //Assert.assertFalse(editTextPage.enterText(contactName),TEXT_ENTRY_ERROR_MSG);
        Assert.assertTrue(editTextPage.getTextBoxText().contains("Ubai"));
        System.out.println("Text Entered : " + editTextPage.getTextBoxText());

        //Verify result

        MobileElement searchResult = contactPage.getFirstSearchResultName();
        Assert.assertEquals("Ahmad Ubaidillah", searchResult.getText());
        System.out.println("Contact Name is : " + searchResult.getText());
        //Navigate to chat page
        searchResult.click();
        beliPage.waitNominal();


        System.out.println("Number Entered : " + beliPage.getTextBoxText());


        spinnerPage.selectSpinnerAtIndex(2,By.name("Pilih Nominal"));
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        beliPage.buy();
    }

    @Test
    public void clear() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Beli");
        beliPage.loaded();
        beliPage.beliPulsa();
        beliPage.selectContactNumber();
        contactPage.search();
       // editTextPage.enterText("Ubai");

        //Assert.assertFalse(editTextPage.enterText(contactName),TEXT_ENTRY_ERROR_MSG);
        Assert.assertTrue(editTextPage.getTextBoxText().contains("Ubai"));
        System.out.println("Text Entered : " + editTextPage.getTextBoxText());

        //Verify result

        MobileElement searchResult = contactPage.getFirstSearchResultName();
        Assert.assertEquals("Ahmad Ubaidillah", searchResult.getText());
        System.out.println("Contact Name is : " + searchResult.getText());
        //Navigate to chat page
        searchResult.click();
        beliPage.waitNominal();
        beliPage.clear();
        Assert.assertEquals("081234567xxx", beliPage.getTextBoxText());
        System.out.println("Clear - Success " );
    }
}
