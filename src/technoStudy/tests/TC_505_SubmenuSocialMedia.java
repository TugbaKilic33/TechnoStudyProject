package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_505_Methods;

public class TC_505_SubmenuSocialMedia extends BaseDriver {

    @Test(groups = {"regression", "smokeTest"})
    @Parameters("BrowserType")
    public void submenuSocialMediaTest() {
        TC_505_Methods methods = new TC_505_Methods(driver, action, wait);
        methods.submenuSocialMedia();
    }
}