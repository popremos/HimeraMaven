package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaHomepage extends BasePage {




    public void clickOnElements(){
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION, Attributes.DEMO_QA_ELEMENTS)));
    }

    public void clickOnForms(){
        clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION,Attributes.DEMO_QA_FORMS)));
    }

}
