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
            waitForElementToBeVisible(locator);
            getDriver().findElement(locator).click();
      }

      protected void waitForElementToBeVisible(By locator){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      }

      protected void typeText(String text, By locator){
            waitForElementToBeVisible(locator);
            getDriver().findElement(locator).sendKeys(text);
      }

      protected String getElementText(By locator){
            waitForElementToBeVisible(locator);
           return  getDriver().findElement(locator).getText();
      }

}
