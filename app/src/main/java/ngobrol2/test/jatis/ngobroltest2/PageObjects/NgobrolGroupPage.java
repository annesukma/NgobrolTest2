package ngobrol2.test.jatis.ngobroltest2.PageObjects;

import org.openqa.selenium.By;

import java.util.List;

import io.appium.java_client.MobileElement;

/**
 * Created by Amani on 03/01/2017.
 */
public interface NgobrolGroupPage
{
    public void newGroup();

    public void create();

    public void selectContactAtIndex(int index);

    public void selectGroupAtIndex(int index);

    public void chatGroup();

    public void waifForDetailGroupActivity();

    public void leaveGroup();

    public void viewMember();

    public void editGroup();

    public void checkUpdateGroupButton();

    public void cancelUpdateGroup();

    public void memberDetails();

    public void setMemberAsAdmin();

    public void removeUser();

    public String getGroupDetailName();

    public void sendMessage();

    public void cancelToCreateGroup();

    public void addMember(int index);

    public void checkGroup();


}
