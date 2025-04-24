package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_507_Methods;

public class TC_507_CourseDetails extends BaseDriver {

    @Test
    @Parameters({"BrowserType"})
    public void courseDetailsTest() {
        TC_507_Methods methods = new TC_507_Methods(driver, action, wait);
        methods.courseDetails();
    }
}