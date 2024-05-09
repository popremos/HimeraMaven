package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class DemoQaElements extends BasePage {

	public DemoQaElements clickOnTextBox() {
		clickOnElement(By.xpath(getLocator(Locators.SPAN_ELEMENT_BY_TEXT,
				Attributes.DEMO_QA_ELEMENTS_TEXT_BOX)));
		return this;
	}

	public DemoQaElements verifyElementsListIsVisible() {
		Assertions.assertTrue(
				isElementVisible(By.xpath(Locators.ELEMENT_LIST_SHOWN)),
				"Element list is not visible");
		return this;
	}

	public DemoQaElements verifyElementsMenuOptionsCount() {
		Assertions.assertEquals(9, getElementCount(
				"//div[text()='Elements']//ancestor::div[@class='element-group']//ul//li"),
				"Number of options in elements menu is not as expected");

		return this;
	}

}
