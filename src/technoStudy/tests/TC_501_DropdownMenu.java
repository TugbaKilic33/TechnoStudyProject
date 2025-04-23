package technoStudy.tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_501_Methods;

public class TC_501_DropdownMenu extends BaseDriver {
@Test
    @Parameters({"BrowserType"})
    public void dropDownMenuTest(){
    TC_501_Methods methods=new TC_501_Methods(driver,action,wait);
    methods.dropDownMenu();
}
}
