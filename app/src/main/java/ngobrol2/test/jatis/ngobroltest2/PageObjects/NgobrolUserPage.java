package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 18/01/2017.
 */
public interface NgobrolUserPage
{

    public void viewProfile();

    public MobileElement getDisplayName();

    public MobileElement getDisplaySatatus();

    public void updateStatus();

    public void updateName();

    public void removeAva();

    public void cancelUserUpdate();

    public void updatepProfilePicture();

    public void updatepProfilePictureFromGallery();

}
