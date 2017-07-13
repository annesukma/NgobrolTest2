package ngobrol2.test.jatis.ngobroltest2.PageObjects;

/**
 * Created by Amani on 15/11/2016.
 */
public interface NgobrolBeliPage
{
    public void beliPulsa();

    public void beliPLN();

    public void topUpWallet();

    public void swipePage() throws InterruptedException;

    public void buy();

    public void back();

    public void loaded();

    public String getTextBoxText();

    public void selectContactNumber();

    public void clear();

    public void waitNominal();

    public String getLabelProviderStatus();

}
