package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_502_Methods;

public class TC_502_CrossCampus extends BaseDriver {

    @Test
    @Parameters("BrowserType")
    public void crossCampusTest() {
        TC_502_Methods methods = new TC_502_Methods(driver, action, wait);
        methods.crossCampus();
    }
}