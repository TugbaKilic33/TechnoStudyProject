package technoStudy.methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;
import utility.ConfigReader;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.and;

public class TC_506_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_506_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void logoToHomePage() {
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        String actualUrl = driver.getCurrentUrl();
        wait.until(ExpectedConditions.visibilityOf(elements.acceptCookiesButton));

        try {
            if (elements.acceptCookiesButton.isDisplayed()) {
                elements.acceptCookiesButton.click();
            }
        } catch (Exception e) {
            System.out.println("Accept Cookies button not displayed");
        }

        Assert.assertEquals(actualUrl, expectedUrl, "URL is not as expected");
        wait.until(ExpectedConditions.elementToBeClickable(elements.logo));
        Assert.assertTrue(elements.logo.isDisplayed(), "Logo is not displayed");
        elements.logo.click();
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo");

        action.moveToElement(elements.programs).build().perform();
        action.moveToElement(elements.sdetLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.programs).build().perform();
        action.moveToElement(elements.dataScienceLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.programs).build().perform();
        action.moveToElement(elements.artificialIntelligenceLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.programs).build().perform();
        action.moveToElement(elements.androidDeveloperLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.aboutUsLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.workWithUsLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.blogsLink).click().build().perform();
        List<WebElement> blogsPageList = elements.blogsList;
        String mainWindow = driver.getWindowHandle();

        for (int i = 1; i < blogsPageList.size(); i++) {
            blogsPageList = elements.blogsList;

            if (i >= blogsPageList.size()) {
                break;
            }

            WebElement currentBlog = blogsPageList.get(i);

            if (i == 19 || i == 20 || i == 21) {
                wait.until(ExpectedConditions.visibilityOf(currentBlog));
                action.moveToElement(currentBlog).click().build().perform();

                for (String windowHandle : driver.getWindowHandles()) {
                    if (!windowHandle.equals(mainWindow)) {
                        driver.switchTo().window(windowHandle);
                        break;
                    }
                }
                driver.close();
                driver.switchTo().window(mainWindow);
            } else {
                ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", currentBlog);
                action.moveToElement(currentBlog).click().build().perform();
            }
            clickToLogoCheckHomePage();

            action.moveToElement(elements.blogsLink).click().build().perform();
            wait.until(ExpectedConditions.visibilityOf(elements.logo));
            and(ExpectedConditions.elementToBeClickable(elements.logo));
        }
        clickToLogoCheckHomePage();

        action.moveToElement(elements.applyNowButton).click().build().perform();
        clickToLogoCheckHomePage();

        action.scrollToElement(elements.codingBootcampLink).build().perform();
        action.moveToElement(elements.codingBootcampLink).click().build().perform();
        clickToLogoCheckHomePage();

        elements.scrollIntoView(elements.termsOfUseLink);
        action.pause(Duration.ofSeconds(1)).build().perform();
        action.moveToElement(elements.termsOfUseLink).click().build().perform();
        clickToLogoCheckHomePage();

        elements.scrollIntoView(elements.privacyPolicyLink);
        action.pause(Duration.ofSeconds(1)).build().perform();
        action.moveToElement(elements.privacyPolicyLink).click().build().perform();
        clickToLogoCheckHomePage();

        elements.scrollIntoView(elements.cookiesPolicyLink);
        action.pause(Duration.ofSeconds(1)).build().perform();
        action.moveToElement(elements.cookiesPolicyLink).click().build().perform();
        clickToLogoCheckHomePage();

        action.moveToElement(elements.programs).build().perform();
        action.moveToElement(elements.mastersProgramLink).click().build().perform();
        clickToLogoCheckHomePage();
    }

    public void clickToLogoCheckHomePage() {
        wait.until(ExpectedConditions.visibilityOf(elements.logo));
        and(ExpectedConditions.elementToBeClickable(elements.logo));
        Assert.assertTrue(elements.logo.isDisplayed());
        elements.logo.click();
        wait.until(ExpectedConditions.visibilityOf(elements.logo));
        and(ExpectedConditions.elementToBeClickable(elements.logo));
        Assert.assertTrue(elements.logo.isDisplayed());
    }
}