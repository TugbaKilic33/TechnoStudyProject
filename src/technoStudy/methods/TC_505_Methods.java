package technoStudy.methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import technoStudy.elements.ProjectAllElements;

public class TC_505_Methods {
    WebDriver driver;
    Actions action;
    WebDriverWait wait;
    ProjectAllElements elements;

    public TC_505_Methods(WebDriver driver, Actions action, WebDriverWait wait, ProjectAllElements elements) {
        this.driver = driver;
        this.action = action;
        this.wait = wait;
        this.elements = new ProjectAllElements(driver);
    }
}
