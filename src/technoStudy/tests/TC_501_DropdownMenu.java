package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_501_Methods;

public class TC_501_DropdownMenu extends BaseDriver {

    @Test(groups = {"regression", "smokeTest"})
    @Parameters("BrowserType")
    public void dropDownMenuTest() {
        TC_501_Methods methods = new TC_501_Methods(driver, action, wait);
        methods.dropDownMenu();
    }
}