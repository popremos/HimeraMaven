package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaFrames extends BasePage {

    private String getTextFromHeading() {
        waitForElementToBeVisible(By.xpath(Locators.FRAMES_HEADING));
        return getElementText(By.xpath(Locators.FRAMES_HEADING));
    }

    public DemoQaFrames verifyTextFromHeading() {
        Assertions.assertEquals("This is a sample page",
                getTextFromHeading(), "Heading text is not as expected");
        return this;
    }

    public DemoQaFrames switchToIframe(){
        getDriver().switchTo().frame("frame1");
        return  this;
    }
}
