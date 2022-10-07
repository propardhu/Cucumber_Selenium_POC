package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
  private static WebDriver driver;
  public static final int TIMEOUT_PERIOD_LONG = 30;

  public BasePage(WebDriver driver) {
    this.driver = driver;
  }

  public WebElement waitForElement(By element, long timeout) {
    WebElement myElement = null;
    try {
      myElement = new WebDriverWait(driver, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(element));
    } catch (TimeoutException toe) {
      System.out.println(toe);
    } finally {
      if (myElement == null) {
        String str = "Unable to find the WebElement in the web page by using its locator";
        System.out.println(str);
      }
    }
    return myElement;
  }

  public void waitForElementToBeVisible(ById element){
    WebElement myElement = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(element));
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOf(myElement));
  }

  public void waitForElementToBeVisible(ByXPath element){
    WebElement myElement = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(element));
    WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
    wait.until(ExpectedConditions.visibilityOf(myElement));
  }
}

