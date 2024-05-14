import PageMethods.DemoQaFrames;
import PageMethods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class VerifyFormHeadingTextTest extends DemoQaFrames {

    @BeforeEach
    public void setUp() {
        createDriver();
        getDriver().navigate().to("https://demoqa.com/frames");
    }


    @Test
    public void test() {
        DemoQaFrames demoQaFrames = new DemoQaFrames();
        demoQaFrames.switchToIframe().verifyTextFromHeading();
    }

    @AfterEach
    public void close() {
        quitDriver();
    }
}
