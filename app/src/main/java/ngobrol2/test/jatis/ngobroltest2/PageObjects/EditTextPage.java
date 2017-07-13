package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

/**
 * Created by Amani on 15/11/2016.

 */
public interface EditTextPage
{

    public boolean enterText(String text, By locator) throws InterruptedException ;

    public String getTextBoxText();

}
