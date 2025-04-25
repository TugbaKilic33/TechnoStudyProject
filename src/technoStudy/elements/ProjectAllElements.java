package technoStudy.elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProjectAllElements {
    WebDriver driver;

    public ProjectAllElements(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='SOFTWARE DEVELOPMENT']")
    public WebElement softwareHomepage;

    @FindBy(xpath = "//h1[text()='Data Science Bootcamp']")
    public WebElement dataScienceHomepage;

    @FindBy(xpath = "//h1[contains(text(),'Artificial Intelligence')]")
    public WebElement artificialHomepage;

    @FindBy(xpath = "//div[@data-elem-type='text']//h1")
    public WebElement androidDevHomepage;

    @FindBy(xpath = "//h1[@class='tn-atom']/strong")
    public WebElement masterHomepage;

    @FindBy(xpath = "//a[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(xpath = "//img")
    public WebElement campusPageLogo;

    @FindBy(xpath = "//a[@class='tn-atom js-click-zero-stat']")
    public WebElement applyNowButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phoneInput;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countrySelect;

    @FindBy(xpath = "//select[@name='course']")
    public WebElement courseSelect;

    @FindBy(xpath = "//select[@name='survey']")
    public WebElement hearAboutUsSelect;

    @FindBy(xpath = "//div[@class='t-checkbox__indicator']")
    public WebElement checkBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement bookCallButton;

    @FindBy(xpath = "(//span[text()='Thank you for your pre-application! '])[2]")
    public WebElement thankYouMessage;

    @FindBy(xpath = "//span[normalize-space()='Our Blog']")
    public WebElement ourBlog;

    @FindBy(xpath = "(//div[@class='t-feed__post-bgimg t-bgimg loaded'])[1]")
    public WebElement manualTesting;

    @FindBy(xpath = "//strong[normalize-space()='Importance of Manual Testing']")
    public WebElement blockLettering;

    @FindBy(xpath = "(//div[@class='t-feed__post-bgimg t-bgimg loaded'])[2]")
    public WebElement flawlessSoftware;

    @FindBy(xpath = "//strong[normalize-space()='Why the STLC is Crucial for Software Success']")
    public WebElement modernSDLC;

    @FindBy(xpath = "(//div[@class='t-feed__post-bgimg t-bgimg loaded'])[3]")
    public WebElement trendsInnovations;

    @FindBy(xpath = "//strong[normalize-space()='The Evolution of Automated QA Testing:']")
    public WebElement poweredTesting;

    @FindBy(className = "t-sociallinks")
    public WebElement socialLinkField;

    @FindBy(xpath = "//div[@class='t-sociallinks']//li")
    public List<WebElement> socialLinks;

    @FindBy(xpath = "//div[@class='t972__actions']//button[@data-buttonfieldset='button']")
    public WebElement acceptCookiesButton;

    @FindBy(xpath = "//*[@class='t228__imglogo ']")
    public WebElement logo;

    @FindBy(xpath = "//li//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programs;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Software Development Engineer in Test']")
    public WebElement sdetLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Data Science Bootcamp']")
    public WebElement dataScienceLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Artificial Intelligence']")
    public WebElement artificialIntelligenceLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Android Developer Bootcamp']")
    public WebElement androidDeveloperLink;

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[contains(text(), 'Master')]")
    public WebElement mastersProgramLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='About Us']")
    public WebElement aboutUsLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Work With Us']")
    public WebElement workWithUsLink;

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Blogs']")
    public WebElement blogsLink;

    @FindBy(xpath = "//span[@class='t585__title t-name t-name_xl']//a")
    public WebElement codingBootcampLink;

    @FindBy(xpath = "//li//a[text()='Terms of Use']")
    public WebElement termsOfUseLink;

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    public WebElement privacyPolicyLink;

    @FindBy(xpath = "//li//a[text()='Cookies Policy']")
    public WebElement cookiesPolicyLink;

    @FindBy(xpath = "//span[@class='js-feed-post-date t-feed__post-date t-uptitle t-uptitle_xs']")
    public List<WebElement> blogsList;

    @FindBy(xpath = "//h2[text()='Choose a program']")
    public WebElement chooseProgramTitle;

    @FindBy(xpath = "//a[text()='Learn more']")
    public List<WebElement> learnMoreButtons;

    @FindBy(xpath = "(//a[text()='Terms of Use'])[1]")
    public WebElement termOfUseFormLink;

    @FindBy(xpath = "//strong[text()='Terms of Use']")
    public WebElement termOfUsePageTitle;

    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}