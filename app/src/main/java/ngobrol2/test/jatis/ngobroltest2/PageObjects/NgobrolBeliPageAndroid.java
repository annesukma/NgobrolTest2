package ngobrol2.test.jatis.ngobroltest2.PageObjects;
import static ngobrol2.test.jatis.ngobroltest2.util.Helpers.*;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.AppiumBasePage;

import org.openqa.selenium.By;

/**
 * Created by Amani on 15/11/2016.
 */
public class NgobrolBeliPageAndroid extends AppiumBasePage implements NgobrolBeliPage
{
    public NgobrolBeliPageAndroid(AndroidDriver driver)
    {
        super(driver);
    }

    @AndroidFindBy(tagName = "TRANSAKSI")
    private MobileElement tabBeli;

    @AndroidFindBy(tagName = "CEK STATUS")
    private MobileElement tabStatus;

    @AndroidFindBy(tagName = "FAVORIT")
    private MobileElement tabFavorite;

    @AndroidFindBy(id="ib_pulsa")
    private MobileElement trPulsa;

    @AndroidFindBy(id = "ib_pln_prabayar")
    private MobileElement trPLN;

    @AndroidFindBy(id="ib_topup_wallet")
    private MobileElement trTopUpWallet;

    @AndroidFindBy(id = "b_contact")
    private MobileElement selectNumber;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Kembali']")
    private MobileElement btnBack;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Beli']")
    private MobileElement btnBuy;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/txtTargetMSISDN")
    private MobileElement numberField;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/b_clear")
    private MobileElement btnClear;

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Kartu Debit']")
    private  MobileElement kartuDebit;

    @AndroidFindBy(xpath = "//android.widget.Image[@resource-id='btnKembali']")
    private MobileElement btnKembali;

    @AndroidFindBy(xpath = "//android.widget.Button[@resource-id='btnSubmit']")
    private MobileElement btnSubmit;

    @AndroidFindBy(id = "com.jatis.ownNgobrol2:id/lblProviderStep1")
    private MobileElement labelProvider;

    public void clear()
    {
        btnClear.click();
    }

    public void back()
    {
        btnBack.click();
    }



    public void beliPulsa()
    {
        trPulsa.click();
        waitForVisibilityOf(By.name("Beli"),1000);

    }
    public void buy()
    {
        btnBuy.click();
        waitForVisibilityOf(By.xpath("//android.view.View[@content-desc='CHECKOUT']"),1000);
        kartuDebit.click();
    }


    public void waitNominal()
    {
        waitForClickabilityOf(By.id("ddlTopUpNominal"),1000);
    }

    public void selectContactNumber()
    {
        selectNumber.click();
    }

    public void beliPLN()
    {
        trPLN.click();
        waitForClickabilityOf(By.id("ddlBillName"),1000);

    }

    public void topUpWallet()
    {

    }

    public void swipePage() throws InterruptedException
    {

        size = driver.manage().window().getSize();
        System.out.println(size);


        int startx = (int) (size.width * 0.80);
        int endx = (int) (size.width * 0.20);

        int starty = size.height / 2;

        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //waitElement();
        driver.swipe(startx, starty, endx, starty, 400); // it swipes from right to left
        System.out.println("Swipe from rignt to left - sucess");
        Thread.sleep(2000);
        driver.swipe(endx, starty, startx, starty, 400); // it swiptes from left to right
        System.out.println("Swipe from left to right - sucess");

    }

    public void loaded()
    {
        try {
            waitForVisibilityOf(By.name("Beli"),1000);
            System.out.println("Beli Page has loaded");
        }
        catch (Exception e)
        {
            System.out.println("Failed to load beli page");
        }
    }

    public String getTextBoxText(){

        return numberField.getText();

    }

    public String getLabelProviderStatus()
    {
        return labelProvider.getAttribute("name");
    }




}
