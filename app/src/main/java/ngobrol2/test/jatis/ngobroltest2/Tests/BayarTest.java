package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Amani on 28/11/2016.
 */
public class BayarTest extends BaseTest
{
   /** @Test
    public void startActivityInThisAppTestCase() {
        navPage.gotoCategory("Contacts");
        bayarPage.testActivity();
    }*/

    @Test
    public void testBayarAir() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarAir();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();
    }

    @Test
    public void testBayarPLN() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarPLN();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();
    }

    @Test
    public void testBayarAngsuran() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarAngsuran();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();
    }

    @Test
    public void testBayarTelepon() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarTelepon();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();
    }

    @Test
    public void testBayarTv() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarTV();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();
    }

    @Test
    public void testBayarAsuransi() throws InterruptedException
    {
        dismissDialog();
        navPage.gotoCategory("Bayar");
        bayarPage.bayarAsuransi();
        spinnerPage.selectSpinnerAtIndex(1, By.name("Pilih tagihan"));
        editTextPage.enterText("087483494",By.className("android.widget.EditText"));
        System.out.println("ID Entered : " + editTextPage.getTextBoxText());
        System.out.println("Selected entry : " + spinnerPage.getSelectedEntry());
        bayarPage.pay();

    }
}
