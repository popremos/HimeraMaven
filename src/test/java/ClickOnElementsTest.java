import PageMethods.DemoQaHomepage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClickOnElementsTest extends DemoQaHomepage {


    @BeforeEach
    public void setUp(){
        createDriver();
        getDriver().navigate().to("https://demoqa.com");
    }


    @Test
    public void test(){
        DemoQaHomepage demo = new DemoQaHomepage();
        demo.clickOnElements();
    }

    @AfterEach
    public void close(){
      quitDriver();
    }

}
