package ngobrol2.test.jatis.ngobroltest2.Tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 18/01/2017.
 */
public class UserTest extends BaseTest
{
    private String status = "Hello";
    private String nama = "Sukma";
    private String namaUpdate = "Anne Sukma";


    @Test
    public void updateStatus() throws InterruptedException
    {
        dismissDialog();
        userPage.viewProfile();
        editTextPage.enterText(status, By.id("com.jatis.ownNgobrol2:id/edit_status"));
        userPage.updateStatus();
        MobileElement displayStatus = userPage.getDisplaySatatus();
        Assert.assertEquals("Update Status - Fail",status,displayStatus.getText());
        System.out.println("Update Status - Succes");
    }

    @Test
    public void updateName() throws InterruptedException
    {
        dismissDialog();
        userPage.viewProfile();
        editTextPage.enterText(nama, By.id("com.jatis.ownNgobrol2:id/edit_name"));
        userPage.updateName();
        MobileElement displayName = userPage.getDisplayName();
        Assert.assertEquals("Update Display Name - Fail",nama, displayName.getText());
        System.out.println("Update Status - Succes");
    }

    @Test
    public void removeAva()
    {
        dismissDialog();
        userPage.viewProfile();
        userPage.removeAva();
    }

    @Test
    public void cancelProfileUpdate() throws InterruptedException
    {
        dismissDialog();
        userPage.viewProfile();
        editTextPage.enterText(namaUpdate, By.id("com.jatis.ownNgobrol2:id/edit_name"));
        userPage.cancelUserUpdate();
        MobileElement displayName = userPage.getDisplayName();
        Assert.assertEquals("Cancel Profile Update  - Fail",nama,displayName.getText());
        System.out.println("Cancel Profile Update - Succes");
    }

    @Test
    public void updateProfilePicture()
    {
        dismissDialog();
        userPage.viewProfile();
        userPage.updatepProfilePicture();
    }

    @Test
    public void updateProfilePictureFromGallery()
    {
        dismissDialog();
        userPage.viewProfile();
        userPage.updatepProfilePictureFromGallery();
        Assert.assertTrue(imageGalleryPage.imageGalleryIsDisplayed());
        System.out.println("Gallery Preview - Success");
    }

}
