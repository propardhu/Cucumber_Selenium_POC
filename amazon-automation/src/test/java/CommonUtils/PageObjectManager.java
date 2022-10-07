package CommonUtils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultPage;

/**
 * @author x250129
 */
public class PageObjectManager {
    private static PageObjectManager instance = null;

    private PageObjectManager() {
    }

    public static PageObjectManager pageFactory() {
        // To ensure only one instance is created
        if (instance == null) {
            instance = new PageObjectManager();
        }
        return instance;
    }


    public HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }


    public SearchResultPage getSearchResultPage(WebDriver driver) {
        return new SearchResultPage(driver);
    }
}

