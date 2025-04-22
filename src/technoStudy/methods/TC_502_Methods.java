package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

public class TC_502_Methods {

    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_502_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void crossCampus(){

        wait.until(ExpectedConditions.elementToBeClickable(elements.signInButton));
        Assert.assertTrue(elements.signInButton.isDisplayed(),"Sign In button is not displayed.");
        action.moveToElement(elements.signInButton).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.campusPageLogo));
        Assert.assertTrue(elements.campusPageLogo.isDisplayed(),"Campus page logo is not displayed.");








    }
}
