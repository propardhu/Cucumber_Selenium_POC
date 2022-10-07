package StepDefinitions;

import CommonUtils.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.SearchResultPage;

public class SearchPageSteps {
  public final SearchResultPage searchResultPage;

  public SearchPageSteps() {
    this.searchResultPage = PageObjectManager.pageFactory().getSearchResultPage(Hooks.driver);
  }

  @Then("I'm on result page")
  public void onResultPage(){
    this.searchResultPage.waitTillLogoVisible();
  }

  @And("I click on item")
  public void clickOnItem() throws InterruptedException {
    WebElement btn = this.searchResultPage.getItem();
    btn.click();
    Hooks.driver.wait(300);
  }
}
