package PageMethods;

import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaBrowserWindow extends BasePage {

    public DemoQaBrowserWindowNewTab clickNewTab(){
        clickOnElement(By.xpath(Locators.NEW_TAB_BUTTON));
        return new DemoQaBrowserWindowNewTab();
    }

    public DemoQaBrowserWindowNewWindow clickNewWindow(){
        clickOnElement(By.xpath(Locators.NEW_WINDOW_BUTTON));
        return new DemoQaBrowserWindowNewWindow();
    }

}
