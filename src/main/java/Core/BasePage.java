package Core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasePage extends Properties{

      protected void clickOnElement(By locator){
            waitForElementToBeVisible(locator);
            getDriver().findElement(locator).click();
      }

      protected void waitForElementToBeVisible(By locator){
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(7));
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

      protected String getLocator(String locator, String arg){
         return  locator.replace("%ARG%", arg);
      }

      protected boolean isElementVisible(By locator){
            boolean isVisible = true;
            try{
                  waitForElementToBeVisible(locator);
            }catch (Exception e){
                  isVisible = false;
            }
            return isVisible;
      }

      private  void scrollToElement(WebDriver driver, WebElement element) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(true);"
                    , element);
      }

      private  WebElement findElement(WebDriver driver, By by) {
            return driver.findElement(by);
      }

      public void scrollToElement(String locator){
            scrollToElement(getDriver(),
                    findElement(getDriver(),By.xpath(locator)) );
      }

      protected int getElementCount(String locator){
            List<WebElement> webElements = getDriver()
                    .findElements(By.xpath(locator));
            return webElements.size();
      }
}
