package technoStudy.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

import java.util.List;

public class TC_505_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_505_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void submenuSocialMedia() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String technoStudyWindowID = driver.getWindowHandle();
        elements.scrollIntoView(elements.socialLinkField);
        String[] socialList = {"facebook", "instagram", "youtube", "linkedin"};
        List<WebElement> socialLinkList = elements.socialLinks;

        int i = 0;
        for (WebElement social : socialLinkList) {
            Assert.assertTrue(social.isDisplayed(), "Logo is not displayed");
            social.click();
            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(technoStudyWindowID)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }
            wait.until(ExpectedConditions.urlToBe(driver.getCurrentUrl()));
            Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(socialList[i]), socialList[i] + " page not displayed!");
            i++;
            driver.close();
            driver.switchTo().window(technoStudyWindowID);
        }
    }
}