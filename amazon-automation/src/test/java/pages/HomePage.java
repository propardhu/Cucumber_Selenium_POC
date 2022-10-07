package pages;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
  public HomePage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public final ById searchInput = new ById("twotabsearchtextbox");

  public WebElement getSearchInput() {
    return waitForElement(searchInput,30);
  }

  public void waitTillSearchVisible() {
    waitForElementToBeVisible(searchInput);
  }
}
