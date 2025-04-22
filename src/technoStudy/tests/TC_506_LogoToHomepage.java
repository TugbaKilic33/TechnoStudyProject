package technoStudy.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_506_Methods;

public class TC_506_LogoToHomepage extends BaseDriver {

    @Test(groups = "smokeTest")
    @Parameters("BrowserType")
    public void logoToHomePageTest() {
        TC_506_Methods methods = new TC_506_Methods(driver, action, wait);
        methods.logoToHomePage();
    }
}