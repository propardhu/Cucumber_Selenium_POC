package pages;

import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage{

  public SearchResultPage(WebDriver driver) {
    super(driver);
    PageFactory.initElements(driver, this);
  }

  public final ById logoBtn = new ById("nav-logo-sprites");

  public final ByXPath item = new ByXPath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div[2]/div[2]/h2/a");

  public WebElement getItem() {
    return waitForElement(item,30);
  }

  public WebElement getLogoBtn() {
    return waitForElement(logoBtn,30);
  }

  public void waitTillLogoVisible() {
    waitForElementToBeVisible(logoBtn);
  }
}
