package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;

public class TC_504_Methods {

    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_504_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void blogPage() {

        wait.until(ExpectedConditions.elementToBeClickable(elements.blogsLink));
        elements.blogsLink.click();


       wait.until(ExpectedConditions.visibilityOf(elements.ourBlog));
       Assert.assertTrue(elements.ourBlog.isDisplayed(),"Our Blog");

       elements.manualTesting.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.blogsLink));

        wait.until(ExpectedConditions.visibilityOf(elements.blockLettering));
        Assert.assertTrue(elements.blockLettering.isDisplayed(),"Importance of Manual Testing");

        elements.blogsLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.blogsLink));

        wait.until(ExpectedConditions.visibilityOf(elements.flawlessSoftware));
        elements.flawlessSoftware.click();

        wait.until(ExpectedConditions.visibilityOf(elements.modernSDLC));
        Assert.assertTrue(elements.modernSDLC.isDisplayed(),"Importance of Manual Testing");

        elements.blogsLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.blogsLink));

        elements.blogsLink.click();
        wait.until(ExpectedConditions.elementToBeClickable(elements.blogsLink));

        wait.until(ExpectedConditions.visibilityOf(elements.trendsInnovations));
        elements.trendsInnovations.click();

        wait.until(ExpectedConditions.visibilityOf(elements.poweredTesting));
        Assert.assertTrue(elements.poweredTesting.isDisplayed(),"The Evolution of Automated QA Testing:");
    }
}