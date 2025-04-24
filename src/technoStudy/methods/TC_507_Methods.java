package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

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
        Assert.assertTrue(elements.learnMoreButtons.size() > 0, "No Learn More buttons found in the Choose a Program section");
        
        WebElement firstLearnMoreButton = elements.learnMoreButtons.get(0);
        
        wait.until(ExpectedConditions.elementToBeClickable(firstLearnMoreButton));
        Assert.assertTrue(firstLearnMoreButton.isDisplayed(), "Learn More button is not displayed");
        
        action.moveToElement(firstLearnMoreButton).click().build().perform();
        
        wait.until(ExpectedConditions.visibilityOf(elements.logo));
        Assert.assertTrue(elements.logo.isDisplayed(), "Techno Study logo is not displayed on the course page");
    }
}
