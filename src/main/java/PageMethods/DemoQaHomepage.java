package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.openqa.selenium.By;

public class DemoQaHomepage extends BasePage {

	public DemoQaElements clickOnElements() {
		scrollToElement(getLocator(Locators.DEMO_QA_SECTION,
				Attributes.DEMO_QA_ELEMENTS));
		clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION,
				Attributes.DEMO_QA_ELEMENTS)));
		return new DemoQaElements();
	}

	public DemoQaHomepage clickOnForms() {
		clickOnElement(By.xpath(getLocator(Locators.DEMO_QA_SECTION,
				Attributes.DEMO_QA_FORMS)));
		return this;
	}
}
