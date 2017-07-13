
package ngobrol2.test.jatis.ngobroltest2.Tests;

//import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import ngobrol2.test.jatis.ngobroltest2.AppiumSupport.*;
import ngobrol2.test.jatis.ngobroltest2.PageObjects.*;


/**
 * Created by Amani on 14/11/2016.
 */
public class BaseTest extends AppiumBaseClass
{
    protected NavigationPage navPage;
    protected SpinnerPage spinnerPage;
    protected EditTextPage editTextPage;
    protected WelcomeDialogPage welcomePage;
    protected NgobrolBeliPage beliPage;
    protected NgobrolBayarPage bayarPage;
    protected NgobrolSettingPage settingPage;
    protected NgobrolHomePage homePage;
    protected NgobrolChatPage chatPage;
    protected NgobrolGroupPage groupPage;
    protected NgobrolContactPage contactPage;
    protected NgobrolToolbarPage toolbarPage;
    protected NgobrolUserPage userPage;
    protected ImageGalleryPage imageGalleryPage;
    protected AttachmentPage attachmentPage;
    protected CheckBoxPage checkboxPage;
    protected LoginPage loginPage;

    /**
     * Run before each test
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception
    {
        AppiumController.instance.start();
        navPage = new NavigationPageAndroid(driver());
        spinnerPage =  new SpinnerPageAndroid(driver());
        editTextPage = new EditTextPageAndroid(driver());
        welcomePage = new WelcomeDialogPageAndroid(driver());
        beliPage = new NgobrolBeliPageAndroid(driver());
        bayarPage = new NgobrolBayarPageAndroid(driver());
        settingPage = new NgobrolSettingPageAndroid(driver());
        homePage = new NgobrolHomePageAndroid(driver());
        chatPage = new NgobrolChatPageAndroid(driver());
        groupPage = new NgobrolGroupPageAndroid(driver());
        contactPage = new NgobrolContactPageAndroid(driver());
        toolbarPage = new NgobrolToolbarPageAndroid(driver());
        userPage = new NgobrolUserPageAndroid(driver());
        imageGalleryPage = new ImageGalleryPageAndroid(driver());
        attachmentPage = new AttachmentPageAndroid(driver());
        checkboxPage = new CheckboxPageAndroid(driver());
        loginPage = new LoginPageAndroid(driver());

    }

    /**
     * Run after each test
     */
    @After
    public void tearDown() {
        AppiumController.instance.stop();
    }


    @Rule
    public TestRule printTests = new TestWatcher() {
        protected void starting(Description description) {
            System.out.println("  test: " + description.getMethodName());

        }

    };

    public void dismissDialog()
    {
        welcomePage.dismisDialog();
    }



}
