package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import technoStudy.elements.ProjectAllElements;
import utility.ConfigReader;

import java.util.List;
import java.util.Random;

public class TC_503_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;
    Random random = new Random();

    public TC_503_Methods(WebDriver driver, Actions action, WebDriverWait wait) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }

    public void bookingForm() {
        Assert.assertTrue(elements.applyNowButton.isDisplayed(), "Apply Now button is not displayed");

        wait.until(ExpectedConditions.elementToBeClickable(elements.applyNowButton));
        action.moveToElement(elements.applyNowButton).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.nameInput));
        action.moveToElement(elements.nameInput).click().sendKeys(ConfigReader.getProperty("name")).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.emailInput));
        action.moveToElement(elements.emailInput).click().sendKeys(ConfigReader.getProperty("email")).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.phoneInput));
        action.moveToElement(elements.phoneInput).click().sendKeys(ConfigReader.getProperty("phoneNumber")).build().perform();

        Select selectCountry = new Select(elements.countrySelect);
        wait.until(ExpectedConditions.visibilityOf(elements.countrySelect));
        selectCountry.selectByVisibleText(ConfigReader.getProperty("country"));

        wait.until(ExpectedConditions.visibilityOf(elements.courseSelect));
        Select selectCourse = new Select(elements.courseSelect);
        List<WebElement> courseOptions = selectCourse.getOptions();
        int randomCourse = random.nextInt(courseOptions.size() - 1) + 1;
        wait.until(ExpectedConditions.visibilityOf(elements.courseSelect));
        selectCourse.selectByIndex(randomCourse);

        wait.until(ExpectedConditions.visibilityOf(elements.hearAboutUsSelect));
        Select hearAboutUs = new Select(elements.hearAboutUsSelect);
        List<WebElement> hearAboutUsOptions = hearAboutUs.getOptions();
        int randomHearAboutUs = random.nextInt(hearAboutUsOptions.size() - 1) + 1;
        wait.until(ExpectedConditions.visibilityOf(elements.hearAboutUsSelect));
        hearAboutUs.selectByIndex(randomHearAboutUs);

        wait.until(ExpectedConditions.elementToBeClickable(elements.checkBox));
        action.moveToElement(elements.checkBox).click().build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(elements.bookCallButton));
        action.moveToElement(elements.bookCallButton).click().build().perform();

        wait.until(ExpectedConditions.visibilityOf(elements.thankYouMessage));
        Assert.assertTrue(elements.thankYouMessage.getText().contains("Thank"));
    }
}