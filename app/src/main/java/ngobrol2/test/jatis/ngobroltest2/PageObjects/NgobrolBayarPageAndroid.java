package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

/**
 * Created by Amani on 15/11/2016.
 */
public class NgobrolBayarPageAndroid extends AppiumBasePage implements  NgobrolBayarPage
{
    public NgobrolBayarPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }
    @AndroidFindBy(tagName = "BAYAR")
    private MobileElement tabBayar;

    @AndroidFindBy(tagName = "STATUS")
    private MobileElement tabStatus;

    @AndroidFindBy(tagName = "FAVORITE")
    private MobileElement tabFavoite;

    @AndroidFindBy(id = "ib_air_pam")
    private MobileElement trAirPam;

    @AndroidFindBy(id="ib_pln_pascabayar")
    private MobileElement trPLNPascabayar;

    @AndroidFindBy(id = "ib_angsuran")
    private MobileElement trAngsuran;

    @AndroidFindBy(id = "ib_telepon")
    private MobileElement trTelepon;

    @AndroidFindBy(id="ib_tv_berlangganan")
    private MobileElement trTVBerlangganan;

    @AndroidFindBy(id="ib_asuransi")
    private MobileElement trAsuransi;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Kembali']")
    private MobileElement btnBack;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Bayar']")
    private MobileElement btnPay;

    public void bayarAir()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trAirPam.click();
        loaded(By.name("Air/PDAM"),600,"Load Bayar - Air/PDAM Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void bayarPLN()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trPLNPascabayar.click();
        loaded(By.name("PLN Pascabayar"),600,"Load Bayar - PLN Pascabayar Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void bayarAngsuran()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trAngsuran.click();
        loaded(By.name("Angsuran"),600,"Load Bayar - Angsuran Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void bayarTelepon()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trTelepon.click();
        loaded(By.name("Telepon"),600,"Load Bayar - Telepon Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void bayarTV()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trTVBerlangganan.click();
        loaded(By.name("TV Berbayar"),600,"Load Bayar - TV Berbayar Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void bayarAsuransi()
    {
        loaded(By.name("Bayar"),600, "Load Bayar Page");
        trAsuransi.click();
        loaded(By.name("Asuransi"),600,"Load Bayar - TV Asuransi Page");
        waitForVisibilityOf(By.name("Pilih tagihan"),1000);
    }

    public void pay()
    {
        btnPay.click();
        waitForVisibilityOf(By.name("Check Out"),1000);
    }

    public void testActivity()
    {
        ((AndroidDriver) driver).startActivity("com.jatis.ownNgobrol", ".ui.newdesign.ContactsActivity");
        Assert.assertEquals(((AndroidDriver) driver).currentActivity(), ".ui.newdesign.ContactsActivity");

    }




}
