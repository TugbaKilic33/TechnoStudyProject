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
    /// TC_501_Elements
    @FindBy(xpath = "//h1[text()='SOFTWARE DEVELOPMENT']")
    public WebElement softwareHomepage; //software ana sayfasındaki yazı
    @FindBy(xpath = "//h1[text()='Data Science Bootcamp']")
    public WebElement dataScienceHomepage; //dataScience ana sayfasındaki yazı
    @FindBy(xpath = "//h1[contains(text(),'Artificial Intelligence')]")
    public WebElement articialHomepage; //artificialIntelligence ana sayfasındaki yazı
    @FindBy(xpath = "//div[@data-elem-type='text']//h1")
    public WebElement androidDevHomepage; //AndroidDeveloper ana sayfasındaki yazı
    @FindBy(xpath = "//h1[@class='tn-atom']/strong")
    public WebElement masterHomepage; //masterDegree ana sayfasındaki yazı














































































    /// TC_502_Elements
    @FindBy(xpath = "//a[text()='SIGN IN']")
    public WebElement signInButton;

    @FindBy(xpath = "//img")
    public WebElement campusPageLogo;














































































    /// TC_503_Elements
    @FindBy(xpath="//a[@class='tn-atom js-click-zero-stat']")
    public WebElement applyNowButton; // Apply Now butonu
    @FindBy(xpath="//input[@name='name']")
    public WebElement nameInput; //Full name kısmı
    @FindBy(xpath="//input[@name='email']")
    public WebElement emailInput; //Email kısmı
    @FindBy(xpath="//input[@type='tel']")
    public WebElement phoneInput; //Phone kısmı
    @FindBy(xpath="//select[@name='country']")
    public WebElement countrySelect; //Country seçim kısmı
    @FindBy(xpath="//select[@name='course']")
    public WebElement courseSelect; //Course seçim kısmı
    @FindBy(xpath="//select[@name='survey']")
    public WebElement hearAboutUsSelect; //How did you hear about us kısmı
    @FindBy(xpath="//div[@class='t-checkbox__indicator']")
    public WebElement checkBox; //CheckBox onaylama kısmı
    @FindBy(xpath="(//button[@type='submit'])[2]")
    public WebElement bookCallButton; //Book a call butonu
    @FindBy(xpath="(//span[text()='Thank you for your pre-application! '])[2]")
    public WebElement thankYouMessage; //Teşekkür mesajı












































































    /// TC_504_Elements












































































    /// TC_505_Elements
    @FindBy(className = "t-sociallinks")
    public WebElement socialLinkField; ///sosyal medya bölümü

    @FindBy(xpath = "//div[@class='t-sociallinks']//li")
    public List<WebElement> socialLinks ; /// sosyal medya linkleri





































































    /// TC_506_Elements⭐⭐⭐
    /// logo to home page locators⭐⭐
    @FindBy(xpath = "//div[@class='t972__actions']//button[@data-buttonfieldset='button']")
    public WebElement acceptCookiesButton; ///accept cookies button

    @FindBy(xpath = "//*[@class='t228__imglogo ']")
    public WebElement logo; ///logo

    /// header menu locators⭐⭐
    @FindBy(xpath = "//li//a[@class='t-menu__link-item t966__tm-link']")
    public WebElement programs;
    ///ana menu programs

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Software Development Engineer in Test']")
    public WebElement sdetLink;
    ///sdet link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Data Science Bootcamp']")
    public WebElement dataScienceLink;
    ///data science link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Artificial Intelligence']")
    public WebElement artificialIntelligenceLink;
    ///artificial intelligence link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[text()='Android Developer Bootcamp']")
    public WebElement androidDeveloperLink;
    ///android developer link programs alt menu

    @FindBy(xpath = "//div[@class='t966__menu-item-text']//*[contains(text(), 'Master')]")
    public WebElement mastersProgramLink;
    ///master's Program link programs alt menu

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='About Us']")
    public WebElement aboutUsLink; ///ana menu about us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Work With Us']")
    public WebElement workWithUsLink; ///ana menu work with us

    @FindBy(xpath = "//li[@class='t228__list_item']//a[text()='Blogs']")
    public WebElement blogsLink; ///ana menu blogs

    @FindBy(xpath = "//span[@class='t585__title t-name t-name_xl']//a")
    public WebElement codingBootcampLink; ///coding bootcamps worth it link ana menu

    ///  footer menu locators⭐⭐

    @FindBy(xpath= "//li//a[text()='Terms of Use']")
    public WebElement termsOfUseLink; ///footer menu terms of use

    @FindBy(xpath = "//li//a[text()='Privacy Policy']")
    public WebElement privacyPolicyLink; ///footer menu privacy policy

    @FindBy(xpath = "//li//a[text()='Cookies Policy']")
    public WebElement cookiesPolicyLink; ///footer menu cookies policy

    @FindBy(xpath= "//span[@class='js-feed-post-date t-feed__post-date t-uptitle t-uptitle_xs']")
    public List<WebElement> blogsList ; /// bloglarin listesi ->  blogs sayfasinda











    /// TC_507_Elements












































































    /// TC_508_Elements

    @FindBy(xpath = "(//a[text()='Terms of Use'])[1]")
    public WebElement termOfUseFormLink;

    @FindBy(xpath = "//strong[text()='Terms of Use']")
    public WebElement termOfUsePageTitle;









































































    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
