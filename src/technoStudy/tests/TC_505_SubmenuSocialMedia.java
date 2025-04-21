package technoStudy.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_505_Methods;

public class TC_505_SubmenuSocialMedia extends BaseDriver{

    @Test
    @Parameters("BrowserType")
    public void submenuSocialMediaTest(){
        TC_505_Methods methods = new TC_505_Methods(driver, action, wait);
        methods.submenuSocialMedia();

    }
}
