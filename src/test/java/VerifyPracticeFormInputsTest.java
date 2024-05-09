import PageMethods.DemoQaHomepage;
import PageMethods.PracticeFormPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VerifyPracticeFormInputsTest extends PracticeFormPage {

	private final static String FIRST_NAME = "Vlada";
	private final static String LAST_NAME = "Gasic";
	private final static String EMAIL = "testmejl@fake.com";

	@BeforeEach
	public void setUp() {
		createDriver();
		getDriver().navigate()
				.to("https://demoqa.com/automation-practice-form");
	}

	@Test
	public void test() {
		PracticeFormPage practiceFormPage = new PracticeFormPage();
		practiceFormPage.typeFirstName(FIRST_NAME)
				.verifyFirstName(FIRST_NAME)
				.typeLastName(LAST_NAME).verifyLastName(LAST_NAME)
				.typeEmail(EMAIL).verifyUserMail(EMAIL);
	}

	@AfterEach
	public void close() {
		quitDriver();
	}

}
