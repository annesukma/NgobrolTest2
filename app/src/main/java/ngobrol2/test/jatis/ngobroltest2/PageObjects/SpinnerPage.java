package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

/**
 * Created by Amani on 15/11/2016.
 */
public interface SpinnerPage
{
    public void selectSpinnerAtIndex(int index, By locator);
    public String getSelectedEntry();
    public String getDisplayText();

}
