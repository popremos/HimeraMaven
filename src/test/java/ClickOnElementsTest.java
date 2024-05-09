import PageMethods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This tests opens "demoqa..." and clicks on "Elements" section
 *
 *
 * @author vgasic
 */
public class ClickOnElementsTest extends DemoQaHomepage {

	@BeforeEach
	public void setUp() {
		createDriver();
		getDriver().navigate().to("https://demoqa.com");
	}

	@Test
	public void test() {
		DemoQaHomepage demo = new DemoQaHomepage();
		demo.clickOnElements().verifyElementsListIsVisible()
				.verifyElementsMenuOptionsCount();
	}

	@AfterEach
	public void close() {
		quitDriver();
	}

}
