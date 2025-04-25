package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_508_Methods;

public class TC_508_TermsOfUse extends BaseDriver {

    @Test(groups = "regression")
    public void termOfUseTest() {
        TC_508_Methods methods = new TC_508_Methods(driver, action, wait);
        methods.termOfUse();
    }
}