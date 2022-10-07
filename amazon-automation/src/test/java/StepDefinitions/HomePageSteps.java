package StepDefinitions;

import CommonUtils.PageObjectManager;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.HomePage;

public class HomePageSteps {

  private final HomePage homePage;

  public HomePageSteps() {
    this.homePage = PageObjectManager.pageFactory().getHomePage(Hooks.driver);
  }

  @Given("I'm on amazon")
  public void onAmazon() {
    Hooks.driver.get("https://www.amazon.com/");
    this.homePage.waitTillSearchVisible();
  }

  @When("I select Search for {string}")
  public void enterSearch(String enterText) {
    WebElement searchInput = this.homePage.getSearchInput();
    searchInput.clear();
    searchInput.sendKeys(enterText);
    searchInput.sendKeys(Keys.ENTER);
  }
}
