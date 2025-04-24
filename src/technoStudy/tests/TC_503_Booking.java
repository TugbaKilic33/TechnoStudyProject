package technoStudy.tests;

import org.testng.annotations.*;
import technoStudy.base.BaseDriver;
import technoStudy.methods.TC_503_Methods;

public class TC_503_Booking extends BaseDriver {

    @Test
    @Parameters("BrowserType")
    public void bookingTest() {
        TC_503_Methods methods = new TC_503_Methods(driver, action, wait);
        methods.bookingForm();
    }
}