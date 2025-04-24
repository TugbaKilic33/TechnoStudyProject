package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;
import utility.ConfigReader;

import java.util.List;

public class TC_507_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_507_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void courseDetails() {
        wait.until(ExpectedConditions.visibilityOf(elements.chooseProgramTitle));
        elements.scrollIntoView(elements.chooseProgramTitle);
        Assert.assertTrue(elements.chooseProgramTitle.isDisplayed(), "Choose a Program section is not displayed");
        List<WebElement> learnMoreButtonsList = elements.learnMoreButtons;

        for (int i = 0; i < learnMoreButtonsList.size(); i++) {
            Assert.assertTrue(elements.learnMoreButtons.get(i).isDisplayed(), "Learn More button is not displayed");
            action.moveToElement(elements.learnMoreButtons.get(i)).click().build().perform();

            wait.until(ExpectedConditions.visibilityOf(elements.logo));
            Assert.assertTrue(elements.logo.isDisplayed(), "Techno Study logo is not displayed on the course page");
            elements.logo.click();

            wait.until(ExpectedConditions.urlToBe(ConfigReader.getProperty("homePageUrl")));
            Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("homePageUrl"), "URL does not match the expected home page URL");
            elements.scrollIntoView(elements.chooseProgramTitle);
        }
    }
}