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

import java.util.List;

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
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo");

        action.moveToElement(elements.programs).build().perform();
        clickMenuItemAndReturn(elements.sdetLink, ConfigReader.getProperty("sdetUrl"));

        action.moveToElement(elements.programs).build().perform();
        clickMenuItemAndReturn(elements.dataScienceLink, ConfigReader.getProperty("dataScienceUrl"));

        action.moveToElement(elements.programs).build().perform();
        clickMenuItemAndReturn(elements.artificialIntelligenceLink, ConfigReader.getProperty("artificialIntelligenceUrl"));

        action.moveToElement(elements.programs).build().perform();
        clickMenuItemAndReturn(elements.androidDeveloperLink, ConfigReader.getProperty("androidDeveloperUrl"));

        action.moveToElement(elements.programs).build().perform();
        clickMenuItemAndReturn(elements.mastersProgramLink, ConfigReader.getProperty("mastersProgramUrl"));

        clickMenuItemAndReturn(elements.aboutUsLink, ConfigReader.getProperty("aboutUsUrl"));
        clickMenuItemAndReturn(elements.workWithUsLink, ConfigReader.getProperty("workWithUsUrl"));

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
                action.moveToElement(currentBlog).click().build().perform();

                for (String windowHandle : driver.getWindowHandles()) {
                    if (!windowHandle.equals(mainWindow)) {
                        driver.switchTo().window(windowHandle);
                        break;
                    }
                }
                wait.until(ExpectedConditions.urlToBe(driver.getCurrentUrl()));

                driver.close();
                driver.switchTo().window(mainWindow);
            } else {
                ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", currentBlog);
                action.moveToElement(currentBlog).click().build().perform();
            }
            wait.until(ExpectedConditions.urlToBe(driver.getCurrentUrl()));
            wait.until(ExpectedConditions.visibilityOf(elements.logo));
            wait.until(ExpectedConditions.elementToBeClickable(elements.logo));
            Assert.assertTrue(elements.logo.isDisplayed(), "Logo is not displayed");
            elements.logo.click();

            wait.until(ExpectedConditions.urlToBe(expectedUrl));
            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "URL is not as expected after clicking the logo again");

            action.moveToElement(elements.blogsLink).click().build().perform();
            wait.until(ExpectedConditions.urlToBe(ConfigReader.getProperty("blogsUrl")));
            Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("blogsUrl"), "URL is not as expected after clicking the Blogs link");
        }
        clickMenuItemAndReturn(elements.logo, ConfigReader.getProperty("homePageUrl"));
        clickMenuItemAndReturn(elements.applyNowButton, ConfigReader.getProperty("applyNowUrl"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elements.codingBootcampLink);
        clickMenuItemAndReturn(elements.codingBootcampLink, ConfigReader.getProperty("codingBootcampUrl"));

        elements.scrollIntoView(elements.termsOfUseLink);
        clickMenuItemAndReturn(elements.termsOfUseLink, ConfigReader.getProperty("termsOfUseUrl"));

        elements.scrollIntoView(elements.privacyPolicyLink);
        clickMenuItemAndReturn(elements.privacyPolicyLink, ConfigReader.getProperty("privacyPolicyUrl"));

        elements.scrollIntoView(elements.cookiesPolicyLink);
        clickMenuItemAndReturn(elements.cookiesPolicyLink, ConfigReader.getProperty("cookiesPolicyUrl"));
    }

    public void clickMenuItemAndReturn(WebElement menuItem, String getExpectedUrl) {
        wait.until(ExpectedConditions.visibilityOf(menuItem));
        wait.until(ExpectedConditions.elementToBeClickable(menuItem));

        String currentUrl = driver.getCurrentUrl();

        if (!currentUrl.equals(getExpectedUrl)) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", menuItem);
            ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('target')", menuItem);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", menuItem);

            wait.until(ExpectedConditions.urlToBe(getExpectedUrl));
            Assert.assertEquals(driver.getCurrentUrl(), getExpectedUrl, "URL is not as expected after clicking the menu item");
        }

        wait.until(ExpectedConditions.visibilityOf(elements.logo));
        wait.until(ExpectedConditions.elementToBeClickable(elements.logo));
    }
}