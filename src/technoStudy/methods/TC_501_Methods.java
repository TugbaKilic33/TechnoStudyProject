package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

public class TC_501_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_501_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void dropDownMenu() {
        action.moveToElement(elements.programs).build().perform();
        elements.sdetLink.click();
        wait.until(ExpectedConditions.visibilityOf(elements.softwareHomepage));
        Assert.assertTrue(elements.softwareHomepage.isDisplayed(), "No text found");

        action.moveToElement(elements.programs).build().perform();
        elements.dataScienceLink.click();
        wait.until(ExpectedConditions.visibilityOf(elements.dataScienceHomepage));
        Assert.assertTrue(elements.dataScienceHomepage.isDisplayed(), "No text found");

        action.moveToElement(elements.programs).build().perform();
        elements.artificialIntelligenceLink.click();
        wait.until(ExpectedConditions.visibilityOf(elements.artificialHomepage));
        Assert.assertTrue(elements.artificialHomepage.isDisplayed(), "No text found");

        action.moveToElement(elements.programs).build().perform();
        elements.androidDeveloperLink.click();
        wait.until(ExpectedConditions.visibilityOf(elements.androidDevHomepage));
        Assert.assertTrue(elements.androidDevHomepage.isDisplayed(), "No text found");

        action.moveToElement(elements.programs).build().perform();
        elements.mastersProgramLink.click();
        wait.until(ExpectedConditions.visibilityOf(elements.masterHomepage));
        Assert.assertTrue(elements.masterHomepage.isDisplayed(), "No text found");
    }
}