import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

      public WebDriver getDriver() {
            return driver;
      }

      public void setDriver(WebDriver driver) {
            this.driver = driver;
      }

      public WebDriver driver;

      protected void clickOnElement(By locator){
            getDriver().findElement(locator).click();
      }

      protected void waitForElementToBeVisible(By locator){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      }



}
