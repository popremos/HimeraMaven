import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PageMethods.DemoQaBrowserWindow;

public class ClickOnBrowserWindowsNewTabTest extends DemoQaBrowserWindow {

    @BeforeEach
    public void setUp() {
        createDriver();
        getDriver().navigate().to("https://demoqa.com/browser-windows");
    }

    @Test
    public void test() {
      DemoQaBrowserWindow demoQaBrowserWindow = new DemoQaBrowserWindow();
      demoQaBrowserWindow.clickNewTab()
              .switchToNewlyOpenedTab().verifyTextFromHeading();
    }

    @AfterEach
    public void close() {
        quitDriver();
    }
}
