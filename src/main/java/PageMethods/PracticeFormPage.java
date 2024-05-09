package PageMethods;

import Core.Attributes;
import Core.BasePage;
import Core.Locators;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class PracticeFormPage extends BasePage {

	public PracticeFormPage typeFirstName(String textToType) {
		typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID,
				Attributes.PRACTICE_FORM_FIRST_NAME)));
		return this;
	}

	public PracticeFormPage typeLastName(String textToType) {
		typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID,
				Attributes.PRACTICE_FORM_LAST_NAME)));
		return this;
	}

	public PracticeFormPage typeEmail(String textToType) {
		typeText(textToType, By.xpath(getLocator(Locators.INPUT_BY_ID,
				Attributes.PRACTICE_FORM_EMAIL)));
		return this;
	}

	public PracticeFormPage verifyFirstName(String expectedName) {
		Assertions.assertEquals(expectedName,
				getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID,
						Attributes.PRACTICE_FORM_FIRST_NAME))),
				"Text in First name input field is not as expected");
		return this;
	}

	public PracticeFormPage verifyLastName(String expectedLastName) {
		Assertions.assertEquals(expectedLastName,
				getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID,
						Attributes.PRACTICE_FORM_LAST_NAME))),
				"Text in Last name input field is not as expected");
		return this;
	}

	public PracticeFormPage verifyUserMail(String expectedMail) {
		Assertions.assertEquals(expectedMail,
				getElementText(By.xpath(getLocator(Locators.INPUT_BY_ID,
						Attributes.PRACTICE_FORM_EMAIL))),
				"Text in email input field is not as expected");
		return this;
	}
}
