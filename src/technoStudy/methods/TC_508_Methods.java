package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

public class TC_508_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_508_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void termOfUse(){
        wait.until(ExpectedConditions.elementToBeClickable(elements.applyNowButton));
        Assert.assertTrue(elements.applyNowButton.isDisplayed(),"Apply Now button is not displayed");
        action.moveToElement(elements.applyNowButton).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.termOfUseFormLink));
        Assert.assertTrue(elements.termOfUseFormLink.isDisplayed(),"Term Of Use button is not displayed");
        action.scrollToElement(elements.termOfUseFormLink).moveToElement(elements.termOfUseFormLink).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.termOfUsePageTitle));
        Assert.assertEquals(elements.termOfUsePageTitle.getText(),"Terms of Use","Terms of Use title is not displayed.");
    }
}
