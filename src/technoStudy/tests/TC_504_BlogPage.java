package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_504_Methods;

public class TC_504_BlogPage extends BaseDriver {

    @Test(groups = "regression")
    @Parameters("BrowserType")
    public void blogPage() {
        TC_504_Methods methods = new TC_504_Methods(driver, action, wait);
        methods.blogPage();
    }
}